package com.cdi.checkout;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Checkout {

	@Inject
	private MyLogger logger;
	
	@Inject
	private Event<CheckoutEvent> event;
	
	public void fazCheckout() {
		logger.log("Fazendo checkout");
		
		event.fire(new CheckoutEvent("Evento Aconteceu"));
	}
	
}












