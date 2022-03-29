package com.clinicaOdontologica.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ClinicaApplication {
	private static void cargarBD() {
		Connection connection = null;
		try {
			Class.forName("org.h2.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:h2:~/clinica;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (SQLException ex){
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		cargarBD();
		SpringApplication.run(ClinicaApplication.class, args);

	}

}
