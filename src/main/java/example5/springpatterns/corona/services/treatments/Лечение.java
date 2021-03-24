package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;

/**
 * @author Alexey Druzik on 24.03.2021
 */
public interface Лечение {
    void применить(Patient patient);

    String АЛКОГОЛЬ = "alcohol";

}
