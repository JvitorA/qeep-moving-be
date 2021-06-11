package br.com.qm.be.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			
			return DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/qeepmoving", "joao.alves", "");

		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
