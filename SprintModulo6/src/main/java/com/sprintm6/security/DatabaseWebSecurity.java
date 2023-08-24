package com.sprintm6.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity  {
	@Bean
	UserDetailsManager usersCustom(DataSource dataSource) {
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		users.setUsersByUsernameQuery("select username,password,estado from usuarios u where username=?");
		users.setAuthoritiesByUsernameQuery("SELECT u.username, p.tipo\r\n"
				+ "FROM usuario_perfil up\r\n"
				+ "INNER JOIN usuarios u ON u.id = up.usuario_id\r\n"
				+ "INNER JOIN perfiles p ON p.id = up.perfil_id\r\n"
				+ "WHERE u.username=?\r\n");
		return users;
	}
	
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests(request -> request                                  
			.requestMatchers("/","/signup").permitAll()
			.requestMatchers("/contacto", "/capacitaciones/**").hasAnyAuthority("Cliente")
			.requestMatchers("/usuarios/edit/{id}", "/pagos/**").hasAnyAuthority("Administrativo")
			.requestMatchers("/vistas/**", "/chequeos/**").hasAnyAuthority("Cliente")
			.anyRequest().authenticated())
			.formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
			.logout(logout->logout.logoutUrl("/logout").permitAll());
		return http.build();
	}
		
	
}
