package pe.edu.upeu.movilidad;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MovilidadApplication implements CommandLineRunner{

	
	private BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MovilidadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		String password = "12345";
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Cotrasenia");
//			String pass = passwordEncoder().encode(password);
//			System.out.println(pass);
//		}
	}

}
