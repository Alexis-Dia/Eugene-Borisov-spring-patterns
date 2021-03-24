package example5.springpatterns.corona.services.treatments;


import example5.springpatterns.corona.model.Patient;

/**
 * @author Alexis-Di
 */
@Treatment(type = Лечение.АЛКОГОЛЬ)
public class Коньяк implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Дышать над коньячными парами в течении часа 4 раза в день перед сном");
    }
}
