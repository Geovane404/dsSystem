package com.gtecnologia.appStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtecnologia.appStore.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
