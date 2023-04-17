package com.educandoweb.course1nelio.repositories;

import com.educandoweb.course1nelio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {




}
