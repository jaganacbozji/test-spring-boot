package hr.medications.vaxapp.service.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticle;
import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;
import hr.medications.vaxapp.repository.addressParticle.AddressParticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AddressParticleServiceServiceImpl implements AddressParticleService {
    private final AddressParticleRepository addressParticleRepository;

    @Override
    public List<AddressParticle> findAll() {
        return addressParticleRepository.findAll();
    }

//    private AddressParticleDTO mapAddressListToDTO(AddressParticle addressParticle) {
//        return new AddressParticleDTO(addressParticle.getCestica_id(), addressParticle.getAdresa_opisna(), addressParticle.getNaselje(), addressParticle.getNaselje_mbr(),
//                addressParticle.getUlica(), addressParticle.getUlica_rbr());
//    }
}
