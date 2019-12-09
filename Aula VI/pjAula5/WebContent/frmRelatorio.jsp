<!DOCTYPE HTML PUBLIC "--//W3C//DTD HTML 4.0 Transation//EN">
<%@ page contentType="text/html" language="java" import="java.sql.*"%>    
<html>
<head>  
   <title>Teste de Conex&atildeo</title>  
</head>  
  
<body>  
  
<%  
	
	//acerta tipo MIME para a resposta
	response.setContentType("text/html");
	out.println("<a href=javascript:window.history.go(-1)>Voltar</a>");
	out.println("<HTML>");
	out.println("<BODY>");	

		int countRegistros=0;		
		ResultSet rs = null;
		Connection con=null;  	
     
	   try {  
  	       Class.forName("com.mysql.jdbc.Driver");  
	       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjextensao","root","admin");  
    	   
    	 	PreparedStatement stmt = con.prepareStatement("SELECT * FROM `clientes` order by nome");
		
			// executa stmt (Query)			
	        rs = stmt.executeQuery();	        
	        int contador = 0;
            while (rs.next()) {                               
                out.println("<P><font color=blue>Cliente: </font>" + contador++ + "</P>");
				out.println("<P>CPF: " + rs.getDouble(1) + "   Nome: " +  rs.getString(2) + " </P>");		
            }
        } catch (SQLException ex) {
            out.println("<P><font color=red>Erro ao consultar " + ex + "</font></P");
            ex.printStackTrace();
        } finally {			

			out.println("Pesquisa realizada.");
        }
	out.println("<P>Curso de Extensão Avançado em Java - Paulo Barreto</P>");	
	out.println("</BODY>");
	out.println("</HTML>");
	out.close();  
%>  
  
</body>  

</html>