<%@page contentType="text/html" import="java.util.*, java.text.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        out.println("<h1>Seja Bem Vindo ao Curso Barretuino!</h1>");
        int dia = Integer.parseInt((new SimpleDateFormat("dd")).format(new Date()));
        int mes = Integer.parseInt((new SimpleDateFormat("M")).format(new Date()));
        int ano = Integer.parseInt((new SimpleDateFormat("yyyy")).format(new Date()));
        switch(mes){
            case 1:
                out.println("Hoje é " + dia + " de Janeiro de " + ano);
                break;
            case 2:
                out.println("Hoje é " + dia + " de Fevereiro de " + ano);
                break;
            case 11:
                out.println("Hoje é " + dia + " de Novembro de " + ano);
                break;
            default:
                out.println("Ola");
                }
 
 
%>
    </body>
</html>
