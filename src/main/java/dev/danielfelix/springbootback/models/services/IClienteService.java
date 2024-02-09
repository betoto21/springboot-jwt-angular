package dev.danielfelix.springbootback.models.services;

import dev.danielfelix.springbootback.models.entity.Cliente;

import java.util.List;


public interface IClienteService {

    public List<Cliente> findAll();
}
