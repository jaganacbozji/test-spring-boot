package hr.medications.vaxapp.model.sideEffect;


import hr.medications.vaxapp.model.vaccine.Vaccine;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name="side_effect")
public class SideEffect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="short_description")
    private String shortDescription;
    @Column(name="long_description")
    private String longDescription;
    @Column(name="frequency")
    private Double frequency;
    @ManyToOne
    private Vaccine vaccine;
}
