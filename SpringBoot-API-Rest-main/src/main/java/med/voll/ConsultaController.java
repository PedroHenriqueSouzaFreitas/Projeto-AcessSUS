package med.voll.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.domain.model.Consulta;
import med.voll.domain.service.ConsultaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaService consultaService;
    
    @PostMapping("path")
    public String postMethodNameS(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;

}

    ("/agendar")
    public Consulta agendarConsulta(@RequestBody Consulta consulta) {
        return consultaService.agendarConsulta(consulta);
    }
    
    @GetMapping("/listar")
    public List<Consulta> listarConsultas() {
        return consultaService.listarConsultas();
    }
    
    // Outros endpoints REST conforme necessário
}