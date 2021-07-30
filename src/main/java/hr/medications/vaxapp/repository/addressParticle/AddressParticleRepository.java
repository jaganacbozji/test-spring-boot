package hr.medications.vaxapp.repository.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticle;

import java.util.List;

public interface AddressParticleRepository {
     List<AddressParticle> findAll();
}
