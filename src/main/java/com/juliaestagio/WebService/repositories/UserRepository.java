package com.juliaestagio.WebService.repositories;

import com.juliaestagio.WebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
