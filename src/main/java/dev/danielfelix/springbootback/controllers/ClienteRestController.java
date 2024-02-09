package dev.danielfelix.springbootback.controllers;

import dev.danielfelix.springbootback.models.entity.Cliente;
import dev.danielfelix.springbootback.models.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private ClienteServiceImpl clienteService;
    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }

}
