select
    p.nome AS paciente,
    p.endereco,
    m.nome AS medico_responsavel,
    m.especialidade
from 
    paciente p
join 
    medico m ON p.id_medico = m.id;