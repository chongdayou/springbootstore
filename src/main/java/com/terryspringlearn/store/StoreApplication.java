package com.terryspringlearn.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// springboot run() will return an object called ConfigurableApplicationContext
		// we can put "beans" into this object and get them like below
		// a bean is basically an object, but it is managed by springboot instead of coded by developer
		// beans are created and managed by the springboot IOC container
		// see OrderService.java for an example of a bean
		ApplicationContext context= SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
