package hr.medications.vaxapp.service.vaccine;

import hr.medications.vaxapp.model.vaccine.VaccineDTO;

import java.util.List;
import java.util.Optional;

public interface VaccineService {
    List<VaccineDTO> findAll();
    Optional<VaccineDTO> findByResearchName(String researchName);
}
