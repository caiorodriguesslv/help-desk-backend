package com.caio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

	
	
}
