# Intro Spring Framework

* [Spring Framework Reference Manual](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)

## Inversion of Control ##

![Skema IOC](img/inversion-of-control.jpg)

### Tanpa IoC ###

```java
public class NasabahDaoTanpaIoC {
	private KoneksiDatabase koneksiDatabase;
	
	public NasabahDaoTanpaIoC() {
		koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
	}
	
	private void connect() {
		koneksiDatabase.connect();
	}
}
```

### IoC tanpa Spring ###

* `NasabahDao` menggunakan constructor injection

```java
public class NasabahDaoIoc {
	// tidak ada inisialisasi, karena sudah dihandle orang lain
	private KoneksiDatabase koneksiDatabase;
	
	public NasabahDaoIoc(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}

	private void connect() {
		koneksiDatabase.connect();
	}
}
```

* Client Code

```java
public class DemoIoc {

	public static void main(String[] args) {
		KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
		
		NasabahDaoIoc nd = new NasabahDaoIoc(koneksiDatabase);
		
		nd.simpan();
	}

}
```


### IoC dengan Spring ###


* Client Code

```java
public class DemoIocSpring {

	public static void main(String[] args) {
		ApplicationContext springContainer
			= new ClassPathXmlApplicationContext("belajar-ioc.xml");
		
		NasabahDaoIoc nasabahDao = (NasabahDaoIoc) springContainer.getBean("nd");
		nasabahDao.simpan();
	}

}
```

* Konfigurasi Dependency Injection

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">


	<!-- 
		KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
	-->
	<bean id="koneksiDatabase" class="belajar.spring.ioc.KoneksiDatabase">
		<property name="url" value="jdbc:postgresql://localhost/belajarspring"/>
		<property name="username" value="springdemo"/>
		<property name="password" value="cobaspring"/>
	</bean>

	<!-- 
		NasabahDaoIoc nd = new NasabahDaoIoc(koneksiDatabase);
	-->
	<bean id="nd" class="belajar.spring.ioc.NasabahDaoIoc">
		<constructor-arg ref="koneksiDatabase" />
	</bean>
	
</beans>
```