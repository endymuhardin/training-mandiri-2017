package belajar.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("cekPermission")
public class CekPermissionAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation method) throws Throwable {
		String namaMethod = method.getMethod().getName();
		System.out.println("Memeriksa ijin akses untuk menjalankan method "+namaMethod);
		Object hasil = method.proceed();
		return hasil;
	}
	
}
