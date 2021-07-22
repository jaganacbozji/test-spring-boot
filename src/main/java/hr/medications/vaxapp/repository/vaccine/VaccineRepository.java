package hr.medications.vaxapp.repository.vaccine;

import hr.medications.vaxapp.model.vaccine.Vaccine;

import java.util.Optional;

public interface VaccineRepository {
    Optional<Vaccine> update(Vaccine vaccine);
}
