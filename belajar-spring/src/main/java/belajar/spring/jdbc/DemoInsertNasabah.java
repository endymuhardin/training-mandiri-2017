package belajar.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoInsertNasabah {
	public static void main(String[] args) {
		ApplicationContext springContainer
		= new ClassPathXmlApplicationContext("belajar-jdbc.xml");
		
		// Data yang mau diinsert
		Nasabah n = new Nasabah();
		n.setNomor("990");
		n.setNama("Nasabah Tester 0");
		n.setEmail("tester990@contoh.com");
		
		NasabahDao nd = springContainer.getBean(NasabahDao.class);
		nd.insert(n);
	}
}
