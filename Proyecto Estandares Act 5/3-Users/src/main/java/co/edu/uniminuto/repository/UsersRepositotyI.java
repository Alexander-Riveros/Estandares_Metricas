package co.edu.uniminuto.repository;

import java.util.List;

import co.edu.uniminuto.entity.UsersData;

public interface UsersRepositotyI {

	UsersData insertUser(UsersData user);
	UsersData updateUser(UsersData user);
	int deleteUser (int id);
	UsersData findIdUsers(int userId);
	List<UsersData> listUsers();
	UsersData findIdEmail (String email);
	UsersData findIdDocument (String userDocument);	
}
