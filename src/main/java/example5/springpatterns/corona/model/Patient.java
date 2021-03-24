package example5.springpatterns.corona.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Alexey Druzik on 24.03.2021
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    String age;
    String name;
    String method;
}
