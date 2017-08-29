package belajar.spring.ioc;

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
	
	private void disconnect() {
		
	}
	
	public void simpan() {
		connect();
		System.out.println("Menyimpan data");
		disconnect();
	}
	
	public void cariData() {
		
	}
}
