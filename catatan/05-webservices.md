# Web Services #

* Web services : layanan yang disediakan melalui protokol web (http)
* Macam-macam web services : SOAP, REST, XML-RPC, Hessian, Burlap

## SOAP ##

* Singkatan dari Simple Object Access Protocol
* Ada dua jenis

Berbagai framework untuk membuat aplikasi SOAP :
* [Spring WS](http://projects.spring.io/spring-ws/)
* [JBoss WS](http://jbossws.jboss.org/)
* [Apache CXF](http://cxf.apache.org/)
* [Apache Axis](http://axis.apache.org/)
* [Metro](https://javaee.github.io/metro/)

Tutorial dan contoh kode :

* [Membuat SOAP Producer dengan Spring Boot](https://spring.io/guides/gs/producing-web-service/)
* [Membuat SOAP Consumer dengan Spring Boot](https://spring.io/guides/gs/consuming-web-service/)
* [Spring Boot dan CXF](https://blog.codecentric.de/en/2016/02/spring-boot-apache-cxf/)
* [Contoh aplikasi SOAP dengan Spring WS dan Metro](https://github.com/endymuhardin/training-ws-2012-01)

Cara mudah membuat SOAP producer dengan Spring Boot

1. Generate dulu data untuk request dan response. Dalam JSON tidak masalah.
2. Konversi JSON menjadi XML [di website ini](https://www.freeformatter.com/json-to-xml-converter.html)
3. Generate XSD dari XML tersebut [di website ini](https://www.freeformatter.com/xsd-generator.html)
4. Ikuti [tutorial Spring Guide](https://spring.io/guides/gs/producing-web-service/)

Cara mudah membuat SOAP consumer dengan Netbeans

1. Dapatkan `WSDL` dari service yang ingin diconsume.
2. Ikuti panduan [di sini](https://netbeans.org/kb/docs/websvc/client.html)

## REST ##

* Data dianggap sebagai resource/benda/object, memiliki alamat yang tetap. Misal `http://localhost/nasabah/123`
* Data dapat direpresentasikan menjadi berbagai format. Misalnya JSON, XML, CSV, dsb
* Menggunakan HTTP method (`GET`, `POST`, `PUT`, `DELETE`) untuk operasi terhadap data
* Dukungan REST sudah built-in di Spring MVC
* Untuk mengeluarkan data JSON, tinggal pasang anotasi `@ResponseBody`

    ```java
    @GetMapping("/")
	@ResponseBody
	public Iterable<Nasabah> cariSemua(){
		return nasabahDao.findAll();
	}

    @GetMapping("/{id}")
	@ResponseBody
	public Nasabah cariNasabahById(@PathVariable("id") Nasabah n) {
		return n;
	}
    ```

* Untuk menerima data JSON, gunakan anotasi `@RequestBody`

    ```java
    @PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void updateNasabahById(@PathVariable("id") String id, @RequestBody @Valid Nasabah n) {
		n.setId(id);
		nasabahDao.save(n);
	}

    @PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void createNasabah(@RequestBody @Valid Nasabah n) {
		nasabahDao.save(n);
	}
    ```
