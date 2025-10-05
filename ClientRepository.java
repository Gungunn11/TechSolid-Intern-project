package com.crud.productapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.productapp.models.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {

	public Client findByEmail(String email);
}
