package id.co.bankmandiri.internetbanking.konfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class KonfigurasiSecurity extends WebSecurityConfigurerAdapter {
	private static final String SQL_LOGIN = "select u.username, up.password, u.aktif "
			+ "from s_user u inner join s_user_password up on up.id_user = u.id "
			+ "where u.username = ?";
	private static final String SQL_PERMISSION = "select u.username, p.nama " + 
			"from s_user u inner join s_user_group ug on u.id = ug.id_user " + 
			"inner join s_group g on g.id = ug.id_group " + 
			"inner join s_group_permission gp on gp.id_group = g.id " + 
			"inner join s_permission p on p.id = gp.id_permission " + 
			"where u.username = ?";
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication()
				.dataSource(dataSource)
				.usersByUsernameQuery(SQL_LOGIN)
				.authoritiesByUsernameQuery(SQL_PERMISSION)
				.passwordEncoder(passwordEncoder());
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}