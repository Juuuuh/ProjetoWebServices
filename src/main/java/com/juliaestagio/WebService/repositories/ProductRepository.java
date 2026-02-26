package com.juliaestagio.WebService.repositories;

import com.juliaestagio.WebService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
