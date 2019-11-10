<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List, barretuino.curso.modelagem.Produto"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="css/barretuino.css">
		<title>Listagem de Produtos Cadastrados</title>
	</head>
	<body>
		<table>
		  <tr>
		    <th>Id</th>
		    <th>Descrição</th>
		    <th>UM</th>
		    <th>Fornecedor</th>
		    <th>Quantidade</th>
		    <th>Valor Unitário</th>
		    <th>Valor Total</th>
		 </tr>
		 <%                
			for(Produto p : (List<Produto>) session.getAttribute("produtos")) {
				out.println("<tr><td>" + p.getCodigo() +"</td>");
				out.println("<td>" + p.getDescricao() +"</td>");
				out.println("<td>" + p.getUnidadeMedida().getDescricao() +"</td>");
				out.println("<td>" + p.getFornecedor().getDescricao()  + "</td>");
				out.println("<td>" + p.getQuantidade() +"</td>");
				out.println("<td>" + p.getValorUnitario() +"</td>");
				out.println("<td>" + p.getValorTotal() +"</td></tr>");
			}
         %>         	   
		</table>
		<form>
			<input class="button" VALUE="Atualizar" onClick='parent.location="javascript:location.reload()"'>
		</form>
	</body>
</html>