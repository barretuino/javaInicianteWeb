<%@ page import="java.util.Vector, estudo.Aluno" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Aprendendo JSP</title></head>
<body>

<%
  // obt�m o Vector guardado na sess�o
  Vector alunos = (Vector)session.getAttribute("alunos");
  
  // obt�m os Alunos contidos no Vector
  for(int i = 0; i < alunos.size(); i++){
      Aluno aluno = (Aluno)alunos.elementAt(i);
      out.println("Aluno: " + aluno.nome + 
          " - Idade: " + aluno.idade + "<br>");
  }
%>

</body>
</html>
