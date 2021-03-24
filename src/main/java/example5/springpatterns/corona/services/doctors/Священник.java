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
public class Священник implements Целитель {

    @Autowired
    List<Лечение> устаревшиеМетоды;

    @Override
    public void исцелять(Patient patient) {
        устаревшиеМетоды.forEach(лечение -> лечение.применить(patient));
    }

    @Override
    public String myType() {
        return "релегия";
    }
}
