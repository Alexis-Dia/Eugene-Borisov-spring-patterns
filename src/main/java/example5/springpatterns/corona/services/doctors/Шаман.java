package example5.springpatterns.corona.services.doctors;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Шаман implements Целитель {

    @Override
    public void исцелять(Patient patient) {
        System.out.println("бей в бубен громче!!!");
    }

    @Override
    public String myType() {
        return "магия";
    }
}
