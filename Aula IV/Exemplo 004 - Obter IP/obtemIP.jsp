<%@ page language="java" import="java.net.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Retorna número de IP</title>
</head>
<body>

<%
 
  InetAddress endip = null;  
  
  try{
     endip = InetAddress.getLocalHost();
     out.println("O número de IP deste equipamento é " + endip);
  }
  catch (UnknownHostException e) {
     out.println("Problemas ao tentar obter número de IP " + e);
  }		
  
%>

</body>
</html>