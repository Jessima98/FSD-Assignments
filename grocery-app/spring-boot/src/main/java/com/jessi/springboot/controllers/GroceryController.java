package com.jessi.springboot.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jessi.springboot.model.Grocery;
import com.jessi.springboot.repository.GroceryRepository;
@RestController
@RequestMapping(path = "grocery")
@CrossOrigin(origins = "http://localhost:4200")
public class GroceryController {
	
	private byte[] bytes;
	@Autowired
	private GroceryRepository groceryRepository;
	  
	@GetMapping("/get")
	public List<Grocery> getGrocery() {
		return groceryRepository.findAll();
	}

	@PostMapping("/upload")
	public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		this.bytes = file.getBytes();
	}
	 
	@PostMapping("/add")
	public void createGrocery(@RequestBody Grocery grocery) throws IOException {
		grocery.setPicByte(this.bytes);
		groceryRepository.save(grocery);
		this.bytes = null;
	}
   
	@PutMapping("/update")
	public void updateGrocery(@RequestBody  Grocery grocery) {
		groceryRepository.save(grocery);
	}
	 
	@DeleteMapping(path = { "/{id}" })
	public Grocery deleteGrocery(@PathVariable("id") long id) {
		Grocery grocery = groceryRepository.getOne(id);
		groceryRepository.deleteById(id);
		return grocery;
	}
	
	@PutMapping("/update1")
	public void updateGrocery1(@RequestBody  Grocery grocery) {
		groceryRepository.save(grocery);
	}
}
