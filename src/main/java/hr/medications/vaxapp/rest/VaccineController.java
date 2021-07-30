package hr.medications.vaxapp.rest;

import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;
import hr.medications.vaxapp.model.vaccine.VaccineDTO;
import hr.medications.vaxapp.service.vaccine.VaccineService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vaccine")
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class VaccineController {
    private final VaccineService vaccineService;

    @GetMapping
    public List<VaccineDTO> getAllVaccines() {
        return vaccineService.findAll();
    }


    @GetMapping("/{researchName}")
    public ResponseEntity<VaccineDTO> getByResearchName(@PathVariable final String researchName) {
        return vaccineService.findByResearchName(researchName).map(ResponseEntity::ok).orElseGet(
                () -> ResponseEntity.notFound().build()
        );
    }
}
