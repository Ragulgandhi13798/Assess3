package com.springcoreeg.lifecycle;

public class Tea {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("set price 1");
	}

	public Tea() {
		super();
		
	}

	@Override
	public String toString() {
		return "Tea [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("init method 1");
	}

	public void destroy()
	{
		System.out.println("destroy method 1");
	}
}
