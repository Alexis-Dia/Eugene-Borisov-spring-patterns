package example5.springpatterns.corona.services.doctors;

import example5.springpatterns.corona.annotation.InjectList;
import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.treatments.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Alexis-Di
 */
@Component(Целитель.НАРОДНАЯ)
public class Знахарь implements Целитель {

    @InjectList({Водка.class, Баня.class, Банки.class, Чеснок.class})
    private List<Лечение> лечениеs;

    @Override
    public void исцелять(Patient patient) {
        System.out.println("определяю лечение...");
        лечениеs.forEach(лечение -> лечение.применить(patient));
    }

    @Override
    public String myType() {
        return "folk";
    }
}
