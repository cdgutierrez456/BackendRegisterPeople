package back.people.register.backpeopleregister.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "person")
@AllArgsConstructor
@Data
public class Person {
    @Id
    private String id;
    private String name;
    private String last_name;
    private String email;

    public Person() {
    }
}
