package com.jessi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessi.springboot.model.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery, Long> {

}
