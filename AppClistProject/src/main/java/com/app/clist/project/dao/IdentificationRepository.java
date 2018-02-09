package com.app.clist.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clist.project.entities.Identification;

public interface IdentificationRepository extends JpaRepository<Identification, Long> {
	
}
