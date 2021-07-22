package hr.medications.vaxapp.service.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;
import hr.medications.vaxapp.model.vaccine.VaccineDTO;
import hr.medications.vaxapp.repository.vaccine.JpaVaccineRepository;
import hr.medications.vaxapp.service.sideEffect.SideEffectServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VaccineServiceImpl implements VaccineService {
    private final JpaVaccineRepository jpaVaccineRepository;

    public VaccineServiceImpl(JpaVaccineRepository jpaVaccineRepository) {
        this.jpaVaccineRepository = jpaVaccineRepository;
    }

    @Override
    public List<VaccineDTO> findAll() {
        return jpaVaccineRepository.findAll().stream().map(VaccineServiceImpl::mapVaccineToDTO).collect(Collectors.toList());
    }

    @Override
    public Optional<VaccineDTO> findByResearchName(String researchName) {
        return jpaVaccineRepository.findByResearchName(researchName).map(VaccineServiceImpl::mapVaccineToDTO);
    }

    public static VaccineDTO mapVaccineToDTO(Vaccine vaccine) {
        return new VaccineDTO(
                vaccine.getResearchName(),
                vaccine.getVaccineType(),
                vaccine.getRequiredNumberOfShots(),
                vaccine.getAvailableNumberOfShots(),
                vaccine.getSideEffects().stream().map(SideEffectServiceImpl::mapSideEffectToDTO).collect(Collectors.toList()));
    }


}
