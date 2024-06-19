package med.voll.assembler;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import med.voll.domain.model.Paciente;

@AllArgsConstructor
@Component
public class PacienteAssembler {
    
    private ModelMapper modelMapper;

    public Paciente toPaciente(final PacienteInputDTO PacienteInputDTO) {
        return modelMapper.map(pacienteInputDTO, Paciente.class);
    }

    public PacienteOutDTO toDto(final Paciente Paciente) {
        return modelMapper.map(Paciente, PacienteOutDTO.class);
    }

    public List<PacienteOutDTO> toCollectionDto(final List<Paciente> people) {
        return people.stream().map(this::toDto).collect(Collectors.toList());
    }

}
