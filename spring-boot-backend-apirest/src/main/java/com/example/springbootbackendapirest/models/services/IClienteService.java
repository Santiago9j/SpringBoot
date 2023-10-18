package com.example.springbootbackendapirest.models.services;


import com.example.springbootbackendapirest.models.entity.Cliente;

public interface IClienteService {

    public java.util.List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);

}
