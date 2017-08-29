package belajar.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import belajar.spring.ioc.RekeningDao;

public class DemoAopSpring {

	public static void main(String[] args) {
		ApplicationContext springContainer
		= new ClassPathXmlApplicationContext("belajar-aop.xml");
	
		RekeningDao rd = springContainer.getBean(RekeningDao.class);
		rd.simpan();
	}

}
