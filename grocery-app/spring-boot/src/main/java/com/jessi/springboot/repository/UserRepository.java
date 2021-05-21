package com.jessi.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jessi.springboot.model.User;
public interface UserRepository extends JpaRepository<User, Long> {

}


