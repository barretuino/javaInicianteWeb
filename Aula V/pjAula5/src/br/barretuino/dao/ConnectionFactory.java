package br.barretuino.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Prover uma ponte de conexão com SGBD - Sistema Gerenciador de B. Dados
 * @author Paulo Barreto
 * @data 23/11/2019
 */
public class ConnectionFactory {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pjExtensao",
					"root",
					"admin"
					);
		}catch(ClassNotFoundException erro) {
			throw new SQLException("Houve um erro, não foi possível a conexão "
					+ erro);
		}
	}
}
