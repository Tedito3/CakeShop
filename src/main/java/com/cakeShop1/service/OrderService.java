package com.cakeShop1.service;

import java.io.Console;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cakeShop1.entity.Order;
import com.cakeShop1.repository.OrderRepository;

@Service
public class OrderService {

	private OrderRepository orderRepository;
	
	@Autowired
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
		
	}
	
	public Order registerOrders(String clientName,String clientAddress, int phone, Date orderDate, String cakeName, int pieces,String orderNote, double totalAmount) {
		
		if(cakeName.isBlank()  || 
				orderNote.isBlank()  ||
			    clientName.isBlank()) {
			return null;
		}
		Order order = new Order(clientName, clientAddress, phone, orderDate, cakeName, pieces, orderNote, totalAmount);		
		return orderRepository.save(order);
	}
	
	public  Order testMethoda(Date orderDate) {
		return null;
	}
	
	public List<Order> getAll(){
		return orderRepository.findAll();
	}	
	
}
