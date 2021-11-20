package back.people.register.backpeopleregister.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "log")
@AllArgsConstructor
@Data
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String date;
    private String hour;
    private String rolName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Person person;

    public Log() {
    }
}
