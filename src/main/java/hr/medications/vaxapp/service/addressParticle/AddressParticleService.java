package hr.medications.vaxapp.service.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticle;
import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;

import java.util.List;

public interface AddressParticleService {
    public List<AddressParticle> findAll();
}
