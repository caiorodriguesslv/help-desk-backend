package com.caio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

	
	
}
