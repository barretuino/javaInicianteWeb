<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<HTML lang="pt">
<head><title>Aprendendo JSP</title></head>
<BODY BGCOLOR="#33FFCC">
<H2 ALIGN="CENTER">Exemplo usando POST</H2>
  <CENTER>
  <%  
  	// dados informados no formulário
	  String nome = request.getParameter("nome");
	  String sobrenome = request.getParameter("sobrenome");
	  
	  out.println("Nome: " + nome);
	  out.println("Sobrenome: " + sobrenome); 
   %>

  </CENTER>
</BODY></HTML>
