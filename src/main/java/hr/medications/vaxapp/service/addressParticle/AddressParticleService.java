package hr.medications.vaxapp.service.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;

import java.util.List;

public interface AddressParticleService {
    public List<AddressParticleDTO> findAll();
}
