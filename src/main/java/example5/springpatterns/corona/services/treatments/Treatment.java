package example5.springpatterns.corona.services.treatments;/**
 * @author Alexis-Di
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Component
@Qualifier
@Autowired
public @interface Treatment {
    String type();
}
