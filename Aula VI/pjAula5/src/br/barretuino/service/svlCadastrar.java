package br.barretuino.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.barretuino.dao.ClienteDao;
import br.barretuino.modelagem.Cliente;

@WebServlet("/svlCadastrar")
public class svlCadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDao DAO;
	private String mensagem;  
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		cliente = new Cliente();
		// pega parâmetros do request
		cliente.setCpf(Double.parseDouble(request.getParameter("cpf"))); 
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndRua(request.getParameter("endRua"));
		cliente.setEndNum(Integer.parseInt(request.getParameter("endNumero")));
		cliente.setEndBairro(request.getParameter("endBairro"));
		cliente.setEndCidade(request.getParameter("endCidade"));
		cliente.setEndUF(request.getParameter("endUF"));
		cliente.setEndComplemento(request.getParameter("endComplemento"));
		cliente.setSexo((Integer.parseInt(request.getParameter("sexo"))==0 ? "M" : "F"));

		try {
			DAO = new ClienteDao();
			DAO.adicionar(cliente);
			mensagem = "<font color=blue>Cliente Cadastrado com Sucesso!</font>";		
		} catch (SQLException erro) {	
			mensagem = "<font color=red>Houve um erro " + 	erro + "</font>";
		}

		// acerta tipo MIME para a resposta
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<P>" + mensagem + "</P>");
		out.println("<P>Curso de Extensão Avançado em Java - Paulo Barreto</P>");
		out.println("<P><a href=frmCadastro.html>Novo Cadastro</a></P>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}