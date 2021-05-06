package com.springcoreeg.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coffee implements InitializingBean,DisposableBean {
    private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("set the price ");
	}

	public Coffee() {
		super();
	
	}

	@Override
	public String toString() {
		return "Coffee [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method: init");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroy method: destroy");
		
	}
    
    
}
