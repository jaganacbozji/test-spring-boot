package hr.medications.vaxapp.service.sideEffect;

import hr.medications.vaxapp.model.sideEffect.SideEffect;
import hr.medications.vaxapp.model.sideEffect.SideEffectDTO;

public class SideEffectServiceImpl {

    public static SideEffectDTO mapSideEffectToDTOWithoutVaccine(SideEffect sideEffect) {
        return new SideEffectDTO(sideEffect.getShortDescription(), sideEffect.getLongDescription(), sideEffect.getFrequency(), null);
    }

}
