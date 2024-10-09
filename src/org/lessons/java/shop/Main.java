package org.lessons.java.shop;

public class Main {
	
	public static void main(String[] args) {
		
		Product prod1 = new Product("Red Wine", "This smooth wine features "
				+ "blackberry and cherry notes, with "
				+ "hints of spice. Perfect with roasted "
				+ "meats, it offers a long, elegant finish.");
		prod1.price = 18.89;
		prod1.getCode();
		
		System.out.println("The " + prod1.name + "'s code"
				+ " is " + prod1.code);
		System.out.println("COMPLETE NAME: " + prod1.getCompleteName());
		System.out.println("TOTAL PRICE: " + prod1.getTotalPrice());
		
		Product prod2 = new Product("White wine", "A crisp white wine with notes "
				+ "of green apple and citrus, balanced by refreshing acidity. "
				+ "Perfect for seafood and sunny days!");
		prod2.price = 25.99;
		prod2.getCode();
		
		System.out.println("The " + prod2.name + "'s code"
				+ " is " + prod2.code);
		System.out.println("COMPLETE NAME: " + prod2.getCompleteName());
		System.out.println("TOTAL PRICE: " + prod2.getTotalPrice());
	}
}

