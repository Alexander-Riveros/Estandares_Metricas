package co.edu.uniminuto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniminuto.entity.UsersData;
import co.edu.uniminuto.services.UserServiceI;

@RestController
@RequestMapping(value = "conuse")
public class UsersController {

	// validaciones de datos a travez de experesiones

	@Autowired
	UserServiceI service;

	@GetMapping(value = "users")
	public List<UsersData> getAllUsersData() {
		return service.listAllUsers();
	}

	@GetMapping(value = "users-id")
	public UsersData getByUserData(@RequestParam("id") int userId) {
		return service.findByIdUsers(userId);
	}

	@GetMapping(value = "users-doc")
	public UsersData getByUserDoc(@RequestParam("document") String userDocument) {
		return service.findByIdDocument(userDocument);
	}

	@GetMapping(value = "users-email")
	public UsersData getByUserData(@RequestParam("email") String email) {
		return service.findByIdEmail(email);
	}

	@PostMapping(value = "users")
	public UsersData postUser(@RequestBody UsersData user) {
		return service.addUser(user);
	}
	
	@PutMapping(value = "users")
	public UsersData putUser(@RequestBody UsersData user) {
		return service.addUser(user);
	}
	
	@DeleteMapping(value = "users")
	public Integer deleteUser(@RequestParam("id") int id) {
		return service.downUser(id);
	}
	
}
