package example5.springpatterns.corona.bpp;

import example5.springpatterns.corona.annotation.InjectList;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.reflections.ReflectionUtils;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Alexey Druzik on 24.03.2021
 */
public class InjectListBPP implements BeanPostProcessor {
    @Autowired
    private ApplicationContext context;

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Set<Field> allFields = ReflectionUtils.getAllFields(bean.getClass(), field -> field.isAnnotationPresent(InjectList.class));
        for(Field field: allFields){
            InjectList annotation = field.getAnnotation((InjectList.class));
            List<Object> list = Arrays.stream(annotation.value())
                .map(aClass -> Introspector.decapitalize(aClass.getSimpleName()))
                .map(name -> context.getBean(name))
                .collect(Collectors.toList());
            field.setAccessible(true);
            field.set(bean, list);
        }
        return bean;
    }
}
