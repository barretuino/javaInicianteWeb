<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head>
<title> Texto de Exemplo de JSP com expressões JSP </title>
</head>
<body>
<h1> Alguns exemplos de expressões de JSP </H1>
Data de hoje: <%= new java.util.Date() %> <br>
Endereço do Servidor Remoto: <%= request.getRemoteHost() %> <br>
Servidor: <%= application.getServerInfo() %> <br>
Sessão: <%= session.getId() %>
</body>
</html>