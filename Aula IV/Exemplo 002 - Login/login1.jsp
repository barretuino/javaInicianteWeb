<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Aprendendo JSP</title></head>
<body>

<%
  String usuario = request.getParameter("usuario");
  String senha = request.getParameter("senha");
%>

O nome de usuário é: <%= usuario %><br>
A senha é: <%= senha %>

</body>
</html>
