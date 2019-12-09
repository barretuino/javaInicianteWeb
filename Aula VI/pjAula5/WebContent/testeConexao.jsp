<%@ 
	page language="java" 
	import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste de Conex�o</title>
</head>
<body>
	<%
		//Exemplo de Conex�o com SGBD
		Connection con;
		Statement st;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/pjExtensao?useTimezone=true&serverTimezone=UTC",
					"root", "admin");
			st = con.createStatement();
			out.println("Conex�o Efetuada com Sucesso!");
			
			st.close();
			con.close();
		}catch(Exception e){
			out.println("N�o foi possivel conectar ao banco " + e.getMessage());			
		}
	%>
</body>
</html>