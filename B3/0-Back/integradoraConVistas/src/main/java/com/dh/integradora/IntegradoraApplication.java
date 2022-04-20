package com.dh.integradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class IntegradoraApplication {

	private static void cargarBD(){
		Connection connection=null;
		try{
			//conectarnos para crear la BD
			Class.forName("org.h2.Driver").newInstance();
			connection= DriverManager.getConnection("jdbc:h2:~/clase23;INIT=RUNSCRIPT FROM 'create.sql'","sa","sa");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try{
				connection.close();
			}
			catch (SQLException ex){
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		cargarBD();
		SpringApplication.run(IntegradoraApplication.class, args);
	}

}
