package com.app.clist.project.dao;

import com.app.clist.project.entities.UserAdmin;

public interface UserAdminDao extends Dao<UserAdmin, Long> {

	UserAdmin findByIdentification(String username, String password);

	Object findByEmail(String email);

}