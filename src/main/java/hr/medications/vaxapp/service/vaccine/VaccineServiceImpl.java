package hr.medications.vaxapp.service.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;
import hr.medications.vaxapp.model.vaccine.VaccineDTO;
import hr.medications.vaxapp.repository.vaccine.VaccineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VaccineServiceImpl implements VaccineService{
    private final VaccineRepository vaccineRepository;

    public VaccineServiceImpl(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @Override
    public List<VaccineDTO> findAll() {
        return vaccineRepository.findAll().stream().map(this::mapVaccineToDTOWithoutList).collect(Collectors.toList());
    }

    private VaccineDTO mapVaccineToDTOWithoutList(Vaccine vaccine) {
        return new VaccineDTO(vaccine.getResearchName(), vaccine.getVaccineType(), vaccine.getRequiredNumberOfShots(), vaccine.getAvailableNumberOfShots(), null);
    }

}
