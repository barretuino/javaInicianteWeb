package barretuino.curso.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import barretuino.curso.modelagen.Produto;

/**
 * Servlet de Cadastro de Produto
 * @author Prof. Paulo Barreto
 * @data 19/10/2019
 */
@WebServlet("/svlProduto")
public class svlProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//Voltada para Array --> Processo Matricial
	//private Produto produtos[] = new Produto[10];
	
	//Coleções
	private List<Produto> produtos = new ArrayList<Produto>();
	
    public svlProduto() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		
		produto.setId(Integer.parseInt(request.getParameter("id")));
		produto.setDescricao(request.getParameter("descricao"));
		
		System.out.println("Produto " + produto.getId());
		System.out.println("Descrição " + produto.getDescricao());
		
		response.getWriter().append("Produto Cadastrado! " +
							produto.getId());
		
		//Adicionando o produto a minha Lista
		this.produtos.add(produto);
		
		//Estrutura comando For
		//for(int i=0; i<condicao; i++)
		
		//Reposta dos Produtos Cadastrados
		for(Produto p : produtos) {
			response.getWriter().append("ID: " + p.getId()
							+ "\tDescrição: " + p.getDescricao()
							+ "<br>");
		}
		
		//Retornar uma informação do Cliente
		response.getWriter().append(request.getRemoteAddr());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
