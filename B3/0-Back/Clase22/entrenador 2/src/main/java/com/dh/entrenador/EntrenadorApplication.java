package com.dh.entrenador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class EntrenadorApplication {

	private static void cargarBD(){
		Connection connection=null;
		try{
			//ejecutamos el script
			Class.forName("org.h2.Driver").newInstance();
			connection=DriverManager.getConnection("jdbc:h2:~/clase22;INIT=RUNSCRIPT FROM 'create.sql'","sa","sa");
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
		SpringApplication.run(EntrenadorApplication.class, args);
	}

}
