package example5.springpatterns.corona.services.doctors;

import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.treatments.Лечение;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author Alexis-Di
 */
@Component
public class DefaultЦелитель implements Целитель {
    @Autowired
    private List<Лечение> всеЛечения;

    private Random random = new Random();

    @Override
    public void исцелять(Patient patient) {
//        всеЛечения.get(random.nextInt(всеЛечения.size())).применить(patient);
        System.out.println("само пройдёт");
    }

    @Override
    public String myType() {
        return "default";
    }
}
