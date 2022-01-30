package com.gtecnologia.appStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtecnologia.appStore.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
