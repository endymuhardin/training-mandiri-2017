package belajar.java.fundamental.hari1;

import training.internet.banking.Nasabah;
import training.internet.banking.dao.NasabahDao;

public class DemoInsertNasabah {
	public static void main(String[] args) {
		
		// variabel koneksi database
		String dbDriver = "org.postgresql.Driver";
		String dbUrl = "jdbc:postgresql://localhost/trainingmandiri2017";
		String dbUser = "belajar";
		String dbPassword = "java";
		
		// Data Access Object untuk Nasabah
		NasabahDao dbNasabah = new NasabahDao(dbDriver, dbUrl, dbUser, dbPassword);
		
		// Data yang mau diinsert
		Nasabah n = new Nasabah();
		n.setNomor("990");
		n.setNama("Nasabah Tester 0");
		n.setEmail("tester990@contoh.com");
		
		// insert menggunakan DAO
		dbNasabah.connect();
		dbNasabah.simpan(n);
		dbNasabah.disconnect();
	}
}
