package belajar.java.fundamental.hari1;

import java.util.Date;

import training.internet.banking.Nasabah;

public class Halo {
	private Date sekarang = new Date();

	public void sapa(String nama) {
		System.out.println("Halo " + nama);
	}

	public void tampilkanWaktu() {
		System.out.println("Waktu sekarang : " + sekarang);
	}

	public static void main(String[] x) {
		System.out.println("Menjalankan method main");

		System.out.println("Jumlah nasabah : "+ Nasabah.jumlahNasabah);
		Nasabah.tampilkanJumlahNasabah();
		//System.out.println(Nasabah.tampilkanJumlahNasabah());
		
		Nasabah n = new Nasabah();
		n.setNama("Endy");
		System.out.println("Halo " + n.getNama());
		System.out.println("Jumlah nasabah : "+n.jumlahNasabah);
		n.getNama();
		
		Nasabah n2 = new Nasabah();
		n2.setNama("anggi");
		System.out.println("Halo " + n2.getNama());
		System.out.println("Jumlah nasabah : "+n2.jumlahNasabah);
		
		System.out.println("Nama nasabah 1 " + n.getNama()); // endy
		System.out.println("Jumlah nasabah 1 : "+ Nasabah.jumlahNasabah); 
		
		Nasabah.tampilkanJumlahNasabah();
	}

}
