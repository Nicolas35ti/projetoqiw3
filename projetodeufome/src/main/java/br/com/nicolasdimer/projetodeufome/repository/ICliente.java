package br.com.nicolasdimer.projetodeufome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.nicolasdimer.projetodeufome.model.Cliente;

public interface ICliente extends JpaRepository<Cliente , Integer>{

    public Cliente findBynomeOrEmail(String nome, String email);
    
}
