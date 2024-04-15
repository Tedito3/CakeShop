package com.cakeShop1.repository;
import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cakeShop1.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	Order findByOrderDate(Date orderDate);
	Order findByClientName(String clientName);
	Order findByCakeName(String cakeName);
	Order findByPieces(int pieces);
	Order findByClientAddress(String clientAddress);
	Order findByPhone(int phone);
	Order findByOrderNote(String orderNote);
	Order findByTotalAmount(double totalAmount);
    List<Order> findAll();
    
}

