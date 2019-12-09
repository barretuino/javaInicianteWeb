<%@ page import="java.sql.*" %>

<% Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); %>

<HTML>
    <HEAD>
        <TITLE>Listagem dos Clientes</TITLE>
	<link rel="stylesheet" type="text/css" href="menu.css" /> 
    </HEAD>

    <BODY>
	<a href=javascript:window.history.go(-1)>Voltar</a>
        <H1>Selecionando Dados da Tabela de Clientes</H1>

        <% 
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjExtensao","root","admin");  

            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from clientes order by nome") ; 
        %>

        <TABLE BORDER="1"class="comBordaComplexa ">

            <TR>
                <TH>CPF</TH>
                <TH>Nome</TH>
                <TH>End Rua</TH>
                <TH>End Num</TH>
                <TH>End Bairro</TH>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
            </TR>
            <% } %>
        </TABLE>
    </BODY>
</HTML>