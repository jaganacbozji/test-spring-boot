package hr.medications.vaxapp.repository.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressParticleRepository extends JpaRepository<AddressParticle, Long> {
     List<AddressParticle> findAll();
}
