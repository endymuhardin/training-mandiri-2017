package training.internet.banking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import training.internet.banking.Nasabah;

public class NasabahDao {
	private String dbDriver;
	private String dbUrl;
	private String dbUsername;
	private String dbPassword;
	
	private static final String SQL_INSERT 
	= "insert into nasabah (nomor, nama, email) values (?,?,?)";
	
	private Connection koneksiDatabase;
	
	public NasabahDao(String dbDriver, String dbUrl, String dbUsername, String dbPassword) {
		super();
		this.dbDriver = dbDriver;
		this.dbUrl = dbUrl;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}

	public void connect() {
		try {
			koneksiDatabase = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		if(koneksiDatabase != null) {
			try {
				koneksiDatabase.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void simpan(Nasabah n) {
		try {
			koneksiDatabase.setAutoCommit(false);
			PreparedStatement ps = koneksiDatabase.prepareStatement(SQL_INSERT);
			ps.setString(1,  n.getNomor());
			ps.setString(2,  n.getNama());
			ps.setString(3,  n.getEmail());
			ps.executeUpdate();
			koneksiDatabase.commit();
			koneksiDatabase.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				koneksiDatabase.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public List<Nasabah> semuaNasabah(){
		return null;
	}
}
