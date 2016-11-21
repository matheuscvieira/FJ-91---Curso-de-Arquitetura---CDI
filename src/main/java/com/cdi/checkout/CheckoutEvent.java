package com.cdi.checkout;

public class CheckoutEvent {

	private String mensagem;

	public CheckoutEvent(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
}
