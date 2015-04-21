package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
//@@EnableWebMvcSecurity carga varios beans necesarios para aplicar seguridad
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/**").permitAll().anyRequest()
				.fullyAuthenticated().and().formLogin();
	}

	@Configuration
	protected static class AuthenticationConfiguration extends
			GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			//Hace uso del LDAP server embebido que trae Spring Security
			//Setea uid={0},ou=people,dc=springframework,dc=org
			auth.ldapAuthentication().userDnPatterns("uid={0},ou=people")
					.groupSearchBase("ou=groups").contextSource()
					//El método ldif() trae los datos del ldif especificado
					.ldif("classpath:test-server.ldif");
		}
	}
}
