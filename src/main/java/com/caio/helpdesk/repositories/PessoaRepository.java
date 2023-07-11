package com.caio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	
	
}
