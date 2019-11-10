<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html lang="pt">
<head><title>Aprendendo JSP</title></head>
<body>

<%
  // usuario e senha corretos
  String usuario_p = "admin";
  String senha_p = "admin1234";
  
  // dados informados no formulário
  String usuario = request.getParameter("usuario");
  String senha = request.getParameter("senha");
  
  // verifica se os dados informados estão corretos
  if((usuario.equals(usuario_p)) && (senha.equals(senha_p))){
    // login efetuado com sucesso. Agora você pode gravar uma
    // sessão, um cookie ou direcionar o usuário para uma nova
    // página
    out.println("Login efetuado com sucesso!");
  }
  else{
    // dados não conferem. Direcione o usuário para a página de
    // login novamente
    out.println("Dados não conferem. Tente novamente");
  }
%>

</body>
</html>

