package com.cakeShop1.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")

public class Order {
    @Id
	@Column(name = "orderId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    
    @Column(name = "clientName", nullable = false)
    private String clientName;
    
    @Column(name = "clientAddress", nullable = false)
    private String clientAddress;
    
    @Column(name = "phone", nullable = false)
    private int phone;
    
    @Column(name = "orderDate", nullable = false)
    private Date orderDate;
    
    @Column(name = "cakeName", nullable = false)
    private String cakeName;
    
    @Column(name = "pieces", nullable = false)
    private int pieces;
    
    @Column(name = "orderNote", nullable = false)
    private String orderNote;

    
    @Column(name = "totalAmount", nullable = false)
    private double totalAmount;
    
    public Order() {
    }
    
    @Autowired
    public Order(String clientName,String clientAddress, int phone, Date orderDate, String cakeName, int pieces,String orderNote, double totalAmount) {
        this.clientName = clientName;
        this.orderDate = orderDate;
        this.cakeName = cakeName;
        this.pieces = pieces;
        this.clientAddress = clientAddress;
        this.phone = phone;
        this.orderNote = orderNote;
        this.totalAmount = totalAmount;
    }

	

    public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public String getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
    public String toString() {
        return  "Orders { " +
                " ClientName = '" + clientName + '\'' +
                ", OrderDate = " + orderDate +
                ", ClientAddress = " + clientAddress +
                ", Phone = " + phone +
                ", CakeName = " + cakeName +
                ", Pieces = " + pieces +
                ", Note = " + orderNote +
                ", TotalAmount = " + totalAmount +
                '}';
    }

	

    // Getters and setters
    
}