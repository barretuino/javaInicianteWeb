package br.barretuino.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.barretuino.modelagem.Cliente;

public class TestaConexao {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			if(con != null) {
				System.out.println("Conexão Realizada");
				
				Cliente cliente = new Cliente();
				cliente.setCpf(123456789);
				cliente.setNome("Paulo C. Barreto");
				cliente.setEndRua("Av. Brasil");
				cliente.setEndNum(1000);
				cliente.setEndBairro("Jardim Glória");
				cliente.setEndCidade("Americana");
				cliente.setEndUF("SP");
				cliente.setSexo("M");
				
				ClienteDao dao = new ClienteDao();
				dao.adicionar(cliente);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
