package hr.medications.vaxapp.model.sideEffect;


import hr.medications.vaxapp.model.vaccine.Vaccine;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SideEffectDTO {
    private String shortDescription;
    private String longDescription;
    private Double frequency;
}
