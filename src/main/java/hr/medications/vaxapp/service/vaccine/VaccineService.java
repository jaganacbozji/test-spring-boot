package hr.medications.vaxapp.service.vaccine;

import hr.medications.vaxapp.model.vaccine.VaccineDTO;

import java.util.List;

public interface VaccineService {
    List<VaccineDTO> findAll();
}
