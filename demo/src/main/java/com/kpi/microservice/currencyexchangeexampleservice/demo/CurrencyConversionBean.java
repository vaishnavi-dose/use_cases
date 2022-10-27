package com.kpi.microservice.currencyexchangeexampleservice.demo;

import java.math.BigDecimal;

public class CurrencyConversionBean 
{
	private Long id;
	private String from;  
	private String to;  
	private double ConversionMultiple;  
	private double quantity;  
	private double totalCalculatedAmount;  
	private int port; 
	
	//default constructor  
	public CurrencyConversionBean()  
	{     
		
	}  
	
	//creating constructor
	public CurrencyConversionBean(Long id, String from, String to, double conversionMultiple, double quantity,
			double totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		ConversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	
	//creating setters and getters  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getConversionMultiple() {
		return ConversionMultiple;
	}
	public void setConversionMultiple(double conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
