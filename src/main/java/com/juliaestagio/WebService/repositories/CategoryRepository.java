package com.juliaestagio.WebService.repositories;

import com.juliaestagio.WebService.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
