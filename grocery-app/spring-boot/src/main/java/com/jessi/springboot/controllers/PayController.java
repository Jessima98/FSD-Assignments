package com.jessi.springboot.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jessi.springboot.repository.*;

import org.springframework.web.bind.annotation.*;
import com.jessi.springboot.model.*;

@RestController
@RequestMapping(path = "pay")
@CrossOrigin(origins = "http://localhost:4200")
public class PayController {
	@Autowired
	private PayRepository payRepository;
	@PutMapping("/update")
	public void updatePay(@RequestBody  Pay pay) {
		payRepository.save(pay);
	}
	@GetMapping("/get")
	public List<Pay> getPay() {
		return payRepository.findAll();
	}
	@PostMapping("/add")
	public void createPay(@RequestBody Pay pay) {
		payRepository.save(pay);
	}
}
	
	
	