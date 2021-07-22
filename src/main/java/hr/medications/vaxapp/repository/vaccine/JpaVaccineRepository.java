package hr.medications.vaxapp.repository.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface JpaVaccineRepository extends JpaRepository<Vaccine, Long> {
    List<Vaccine> findAll();
    Optional<Vaccine> findByResearchName(String researchName);
}
