package com.juliaestagio.WebService.repositories;

import com.juliaestagio.WebService.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
