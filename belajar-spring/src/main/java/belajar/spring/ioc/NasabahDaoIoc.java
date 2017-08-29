package belajar.spring.ioc;

public class NasabahDaoIoc {
	// tidak ada inisialisasi, karena sudah dihandle orang lain
	private KoneksiDatabase koneksiDatabase;
	
	public NasabahDaoIoc(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}

	// setter injection
	public void setKoneksiDatabase(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
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
