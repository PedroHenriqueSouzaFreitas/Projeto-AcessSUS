package med.voll.assembler;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import med.voll.domain.model.Medico;
import med.voll.domain.model.Paciente;

@AllArgsConstructor
@Component
public class MedicoAssembler {
    
      private ModelMapper modelMapper;

    public Medico toMedico(final MedicoInputDTO MedicoInputDTO) {
        return modelMapper.map(medicoInputDTO, Medico.class);
    }

    public MedicoOutDTO toDto(final Medico Medico) {
        return modelMapper.map(medico, MedicoOutDTO.class);
    }

    public List<MedicoOutDTO> toCollectionDto(final List<Medico> people) {
        return people.stream().map(this::toDto).collect(Collectors.toList());
    }

}
