package training.internet.banking;

public class Nasabah {
	public static Integer jumlahNasabah = 0;
	private String nomor;
	private String nama;
	private String email;
	
	public static void tampilkanJumlahNasabah() {
		System.out.println("Jumlah nasabah saat ini adalah : "+jumlahNasabah);
		//System.out.println("Nasabah terbaru adalah "+nama); // instance variable tidak bisa digunakan di static method
	}

	public Nasabah() {
		jumlahNasabah = jumlahNasabah + 1;
	}

	public String getNama() {
		System.out.println(nama + " adalah nasabah ke-"+jumlahNasabah);
		return this.nama;
	}

	public String getNomor() {
		return nomor;
	}

	public void setNomor(String nomor) {
		this.nomor = nomor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
