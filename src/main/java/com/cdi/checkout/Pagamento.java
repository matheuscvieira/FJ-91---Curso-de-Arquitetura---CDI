package com.cdi.checkout;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Pagamento {

	@Inject
	private MyLogger logger;

	@Auditavel(customMessage = "Critico")
	public void iniciaPagamento(@Observes CheckoutEvent event) {
		logger.log("Iniciando Pagamento: " + event.getMensagem());
		
		System.out.println("Iniciando pagamento");
	}
	
}
