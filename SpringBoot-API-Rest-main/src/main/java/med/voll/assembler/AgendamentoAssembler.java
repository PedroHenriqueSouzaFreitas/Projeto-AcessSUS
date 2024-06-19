package med.voll.assembler;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import med.voll.domain.model.Agendamento;


@AllArgsConstructor
@Component
public class AgendamentoAssembler {
    
    private ModelMapper modelMapper;

    public Agendamento toAgendamento(final AgendamentoInputDTO AgendamentoInputDTO) {
        return modelMapper.map(AgendamentoInputDTO, Agendamento.class);
    }

    public AgendamentoOutDTO toDto(final Agendamento Agendamento) {
        return modelMapper.map(Agendamento, AgendamentoOutDTO.class);
    }

    public List<AgendamentoOutDTO> toCollectionDto(final List<Agendamento> people) {
        return people.stream().map(this::toDto).collect(Collectors.toList());
    }

}
