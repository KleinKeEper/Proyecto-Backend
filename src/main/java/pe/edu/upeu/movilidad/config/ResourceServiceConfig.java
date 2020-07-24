package pe.edu.upeu.movilidad.config;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
public class ResourceServiceConfig extends ResourceServerConfigurerAdapter{
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/home").permitAll()
//		.antMatchers(HttpMethod.GET, "/api/clientes/{id}").hasAnyRole("USER", "ADMIN")
//		.antMatchers(HttpMethod.GET, "/categoria/list", "/list/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/principal/opciones/{username}").permitAll()
		.antMatchers(HttpMethod.GET, "/principal").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/escuela/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/universidad").permitAll()

		.antMatchers(HttpMethod.GET, "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/facultad/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/convocatoria/estado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/espera").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/aperturada").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/desaperturada").permitAll()
		

		.antMatchers(HttpMethod.GET,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.PUT,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.POST,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.DELETE, "/vacantes/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/universidad/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/facultad/{id_persona}").permitAll()

		.antMatchers(HttpMethod.GET, "/adjuntar/getid/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/adjuntar/getconvocatoria/{idescuela}").permitAll()
		.antMatchers(HttpMethod.GET, "/adjuntar/getalumno/{idalumno}").permitAll()
		
		.antMatchers(HttpMethod.GET, "/documentos/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/aperturada").permitAll()
// 
//		.antMatchers(HttpMethod.GET, "/convocatoria/estado/{id}").permitAll()
//		.antMatchers(HttpMethod.GET, "/convocatoria/espera").permitAll()
//		.antMatchers(HttpMethod.GET, "/convocatoria/aperturada").permitAll()
//		.antMatchers(HttpMethod.GET, "/convocatoria/desaperturada").permitAll()

		.antMatchers(HttpMethod.GET, "/planes/alumno_ganador").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_espera").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_aprobado").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_eliminado").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_denegado").permitAll()
		.anyRequest().authenticated()
		.and().cors().configurationSource(corsConfigurationSource());
	}
	
//	 if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//	        response.setHeader("Access-Control-Allow-Methods", "POST,GET,DELETE");
//	        response.setHeader("Access-Control-Max-Age", "3600");
//	        response.setHeader("Access-Control-Allow-Headers", "content-type,access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with");
//	        response.setStatus(HttpServletResponse.SC_OK);
//	    } else {
//	        chain.doFilter(req, resp);
//	    }
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}
	
	
	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter(){
		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}
}
