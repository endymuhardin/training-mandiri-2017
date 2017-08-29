package belajar.spring.ioc;

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
