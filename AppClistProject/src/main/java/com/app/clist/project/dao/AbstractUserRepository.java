package com.app.clist.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.clist.project.entities.AbstractUser;

public interface AbstractUserRepository extends JpaRepository<AbstractUser, Long> {

}
