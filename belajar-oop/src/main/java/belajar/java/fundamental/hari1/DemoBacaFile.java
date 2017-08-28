package belajar.java.fundamental.hari1;

import java.io.IOException;

import training.internet.banking.helper.NasabahFileImporter;

public class DemoBacaFile {
	public static void main(String[] args) throws IOException {
		NasabahFileImporter ni = new NasabahFileImporter("src/main/resources/daftar-nasabah.txt");
		ni.proses();
	}
}
