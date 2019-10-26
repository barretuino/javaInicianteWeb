package barretuino.curso.service;

import java.io.IOException;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import barretuino.curso.modelagem.Livro;

/**
 * Servlet de Serviço para Cadastro de Livro
 * @author Paulo Barreto
 * @date 26/10/2019
 *
 */
@WebServlet("/cadLivro")
public class cadLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Livro> listagem = new ArrayList<Livro>();
	
    public cadLivro() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livro livro = new Livro();
		
		livro.setTitulo(request.getParameter("titulo"));
		livro.setAutor(request.getParameter("autor"));
		livro.setIsbn(request.getParameter("isbn"));
		
		try {
			float valor = Float.parseFloat(request.getParameter("valor"));
			livro.setValor(valor);
		}catch(Exception erro) {
			new NumberFormatException("Conversão Inválida: " + erro);
		}
		
		try {
			String [] dataSTR = request.getParameter("dataCompra").split("-");
			
			Date data = new Date(Integer.parseInt(dataSTR[0])-1900, 
								 Integer.parseInt(dataSTR[1]), 
								 Integer.parseInt(dataSTR[2]));
			livro.setData(data);
		}catch(Exception erro) {
			new DateTimeException("Conversão Inválida: " + erro);
		}
		
		listagem.add(livro);
		
		response.getWriter().append("<head><link rel='stylesheet' href='theme.css'></head>");
		response.getWriter().append("<table border='1'>");		
		for(Livro l : listagem) {
			if(l.getTitulo().contains("Java")) {
				response.getWriter().append("<p><h1>");
				response.getWriter().append("<tr>");
				response.getWriter().append("<td>" + l.getTitulo() + "</td>");		
				response.getWriter().append("<td>" + l.getValor() + "</td>");
				response.getWriter().append("</tr>");
			}
		}
		response.getWriter().append("</table>");		
	}
}
