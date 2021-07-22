package hr.medications.vaxapp.model.vaccine;

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
@Table(name="vaccine")
public class Vaccine {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="research_name")
    private String researchName;
    @Column(name="vaccine_type")
    @Enumerated(EnumType.STRING)
    private VaccineType vaccineType;
    @Column(name="required_number_of_shots")
    private Integer requiredNumberOfShots;
    @Column(name="available_number_of_shots")
    private Integer availableNumberOfShots;
    @OneToMany(mappedBy="vaccine")
    private List<SideEffect> sideEffects;
}
