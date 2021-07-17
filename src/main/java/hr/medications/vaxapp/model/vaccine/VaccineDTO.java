package hr.medications.vaxapp.model.vaccine;

import hr.medications.vaxapp.model.sideEffect.SideEffectDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class VaccineDTO {
    private String researchName;
    private VaccineType vaccineType;
    private Integer requiredNumberOfShots;
    private Integer availableNumberOfShots;
    private List<SideEffectDTO> sideEffects;
}
