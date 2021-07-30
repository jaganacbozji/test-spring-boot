package hr.medications.vaxapp.rest;


import hr.medications.vaxapp.model.addressParticle.AddressParticle;
import hr.medications.vaxapp.model.addressParticle.AddressParticleDTO;
import hr.medications.vaxapp.service.addressParticle.AddressParticleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("address-particle")
@CrossOrigin("http://localhost:4200")
public class AddressParticleController {
    private final AddressParticleService addressParticleService;

    public AddressParticleController(AddressParticleService addressParticleService) {
        this.addressParticleService = addressParticleService;
    }

    @GetMapping
    public List<AddressParticle> getAllAddressParticles() {
        return addressParticleService.findAll();
    }
}
