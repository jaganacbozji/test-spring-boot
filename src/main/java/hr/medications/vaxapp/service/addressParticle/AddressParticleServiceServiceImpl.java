package hr.medications.vaxapp.service.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;
import hr.medications.vaxapp.repository.addressParticle.AddressParticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressParticleServiceServiceImpl implements AddressParticleService {
    private final AddressParticleRepository addressParticleRepository;

    @Override
    public List<AddressParticleDTO> findAll() {
        return addressParticleRepository.findAll().stream().map();


    }
}
