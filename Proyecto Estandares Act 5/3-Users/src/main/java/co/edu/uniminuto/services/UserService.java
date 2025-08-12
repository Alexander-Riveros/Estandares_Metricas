package co.edu.uniminuto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.repository.UsersRepositotyI;

@Service
public class UserService implements UserServiceI{

	//inyecion de dependencia con 
	@Autowired
	UsersRepositotyI dao;
	
	@Override
	public UsersData addUser(UsersData user) {
		//verificar no este duplicados
		if(!(dao.findIdDocument(user.getUseDocument())!= null &&
				dao.findIdEmail(user.getUseEmail())!=null)) {
			return dao.insertUser(user);
			
		}		
		return null;
	}

	@Override
	public UsersData upUser(UsersData user) {
		if(dao.findIdDocument(user.getUseDocument())!= null &&
				dao.findIdUsers(user.getUseId())!= null) {
			return dao.updateUser(user);
			
		}		
		return null;
	}

	@Override
	public int downUser(int id) {
		if (findByIdUsers(id)!= null)
			return dao.deleteUser(id);
		return -1;
	}
	

	@Override
	public UsersData findByIdUsers(int userId) {
		return dao.findIdUsers(userId);
	}

	@Override
	public List<UsersData> listAllUsers() {
		return dao.listUsers();
	}

	@Override
	public UsersData findByIdEmail(String email) {
		return dao.findIdEmail(email);
	}

	@Override
	public UsersData findByIdDocument(String userDocument) {
		return dao.findIdDocument(userDocument);
	}

}
