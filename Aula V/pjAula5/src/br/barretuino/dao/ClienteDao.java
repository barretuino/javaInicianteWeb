package br.barretuino.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import br.barretuino.modelagem.Cliente;

/**
 * Classe de Acesso ao Banco de Dados
 * CRUD - Create, Read, Update e Delete
 * @author Paulo Barreto
 * @data 23/11/2019
 */
public class ClienteDao {
	//1º Passo - Estabelecer uma Conexão
	private Connection connection;
	public ClienteDao() throws SQLException{
		connection = ConnectionFactory.getConnection();
	}
	
	//2º Passo - Ação de Inserção de Dados
	public void adicionar(Cliente cliente) throws SQLException{
		//Instrução de Inserção (Comando SQL)
		PreparedStatement stmt = this.connection.prepareStatement(
		   "insert into clientes (cpf, nome, endRua, endNum, endBairro, endCidade, "
			+ "endUF, endComplemento, sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		try {
			stmt.setDouble(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEndRua());
			stmt.setInt(4, cliente.getEndNum());
			stmt.setString(5, cliente.getEndBairro());
			stmt.setString(6, cliente.getEndCidade());
			stmt.setString(7, cliente.getEndUF());
			stmt.setString(8, cliente.getEndComplemento());
			stmt.setString(9, cliente.getSexo());
			
			//Execução no Banco
			stmt.execute();
			System.out.println("Cliente Inserido com Sucesso!");
		}catch(SQLException e) {
			System.out.println("Falha ao inserir " + e);
		}finally {
			stmt.close();
		}
	}
	
	//3º Passo - Ação de Seleção de Dados
	public Cliente selecionar(double cpf) {
		return null;
	}
	//4º Passo - Ação de Atualização de Dados
	public void atualizar(Cliente cliente) {
		
	}
	
	//5º Passo - Ação de Remoção de Dados
	public void excluir(double cpf) {
		
	}
}
