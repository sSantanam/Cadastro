<%-- 
    Document   : receber
    Created on : 14 de jun. de 2023, 21:52:19
    Author     : User
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro</title>
    <!-- Inclua os arquivos CSS do Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body class="bg-dark text-light">
<body>

<div class="container mt-5">
    <h2>Cadastro de Usuário</h2>
     <form name="Final" method="post" action="Final.jsp" "post">
    <form action="ConsulteServlet" method="post">
    <form action="processaCadastro.jsp" method="post">
        <!-- Campos do formulário -->
        <div class="form-group">
            <label for="nome">Nome:</label>
            <input type="text" class="form-control" id="nome" name="nome" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="senha">Senha:</label>
            <input type="password" class="form-control" id="senha" name="senha" required>
        </div>

        <!-- Botão de envio -->
       
         <button onclick="exibirMensagem()"class="btn btn-primary" >Registrar</button>
    </form>
</div>

<!-- Inclua os scripts do Bootstrap (jQuery e Popper.js são necessários) -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
        
        
        <html>
    
<head>
    <title> Registrar</title>
  <script>  
    function exibirMensagem() {
      alert("Registrado com Sucessso");
    }
  </script>
</head>
<body>
        </html>
