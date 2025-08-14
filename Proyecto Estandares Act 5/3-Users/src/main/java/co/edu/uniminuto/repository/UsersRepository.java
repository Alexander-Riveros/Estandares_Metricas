package co.edu.uniminuto.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.jpa.jpaUsers;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UsersRepository implements UsersRepositotyI {

	
	@Autowired
	jpaUsers jpaUser;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public UsersData insertUser(UsersData user) {
		
		return jpaUser.save(user);
	}

	@Override
	public UsersData updateUser(UsersData user) {
		
		return jpaUser.save(user);
	}

	@Override
	@Transactional
	public int deleteUser(int id) {
		String jpql ="UPDATE UsersData u SET u.useStatus = '0' WHERE u.useId= :id";
		int updated =entityManager.createQuery(jpql)
				.setParameter("id", id)
				.executeUpdate();
		return updated >0 ? id: -1;
	}

	
	@Override
	public UsersData findIdUsers(int userId) {
		
		return jpaUser.findById(userId).orElse(null);
	}
	
	@Override
	public List<UsersData> listUsers() {
		
		return jpaUser.findAll();
	}

	@Override
	public UsersData findIdEmail(String email) {
		
		return jpaUser.findByUseEmail(email);
	}

	@Override
	public UsersData findIdDocument(String userDocument) {

		return jpaUser.findByUseDocument(userDocument);
	}


}
