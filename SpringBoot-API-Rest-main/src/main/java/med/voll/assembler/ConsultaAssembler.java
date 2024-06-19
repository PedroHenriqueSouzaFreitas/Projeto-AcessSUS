package med.voll.assembler;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import med.voll.domain.model.Medico;


@AllArgsConstructor
@Component
public class ConsultaAssembler {
    private ModelMapper modelMapper;

    public Consulta toConsulta(final ConsultaInputDTO ConsultaInputDTO) {
        return modelMapper.map(ConsultaInputDTO, Consulta.class);
    }

    public ConsultaOutDTO toDto(final Consulta Consulta) {
        return modelMapper.map(Consulta, ConsultaOutDTO.class);
    }

    public List<ConsultaOutDTO> toCollectionDto(final List<Consulta> people) {
        return people.stream().map(this::toDto).collect(Collectors.toList());
    }
}
