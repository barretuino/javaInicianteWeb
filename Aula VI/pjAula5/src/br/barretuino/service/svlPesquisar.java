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

@WebServlet("/svlPesquisar")
public class svlPesquisar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private ClienteDao DAO;
	private String mensagem;  
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		cliente = new Cliente();
		// pega parâmetros do request
		try {
			DAO = new ClienteDao();
			cliente = DAO.pesquisar(Double.parseDouble(request.getParameter("cpf")));
			mensagem = "<font color=blue>Cliente Encontrado</font>";		
		} catch (SQLException erro) {	
			mensagem = "<font color=red>Houve um erro " + 	erro + "</font>";
		}

		//acerta tipo MIME para a resposta
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();	
		out.println("<a href=javascript:window.history.go(-1)>Voltar</a>");
		out.println("<HTML>");
		out.println("<BODY>");	

		if (cliente.getCpf()!=0){
			out.println("<P>" + mensagem + "</P>");
			out.println("<P>CPF: " + request.getParameter("cpf") + "   Nome: " + cliente.getNome() + "   Sexo: " + (cliente.getSexo().equals("M")? "Masculino":"Feminino") + " </P>");
			out.println("<P>Endereço: </P>");
			out.println("<P>Rua: " + cliente.getEndRua() + "   Número: " + cliente.getEndNum() + "   Complemento: " + cliente.getEndComplemento() + " </P>");
			out.println("<P>Bairro: " + cliente.getEndBairro() + "   Cidade: " + cliente.getEndCidade() + "   UF: " + cliente.getEndUF() + " </P>");		
		}else{
			out.println("<P><font color=red>Cliente Não Encontrado</font></P>");
		}
		out.println("<P>Curso de Extensão Avançado em Java - Paulo Barreto</P>");	
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}