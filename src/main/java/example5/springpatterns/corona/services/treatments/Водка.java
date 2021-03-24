package example5.springpatterns.corona.services.treatments;


import example5.springpatterns.corona.model.Patient;

/**
 * @author Alexis-Di
 */

@Treatment(type = Лечение.АЛКОГОЛЬ)
public class Водка implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("100 грамм водки внутрь, три раза перед каждой едой");
    }
}
