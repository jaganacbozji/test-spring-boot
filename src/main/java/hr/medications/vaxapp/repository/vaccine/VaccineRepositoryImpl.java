package hr.medications.vaxapp.repository.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class VaccineRepositoryImpl implements VaccineRepository {

    private final JdbcTemplate jdbc;

    @Override
    public Optional<Vaccine> update(Vaccine vaccine) {
        int executed = jdbc.update("UPDATE vaccine SET " +
                        "research_name = ?, " +
                        "vaccine_type = ?, " +
                        "required_number_of_shots = ?, " +
                        "available_number_of_shots = ? " +
                        "WHERE research_name = ?",
                vaccine.getResearchName(),
                vaccine.getVaccineType().toString(),
                vaccine.getRequiredNumberOfShots(),
                vaccine.getAvailableNumberOfShots(),
                vaccine.getResearchName());

        if(executed > 0) {
            return Optional.of(vaccine);
        } else {
            return Optional.empty();
        }
    }

}
