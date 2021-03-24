package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Иглоукалывание implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Втыкать иголки на глубину 2 милитра по всему позвоночнику, через полчаса звонить в скорую");
    }
}
