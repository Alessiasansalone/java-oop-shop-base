package org.lessons.java.shop;

import java.util.Random;

public class Product {
	
	int code;
	String name;
	String description;
	double price;	
	double iva = 0.22;


	void setCode() {
		
		Random ran = new Random();
		code = ran.nextInt(99999);
	}
	
	double getBasePrice() {
		
		return price;
	}
	
	double getTotalPrice() {
		
		return (price * iva) + price;
	}
	
	String getCompleteName() {
		
		return code + "-" + name;
	}

}