package example5.springpatterns.corona.services;


import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.doctors.Целитель;

/**
 * @author Alexis-Di
 */
public interface Hospital {
    void register(String type, Целитель целитель);

    void processPatient(Patient patient);
}
