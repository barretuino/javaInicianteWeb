<%@ page import="java.util.Vector, estudo.Aluno" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Aprendendo JSP</title></head>
<body>

<%
  // cria um Vector de alunos
  Vector alunos = new Vector();
  
  // adiciona elementos ao Vector
  alunos.add(new Aluno("Osmar J. Silva", 38));
  alunos.add(new Aluno("Fernanda Lima", 21));
  
  // coloca o Vector na sessão
  session.setAttribute("alunos", alunos);
%>

</body>
</html>
