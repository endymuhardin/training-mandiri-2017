package belajar.java.fundamental.hari1;

import java.io.IOException;
import java.util.List;

import training.internet.banking.Nasabah;
import training.internet.banking.helper.NasabahFileImporter;

public class DemoBacaFile {
	public static void main(String[] args) throws IOException {
		NasabahFileImporter ni = new NasabahFileImporter("src/main/resources/daftar-nasabah.txt");
		List<Nasabah> hasilImport = ni.proses();
		System.out.println(hasilImport.size() +" data berhasil diimport");
		
		for(Nasabah x : hasilImport) {
			System.out.println("Nomor : "+x.getNomor());
			System.out.println("Nama : "+x.getNama());
			System.out.println("Email : "+x.getEmail());
		}
	}
}
