import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactoryCookie
 */
public class CriaCookie extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriaCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        // Pego os valores do formularios
        String nome = request.getParameter("nome");
        String telefone = request.getParameter("telefone");
        String endereco = request.getParameter("endereco");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");

        // Cria  o objeto Cookie
        Cookie cookieNome = new Cookie("Nome", nome);
        Cookie cookieTel = new Cookie("Telefone", telefone);
        Cookie cookieEndereco = new Cookie("Endereco", endereco);// Coloquei endereco ao inves de Endereço, pois Endereço é argumento reservado
        Cookie cookieBairro = new Cookie("Bairro", bairro);
        Cookie cookieCidade = new Cookie("Cidade", cidade);
        
        
        //Adiciona os Cookies no reponse
        response.addCookie(cookieNome);
        response.addCookie(cookieTel);
        response.addCookie(cookieEndereco);
        response.addCookie(cookieBairro);        
        response.addCookie(cookieCidade);
         
        
        //redireciona para a pagina pegarCookies.jap
        response.sendRedirect("pegarCookies.jsp");

    }

}
