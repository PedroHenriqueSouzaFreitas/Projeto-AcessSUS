package med.voll.api.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumerosEmergenciaOutDTO {

    
    private Long id;
    private List<String> nomes ;
    private List<String> numeros;
    private String descricao;




public NumerosEmergenciaOutDTO(){}

public NumerosEmergenciaOutDTO(Long id, String nome, int numero, String descricao)
{

    this.id = id;
    this.nomes = nomes;
    this.numeros = numeros;
    this.descricao = descricao;

}  

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public List<String> getNomes() {
    return nomes;
}

public void setNomes(List<String> nomes) {
    this.nomes = nomes;
}

public List<String> getNumbers() {
    return numeros;
}

public void setNumeros(List<String> numeros) {
    this.numeros = numeros;
}

public String getDescription() {
    return descricao;
}

public void setDescription(String descricao) {
    this.descricao = descricao;
}

// toString() para facilitar a exibição dos dados
@Override
public String toString() {
    return "EmergencyNumberDTO{" +
            "id=" + id +
            ", name='" + nomes + '\'' +
            ", numbers=" + numeros +
            ", description='" + descricao + '\'' +
            '}';

}
}