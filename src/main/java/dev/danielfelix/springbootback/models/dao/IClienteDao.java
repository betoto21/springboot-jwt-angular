package dev.danielfelix.springbootback.models.dao;

import dev.danielfelix.springbootback.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
