package example5.springpatterns.corona.services;

import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.doctors.DefaultЦелитель;
import example5.springpatterns.corona.services.doctors.Целитель;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alexis-Di
 */
@Service
public class HospitalImpl implements Hospital {

    private Map<String, Целитель> map = new HashMap<>();

    @Override
    public void register(String type, Целитель целитель) {
        map.put(type, целитель);
    }

    @Override
    public void processPatient(Patient patient) {
        Целитель целитель = map.getOrDefault(patient.getMethod(), new DefaultЦелитель());
        целитель.исцелять(patient);

    }
}
