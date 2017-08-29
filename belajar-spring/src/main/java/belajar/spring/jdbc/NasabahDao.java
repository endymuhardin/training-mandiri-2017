package belajar.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NasabahDao {
	private static final String SQL_INSERT = "insert into nasabah (nomor,nama,email) values (?,?,?)";
	
	@Autowired private DataSource dataSource;
	
	public void insert(Nasabah n) {
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1,  n.getNomor());
			ps.setString(2,  n.getNama());
			ps.setString(3,  n.getEmail());
			ps.executeUpdate();
			conn.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}
