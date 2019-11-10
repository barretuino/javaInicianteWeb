package barretuino.curso.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import barretuino.curso.modelagem.Fornecedor;

@WebServlet("/svlCadFornecedor")
public class svlCadFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    
    public svlCadFornecedor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		if(request.getSession(true).getAttribute("fornecedores") != null) {
			lista = (List<Fornecedor>) request.getSession(true).getAttribute("fornecedores");
		}
		 
		response.getWriter().append("Existem " + lista.size() + " fornecedores cadastrados.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setId(Integer.parseInt(request.getParameter("id")));
		fornecedor.setDescricao(request.getParameter("descricao"));
		
		fornecedores.add(fornecedor);
		request.getSession(true).setAttribute("fornecedores", fornecedores);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./frmFornecedor.html");

		requestDispatcher.forward( request, response );
	}
}
