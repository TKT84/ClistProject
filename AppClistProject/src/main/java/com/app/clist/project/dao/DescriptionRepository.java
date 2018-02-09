package com.app.clist.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.clist.project.entities.Description;

public interface DescriptionRepository extends JpaRepository<Description, Long>{
	
//	@Query()
//	Description findByProductKeyword(String keyword);

}
