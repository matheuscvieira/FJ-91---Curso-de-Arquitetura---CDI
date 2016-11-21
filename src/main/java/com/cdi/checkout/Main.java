package com.cdi.checkout;

import java.util.concurrent.TimeUnit;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		try (CDI<Object> container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();
			
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread Main: " + threadName);
			
			checkout.fazCheckout();
			
			System.out.println("Checkout Finalizado");
			
			TimeUnit.SECONDS.sleep(15);
			
		}
	}
	
}
