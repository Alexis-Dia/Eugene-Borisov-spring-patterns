package example5.springpatterns.corona.services.doctors;

import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.treatments.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Alexis-Di
 */
@Component
public class Врач implements Целитель {
    @Autowired
    private List<Лечение> лечениеs;

    private int currentЛечение;

    @Override
    public void исцелять(Patient patient) {
        if (currentЛечение == лечениеs.size()) {
            currentЛечение = 0;
        }
        Лечение лечение = лечениеs.get(currentЛечение++);
        System.out.println("сегодня попробуем: "+лечение.getClass().getSimpleName());
        лечение.применить(patient);
    }

    @Override
    public String myType() {
        return Целитель.ТРАДИЦИОННАЯ;
    }
}

