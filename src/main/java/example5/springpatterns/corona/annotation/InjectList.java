package example5.springpatterns.corona.annotation;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Alexey Druzik on 24.03.2021
 */
@Retention(RUNTIME)
public @interface InjectList {
    Class[] value();
}
