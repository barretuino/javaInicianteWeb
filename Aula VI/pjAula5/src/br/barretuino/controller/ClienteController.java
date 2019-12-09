package br.barretuino.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.barretuino.dao.ClienteDao;
import br.barretuino.modelagem.Cliente;
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Cliente cliente;
    private ClienteDao dao;
    private String mensagem;
	
    public ClienteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cliente = new Cliente();
		
		//pegar os argumentos da request
		cliente.setCpf(Double.parseDouble(request.getParameter("cpf")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndRua(request.getParameter("endRua"));
		cliente.setEndNum(Integer.parseInt(request.getParameter("endNumero")));
		cliente.setEndBairro(request.getParameter("endBairro"));
		cliente.setEndCidade(request.getParameter("endCidade"));
		cliente.setEndUF(request.getParameter("endUF"));
		cliente.setEndComplemento(request.getParameter("endComplemento"));
		cliente.setSexo(Integer.parseInt(request.getParameter("sexo"))==0 ? "M" : "F");
		
		try {
			dao = new ClienteDao();
			dao.adicionar(cliente);
			mensagem = "<font color=blue>Cliente Cadastrado com Sucesso!</font>";
		}catch(SQLException e) {
			mensagem = "<font color=red>Houve erro " + e.getMessage() + "</font>";
		}
	}
}
