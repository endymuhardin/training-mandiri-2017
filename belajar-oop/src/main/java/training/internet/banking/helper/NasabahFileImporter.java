package training.internet.banking.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import training.internet.banking.Nasabah;

public class NasabahFileImporter {
	private File fileInput;
	private BufferedReader fileReader;
	
	public NasabahFileImporter(String namaFile) {
		this.fileInput = new File(namaFile);
	}
	
	private void bukaFile() throws FileNotFoundException {
		if(!fileInput.exists()) {
			throw new FileNotFoundException("File tidak ada");
		}
		
		fileReader = new BufferedReader(new FileReader(fileInput));
	}
	
	private void tutupFile() throws IOException {
		if(fileReader != null) {
			fileReader.close();
		}
	}
	
	public List<Nasabah> proses() throws IOException{
		bukaFile();
		
		String data = fileReader.readLine();
		System.out.println("Header : "+data);
		
		List<Nasabah> hasil = new ArrayList<Nasabah>();
		data = fileReader.readLine();
		while(data != null) {
			System.out.println("Data : "+data);
			
			String[] isiVariabel = data.split(",");
			if(isiVariabel.length != 3) {
				throw new IllegalStateException("Format data salah, harusnya ada 3 data");
			}
			
			Nasabah n = new Nasabah();
			n.setNomor(isiVariabel[0]);
			n.setNama(isiVariabel[1]);
			n.setEmail(isiVariabel[2]);
			hasil.add(n);
			data = fileReader.readLine();
		}
		
		tutupFile();
		return hasil;
	}
}
