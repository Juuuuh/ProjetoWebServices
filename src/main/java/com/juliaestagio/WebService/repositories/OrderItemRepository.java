package com.juliaestagio.WebService.repositories;

import com.juliaestagio.WebService.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
