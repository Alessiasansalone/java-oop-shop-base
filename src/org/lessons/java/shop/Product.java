package org.lessons.java.shop;

import java.util.Random;

public class Product {
	
	int code;
	String name;
	String description;
	double price;	
	double iva;
	
	Product (String name, String description) {
		this.name = name;
		this.description = description;
		setCode();
		iva = 1.22;
}

	private void setCode() {
		Random ran = new Random();
		code = ran.nextInt(99999);
	}
	
	public int getCode() {
		setCode();
		return this.code;
	}
	
	private double setPrice() {
		return price;
	}
	
	public double getPrice() {
			return setPrice();
		}
	
	public String getTotalPrice() {
		double totalPrice = price * iva;
		String rounding = String.format("%.2f", totalPrice);
		return rounding;

	}
	
	public String getCompleteName() {
		
		return code + "-" + name;
	}

}