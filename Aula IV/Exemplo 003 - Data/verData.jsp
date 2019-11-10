<%@ page language="java" import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head>
<title>Data e Hora Atual</title>
</head>
<body>

  <p><b>Data e Hora Atual:</b> 
  <%= Calendar.getInstance().getTime() %></p>

</body>
</html>
