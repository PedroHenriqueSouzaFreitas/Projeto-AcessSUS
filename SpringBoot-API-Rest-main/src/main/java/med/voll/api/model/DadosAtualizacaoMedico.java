package med.voll.api.model;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull // não é string portanto não é um @notblank
        Long id,
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco
) {

}
