<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Aprendendo JSP</title></head>
<body>

<%
  // usuario e senha corretos
  String usuario_p = "admin";
  String senha_p = "admin1234";
  
  // dados informados no formul�rio
  String usuario = request.getParameter("usuario");
  String senha = request.getParameter("senha");
  
  // verifica se os dados informados est�o corretos
  if((usuario.equals(usuario_p)) && (senha.equals(senha_p))){
    // login efetuado com sucesso. Agora voc� pode gravar uma
    // sess�o, um cookie ou direcionar o usu�rio para uma nova
    // p�gina
    out.println("Login efetuado com sucesso!");
  }
  else{
    // dados n�o conferem. Direcione o usu�rio para a p�gina de
    // login novamente
    out.println("Dados n�o conferem. Tente novamente");
  }
%>

</body>
</html>

