package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Дым implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("нюхать дым, стучать в барабан до полного исцеления");
    }
}
