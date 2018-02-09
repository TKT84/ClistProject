package com.app.clist.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.clist.project.entities.UserAdmin;

public interface UserAdminRepository extends JpaRepository<UserAdmin, Long> {

}
