package barretuino.curso.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import barretuino.curso.modelagem.Fornecedor;
import barretuino.curso.modelagem.Produto;
import barretuino.curso.modelagem.UnidadeMedida;

@WebServlet("/svlCadProduto")
public class svlCadProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
    public svlCadProduto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		produto.setDescricao(request.getParameter("descricao"));
		
		UnidadeMedida unidadeMedida = UnidadeMedida.valueOf(request.getParameter("unidadeMedida"));
		produto.setUnidadeMedida(unidadeMedida);

		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		if(request.getSession(true).getAttribute("fornecedores") != null) {
			lista = (List<Fornecedor>) request.getSession(true).getAttribute("fornecedores");
		}
		
		int fornecedor = Integer.parseInt(request.getParameter("fornecedor"));
		for(Fornecedor f : lista) {
			if(f.getId() == fornecedor) {
				produto.setFornecedor(f);	
			}			
		}
		
		produto.setQuantidade(Float.parseFloat(request.getParameter("quantidade")));
		produto.setValorUnitario(Float.parseFloat(request.getParameter("valorUnitario")));
		
		produtos.add(produto);
		session.setAttribute("produtos", produtos);
		
		for(Produto p : (List<Produto>) session.getAttribute("produtos")) {
			System.out.println(p);
		}
	}
}