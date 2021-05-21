package com.jessi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessi.springboot.model.Pay;


	public interface PayRepository extends JpaRepository<Pay,Long>
	{
}
