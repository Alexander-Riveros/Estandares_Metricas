package co.edu.uniminuto.services;

import java.util.List;

import co.edu.uniminuto.entity.UsersData;

public interface UserServiceI {

	UsersData addUser(UsersData user);
	UsersData upUser(UsersData user);
	int downUser (int id);
	UsersData findByIdUsers(int userId);
	List<UsersData> listAllUsers();
	UsersData findByIdEmail (String email);
	UsersData findByIdDocument (String userDocument);	
	
	
}
