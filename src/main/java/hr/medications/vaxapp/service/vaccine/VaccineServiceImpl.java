package hr.medications.vaxapp.service.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;
import hr.medications.vaxapp.model.vaccine.VaccineDTO;
import hr.medications.vaxapp.repository.vaccine.VaccineRepository;
import hr.medications.vaxapp.service.sideEffect.SideEffectServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VaccineServiceImpl implements VaccineService{
    private final VaccineRepository vaccineRepository;

    public VaccineServiceImpl(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    @Override
    public List<VaccineDTO> findAll() {
        return vaccineRepository.findAll().stream().map(VaccineServiceImpl::mapVaccineToDTOWithoutSideEffectList).collect(Collectors.toList());
    }

    @Override
    public Optional<VaccineDTO> findByResearchName(String researchName) {
        return vaccineRepository.findByResearchName(researchName).map(VaccineServiceImpl::mapVaccineToDTOWithSideEffectList);
    }

    public static VaccineDTO mapVaccineToDTOWithoutSideEffectList(Vaccine vaccine) {
        return new VaccineDTO(vaccine.getResearchName(), vaccine.getVaccineType(), vaccine.getRequiredNumberOfShots(), vaccine.getAvailableNumberOfShots(), null);
    }
    public static VaccineDTO mapVaccineToDTOWithSideEffectList(Vaccine vaccine) {
        return new VaccineDTO(
                vaccine.getResearchName(),
                vaccine.getVaccineType(),
                vaccine.getRequiredNumberOfShots(),
                vaccine.getAvailableNumberOfShots(),
                vaccine.getSideEffects().stream().map(SideEffectServiceImpl::mapSideEffectToDTOWithoutVaccine).collect(Collectors.toList()));
    }


}
