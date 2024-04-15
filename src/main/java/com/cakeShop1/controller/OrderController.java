package com.cakeShop1.controller;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cakeShop1.entity.Order;
import com.cakeShop1.service.OrderService;

@RestController
public class OrderController {
	
	private OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}	
	
	@PostMapping(path = "/orderRegister")
	public Order /*Entity*/ register( @RequestParam(value = "orderDate") Date orderDate,
			                    @RequestParam(value = "clientName") String clientName,
			                    @RequestParam(value = "cakeName") String cakeName,
			                    @RequestParam(value = "pieces") int pieces,
			                    @RequestParam(value = "clientAddress") String clientAddress,
			                    @RequestParam(value = "phone") int phone,
			                    @RequestParam(value = "orderNote") String orderNote,
								@RequestParam(value = "totalAmount") double totalAmount) {
		
		
		return orderService.registerOrders(clientName, clientAddress, phone, orderDate, cakeName, pieces, orderNote, totalAmount);	
		
		
	}
	

}

