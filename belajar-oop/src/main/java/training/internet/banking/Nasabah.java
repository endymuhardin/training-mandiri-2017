package training.internet.banking;

public class Nasabah {
	public static Integer jumlahNasabah = 0;
	private String nama;
	
	public static void tampilkanJumlahNasabah() {
		System.out.println("Jumlah nasabah saat ini adalah : "+jumlahNasabah);
		//System.out.println("Nasabah terbaru adalah "+nama); // instance variable tidak bisa digunakan di static method
	}

	public Nasabah(String nama) {
		this.nama = nama;
		jumlahNasabah = jumlahNasabah + 1;
	}

	public String getNama() {
		System.out.println(nama + " adalah nasabah ke-"+jumlahNasabah);
		return this.nama;
	}
}
