package med.voll.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.domain.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
