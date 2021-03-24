package example5.springpatterns.corona.controllers;

import example5.springpatterns.corona.model.Patient;
import example5.springpatterns.corona.services.Hospital;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alexis-Di
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/corona/")
public class CoronaMainController {
    private final Hospital hospital;

    @PostMapping("treat")
    public Patient treat(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }

}
