package com.cdi.checkout;

public class MyLogger {
	
	private Class<?> clazz;

	public MyLogger(Class<?> clazz) {
		this.clazz = clazz;
	}

	public void log(String mensagem) {
		System.out.println("Class: " + clazz.getSimpleName() + " - LOG: " + mensagem);
	}

}
