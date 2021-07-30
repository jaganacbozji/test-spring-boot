package hr.medications.vaxapp.repository.addressParticle;

import hr.medications.vaxapp.model.addressParticle.AddressParticle;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class AddressParticleRepositoryImpl implements AddressParticleRepository{
    private final JdbcTemplate jdbc;

    @Override
    public List<AddressParticle> findAll() {
        return null;
    }
}
