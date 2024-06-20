package med.voll.domain.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumerosEmergencia {
    
    @NotBlank
    private int numeroPolicia;

    @NotBlank
    private int numeroSUS;

    @NotBlank
    private int numeroBombbeiro;

    @NotBlank
    private int numeroSAMU;

}


