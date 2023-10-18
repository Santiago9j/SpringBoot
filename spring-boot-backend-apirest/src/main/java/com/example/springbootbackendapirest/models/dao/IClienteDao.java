package com.example.springbootbackendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootbackendapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

    
    
}
