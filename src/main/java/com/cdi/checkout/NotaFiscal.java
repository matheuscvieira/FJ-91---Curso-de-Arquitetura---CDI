package com.cdi.checkout;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class NotaFiscal {

	@Inject
	private MyLogger logger;
	
	@Auditavel
	public void emite(@Observes CheckoutEvent event) throws InterruptedException {
		logger.log("Emitindindo nota...: " + event.getMensagem());
		
		logger.log("Nota emitida");
	}
	
}
