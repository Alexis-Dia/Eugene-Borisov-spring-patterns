package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Баня implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("три захода в баню, по 10 минут при температуре в 3 раза превышающей температуру тела");
    }
}
