package back.people.register.backpeopleregister.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "facial_info")
@AllArgsConstructor
@Data
public class FacialInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String frontalImg;
    private String rightImg;
    private String leftImg;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Person person;

    public FacialInfo() {
    }

}
