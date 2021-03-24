package example5.springpatterns.corona.services.doctors;


import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.Hospital;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Alexis-Di
 */
public interface Целитель {
    void исцелять(Patient patient);

    @Autowired
    default void regMe(Hospital hospital){
        hospital.register(myType(),this);
    }

    String myType();

    String ТРАДИЦИОННАЯ = "traditional";
    String НАРОДНАЯ = "folk";
}
