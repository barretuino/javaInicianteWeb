package br.barretuino.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection()
						throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/pjExtensao",
				"root", "admin");
		}catch(ClassNotFoundException e) {
			throw new SQLException("Não foi possível estabelecer a conexão" + e.getMessage());
		}
	}
}
