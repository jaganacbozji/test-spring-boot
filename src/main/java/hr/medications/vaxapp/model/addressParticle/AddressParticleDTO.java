package hr.medications.vaxapp.model.addressParticle;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AddressParticleDTO {
    private String cestica_id;
    private String adresa_opisna;
    private String naselje;
    private Integer naselje_mbr;
    private String ulica;
    private Integer ulica_rbr;
}
