package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.name = "Red Wine";
		prod1.description = "This smooth wine features "
				+ " blackberry and cherry notes, with "
				+ " hints of spice. Perfect with roasted "
				+ " meats, it offers a long, elegant finish.";
		prod1.price = 18.89;
		prod1.setCode();
		
		System.out.println("The " + prod1.name + "'s code"
				+ " is " + prod1.code);
		System.out.println("COMPLETE NAME: " + prod1.getCompleteName());
		System.out.println("TOTAL PRICE: " + prod1.getTotalPrice());
	}

}
