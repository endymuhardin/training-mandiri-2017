package belajar.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoIocSpring {

	public static void main(String[] args) {
		ApplicationContext springContainer
			= new ClassPathXmlApplicationContext("belajar-ioc.xml");
		
		NasabahDaoIoc nasabahDao = (NasabahDaoIoc) springContainer.getBean("nd");
		nasabahDao.simpan();
	}

}
