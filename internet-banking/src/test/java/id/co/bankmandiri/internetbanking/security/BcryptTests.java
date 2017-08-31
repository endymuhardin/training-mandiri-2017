package id.co.bankmandiri.internetbanking.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTests {
	@Test
	public void calculateHash() {
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		String hasil = enc.encode("abcd");
		System.out.println("Hasil : "+hasil);
	}
}
