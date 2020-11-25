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
		.antMatchers(HttpMethod.GET, "/principal/now/{idpersona}").permitAll()
		.antMatchers(HttpMethod.GET, "/principal/filtrar/{idalumno}").permitAll()
		.antMatchers(HttpMethod.GET, "/principal/name/{idpersona}/{opcion}").permitAll()
		
		.antMatchers(HttpMethod.GET, "/vacantes/escuela/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/universidad").permitAll()

		.antMatchers(HttpMethod.GET, "/vacantes/convocatoriagen/{idescuela}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/facultad/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/convocatoria/estado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/espera").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/aperturada").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/desaperturada").permitAll()
		
		.antMatchers(HttpMethod.GET, "/documentos/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/documentos/convocatoria").permitAll()
		.antMatchers(HttpMethod.PUT, "/documentos/estado/{id}").permitAll()




		

		.antMatchers(HttpMethod.GET,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.PUT,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.POST,  "/vacantes/convocatoria").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.DELETE, "/vacantes/convocatoria/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/universidad/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/vacantes/facultad/{id_persona}").permitAll()
		

		.antMatchers(HttpMethod.PUT, "/convocatoria/estado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/espera").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/aperturada").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/desaperturada").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/estado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/convocatoria/convenios").permitAll()


		.antMatchers(HttpMethod.GET, "/adjuntar/getid/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/adjuntar/getconvocatoria/{idescuela}").permitAll()
		.antMatchers(HttpMethod.GET, "/adjuntar/getalumno/{idalumno}").permitAll()
		.antMatchers(HttpMethod.POST, "/adjuntar/create").permitAll()
		.antMatchers(HttpMethod.GET, "/adjuntar/getpostulaciones/{idalumno}/{idconvocatoria}").permitAll()

		.antMatchers(HttpMethod.POST, "/solicitar/create").permitAll()
		.antMatchers(HttpMethod.GET, "/solicitar/documentos").permitAll()
		.antMatchers(HttpMethod.GET, "/solicitar/validar/{idpresentacion}").permitAll()
		
		.antMatchers(HttpMethod.GET, "/solicitar/getdocumentos/{idpersona}").permitAll()
		.antMatchers(HttpMethod.PUT, "/solicitar/update").permitAll()
		
		.antMatchers(HttpMethod.GET, "/recepcionar/get/{idpersona}").permitAll()
		.antMatchers(HttpMethod.GET, "/recepcionar/documento/{idpresentacion}").permitAll()
		
		
		
		.antMatchers(HttpMethod.POST, "/planes/add").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/get_docente/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/get_plan/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/alumno_ganador/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_espera/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_aprobado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_eliminado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_direscuela_denegado/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_ocni_espera").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_ocni_aprobado").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_ocni_denegado").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_consejo_espera").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_consejo_aprobado").permitAll()
		.antMatchers(HttpMethod.GET, "/planes/plan_consejo_denegado").permitAll()
		.antMatchers(HttpMethod.PUT, "/planes/estado_decano/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/planes/estado_ocni/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/planes/estado_consejo_univ/{id}").permitAll()
		.antMatchers(HttpMethod.PUT, "/planes/estado_general/{id}").permitAll()
		.antMatchers(HttpMethod.DELETE, "/planes/eliminar_plan/{id}").permitAll()
	
		.antMatchers(HttpMethod.POST, "/constancia_fin/add").permitAll()
		.antMatchers(HttpMethod.GET, "/constancia_fin/constancia_financiera").permitAll()
		.antMatchers(HttpMethod.GET, "/constancia_fin/get_facultad").permitAll()
		.antMatchers(HttpMethod.GET, "/constancia_fin/get_escuela_facultad/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/constancia_fin/get_plan_escuela/{id}").permitAll()
		.antMatchers(HttpMethod.DELETE, "/constancia_fin/eliminar_constancia/{id}").permitAll()
		
		.antMatchers(HttpMethod.POST, "/tramite/add").permitAll()
		.antMatchers(HttpMethod.GET, "/tramite/listar").permitAll()
		.antMatchers(HttpMethod.DELETE, "/tramite/eliminar_tramite/{id}").permitAll()

		.antMatchers(HttpMethod.POST, "/presentacion_alumno/add").permitAll()
		.antMatchers(HttpMethod.GET, "/presentacion_alumno/listar").permitAll()
		.antMatchers(HttpMethod.DELETE, "/presentacion_alumno/eliminar_presentacion/{id}").permitAll()



		
		.antMatchers(HttpMethod.GET, "/documentos/convocatoria/{id}").permitAll()
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
		config.setAllowedOrigins(Arrays.asList("http://localhost:8100"));
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
