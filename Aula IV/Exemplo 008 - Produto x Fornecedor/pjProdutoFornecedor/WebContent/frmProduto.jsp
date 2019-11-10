<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List, java.util.ArrayList,
	 barretuino.curso.modelagem.UnidadeMedida,
	 barretuino.curso.modelagem.Fornecedor"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- Cabeçalho da Página -->
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="theme.css">
		<title>Cadastro de Produto</title>
	</head>
	<body>
		<!-- Corpo da Página -->
		<fieldset> <legend>Formul&aacute;rio de Cadastro de Produtos</legend> 
			 <form method = "post"  action = "svlCadProduto"> 
				  <label>Código</label> <input type="text" name="codigo"/> 
				  <label>Descrição</label> <input type="text" name="descricao"/>
				  <p>
				  
				  <label>Unidade de Medida</label><select name="unidadeMedida">
				  <%
				  	for(UnidadeMedida u : UnidadeMedida.values()){
				  		out.println("<option value=" + u.name() 
				  				+ ">" + u.getDescricao() + "</option>");
				  	}				  	
				  %>
				  </select>
				  
				  <label>Fornecedor</label><select name="fornecedor">
				  <%
				  	List<Fornecedor> lista = new ArrayList<Fornecedor>();
					if(request.getSession(true).getAttribute("fornecedores") != null) {
						lista = (List<Fornecedor>) request.getSession(true).getAttribute("fornecedores");
					}					
					for(Fornecedor f : lista){
				  		out.println("<option value=" + f.getId() 
				  				+ ">" + f.getDescricao() + "</option>");
				  	}
				  %>
				  </select>
				  
				  <p>
				  <label>Quantidade</label> <input type="text" name="quantidade"/>
				  <label>Valor Unit&aacute;rio</label> <input type="text" name="valorUnitario"/>
				   
				   <p>
				  <button>Cadastrar</button> 
			  </form> 
		 </fieldset>
	</body>
</html>