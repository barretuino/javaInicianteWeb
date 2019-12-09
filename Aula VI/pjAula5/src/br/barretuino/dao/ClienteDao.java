package br.barretuino.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.barretuino.modelagem.Cliente;

public class ClienteDao {
	//intancia conexão com o banco de dados
	private Connection connection;
	public ClienteDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}

	//Método de Inclusão
	public void adicionar(Cliente cliente) throws SQLException {
		//prepared statement para inserção
		PreparedStatement stmt = this.connection.prepareStatement("insert into clientes " +
				"(cpf,nome,endRua,endNum,endBairro, endCidade," +
				"endUF,endComplemento,sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		try{
			// seta os valores
			stmt.setDouble(1,cliente.getCpf());
			stmt.setString(2,cliente.getNome());
			stmt.setString(3,cliente.getEndRua());
			stmt.setInt(4,cliente.getEndNum());
			stmt.setString(5,cliente.getEndBairro());
			stmt.setString(6,cliente.getEndCidade());
			stmt.setString(7,cliente.getEndUF());
			stmt.setString(8,cliente.getEndComplemento());
			stmt.setString(9,cliente.getSexo());	
			// executa stmt (Query)
			stmt.execute();
			System.out.println("Incluido: " + cliente.getCpf()+  " - " + cliente.getNome() );
		} catch (SQLException ex) {
			System.out.println("Erro ao incluir " + ex);
			ex.printStackTrace();
		} finally {
			stmt.close();			
		}	
	}

	//Método de Exclusão
	public void excluir(Double cpf) throws SQLException {
		//prepared statement para inserção
		PreparedStatement stmt = this.connection.prepareStatement("DELETE FROM `clientes` where `cpf` = ?");
		try{
			// seta os valores
			stmt.setDouble(1,cpf);		
			// executa stmt (Query)
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erro ao excluir " + ex);
			ex.printStackTrace();
		} finally {
			stmt.close();
			System.out.println("Excluido: " + cpf);
		}	
	}

	//Método de Pesquisa
	public Cliente pesquisar(Double codigo) throws SQLException {
		//cria o objeto
		Cliente clienteRet = new Cliente();
		// prepared statement para inserção
		PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM `clientes` where `cpf` = ?");
		try {
			// seta os valores			
			stmt.setDouble(1,codigo);		
			// executa stmt (Query)			
			ResultSet rs = stmt.executeQuery();		
			while (rs.next()) {                
				// seta os valores dos campos do objeto
				clienteRet.setCpf(rs.getDouble(1));
				clienteRet.setNome(rs.getString(2));
				clienteRet.setEndRua(rs.getString(3));
				clienteRet.setEndNum(rs.getInt(4));
				clienteRet.setEndBairro(rs.getString(5));
				clienteRet.setEndCidade(rs.getString(6));
				clienteRet.setEndUF(rs.getString(7));
				clienteRet.setSexo(rs.getString(8));
				clienteRet.setEndComplemento(rs.getString(9));                
			}

		} catch (SQLException ex) {
			System.out.println("Erro ao consultar " + ex);
			ex.printStackTrace();
		} finally {
			stmt.close();
			System.out.println("Pesquisa realizada.");
		}
		return clienteRet;    
	}

	//Método de Atualização
	public void atualizar(Cliente cliente) throws SQLException {
		// prepared statement para inserção
		PreparedStatement stmt = this.connection.prepareStatement("UPDATE clientes SET " +
				"nome = '" + cliente.getNome() + "', " +
				"endRua = '" + cliente.getEndRua()+ "', " +
				"endNum = " + cliente.getEndNum() + ", " +
				"endBairro = '" + cliente.getEndBairro() + "', " +
				"endCidade = '" + cliente.getEndCidade() + "', " +
				"endUF = '" + cliente.getEndUF() + "', " +
				"endComplemento = '" + cliente.getEndComplemento() + "', " +
				"sexo = '" + cliente.getSexo() + "'" + 
				" WHERE cpf = " + cliente.getCpf());
		try {            

			System.out.println(stmt.toString());

			// executa stmt (Query)			
			stmt.executeUpdate();
			System.out.println("Alterado Cliente: " + cliente.getCpf());	        
		} catch (SQLException ex) {
			System.out.println("Erro ao atualizar cliente " + ex);
			ex.printStackTrace();
		} finally {
			stmt.close();			
		}        
	}
}
