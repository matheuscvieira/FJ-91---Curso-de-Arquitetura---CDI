package com.cdi.checkout;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Estoque {

	@Inject
	private MyLogger logger;
	
	public void remove(@Observes CheckoutEvent event) {
		logger.log("Removendo do Estoque..: " + event.getMensagem());
	}

}
