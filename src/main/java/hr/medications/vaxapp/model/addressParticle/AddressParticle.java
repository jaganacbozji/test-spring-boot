package hr.medications.vaxapp.model.addressParticle;

import hr.medications.vaxapp.model.sideEffect.SideEffect;
import hr.medications.vaxapp.model.vaccine.VaccineType;
import lombok.*;

import javax.persistence.*;
import java.util.List;

        import hr.medications.vaxapp.model.sideEffect.SideEffect;
        import lombok.*;

        import javax.persistence.*;
        import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name="\"adrese_cestice\"")
public class AddressParticle {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String gml_id;
    @Column(name="\"cestica_id\"")
    private String cestica_id;
    @Column(name="\"adresa_opisna\"")
    private String adresa_opisna;
    @Column(name="\"naselje\"")
    private String naselje;
    @Column(name="\"naselje_mbr\"")
    private Integer naselje_mbr;
    @Column(name="\"ulica\"")
    private String ulica;
    @Column(name="\"ulica_rbr\"")
    private Integer ulica_rbr;
}
