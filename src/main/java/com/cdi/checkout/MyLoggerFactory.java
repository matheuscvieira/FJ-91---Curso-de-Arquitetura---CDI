package com.cdi.checkout;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MyLoggerFactory {

	@Produces
	public MyLogger create(InjectionPoint ip) {
		Class<?> declaringClass = ip.getMember().getDeclaringClass();
		
		return new MyLogger(declaringClass);
	}
	
}
