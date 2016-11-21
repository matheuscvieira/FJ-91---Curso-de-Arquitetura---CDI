package com.cdi.checkout;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Auditavel
public class AuditoriaInterceptor {

	@AroundInvoke
	public Object audita(InvocationContext ic) throws Exception {
		Auditavel annotation = ic.getMethod().getAnnotation(Auditavel.class);
		boolean isValido = annotation != null && annotation.customMessage() != null && !annotation.customMessage().isEmpty();
		if (isValido) {
			String mensagem = annotation.customMessage();
			System.out.println("Auditando antes..: " + mensagem);
		} else {
			System.out.println("Auditando antes..");
		}
		
		Object resultado = ic.proceed(); //iniciaPagamento
		
		System.out.println("Auditando depois..");
		
		return resultado;
	}
	
}
