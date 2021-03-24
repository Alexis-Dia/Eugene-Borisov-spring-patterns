package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Амулет implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Носить на шее маску. Не снимать ни в душе ни во сне");
    }
}
