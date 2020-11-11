package main.java.com.javainuse.db;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.javainuse.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}