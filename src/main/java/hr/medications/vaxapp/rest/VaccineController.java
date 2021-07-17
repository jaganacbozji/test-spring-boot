package hr.medications.vaxapp.rest;

import hr.medications.vaxapp.model.vaccine.VaccineDTO;
import hr.medications.vaxapp.service.vaccine.VaccineService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("vaccine")
@CrossOrigin("http://localhost:4200")
public class VaccineController {
    private final VaccineService vaccineService;

    public VaccineController(VaccineService vaccineService) {
        this.vaccineService = vaccineService;
    }

    @GetMapping
    public List<VaccineDTO> getAllVaccines() { return vaccineService.findAll(); }

}
