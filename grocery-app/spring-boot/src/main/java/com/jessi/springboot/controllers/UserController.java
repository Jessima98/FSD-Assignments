package com.jessi.springboot.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jessi.springboot.repository.*;

import org.springframework.web.bind.annotation.*;
import com.jessi.springboot.model.*;

@RestController

@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
   
public class UserController {

	@Autowired
	private UserRepository userRepository;

//	@PostMapping("/login")
//    public Status loginUser( @RequestBody User user) {
//        List<User> users = userRepository.findAll();
//        for (User other : users) {
//            if (other.equals(user)) {
//             
//              
//                return Status.SUCCESS;
//            }
//        }
//        return Status.FAILURE;
//    }
	  
	@GetMapping("/get")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	   
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public User deleteUser(@PathVariable("id") long id) {
		User user = userRepository.getOne(id);
		userRepository.deleteById(id);
		return user;
	}

}