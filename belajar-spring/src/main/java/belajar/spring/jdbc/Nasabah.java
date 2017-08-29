package belajar.spring.jdbc;

public class Nasabah {
	private String nomor;
	private String nama;
	private String email;
	
	public String getNama() {
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
