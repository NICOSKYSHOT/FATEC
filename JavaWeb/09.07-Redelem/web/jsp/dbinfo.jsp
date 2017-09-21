<!DOCTYPE html>
<html>
    <head>
        <title>Scripts para o Banco de Dados</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Criando Banco de Dados:</h1>
        
        CREATE DATABASE redelem;

        <h1>Criando a tabela usuários</h1>
        
        <br>CREATE TABLE redelem.usuarios(
        <br>uid BIGINT NOT NULL AUTO_INCREMENT,
        <br>unome VARCHAR(255),
        <br>ulogin VARCHAR(255),
        <br>usenha VARCHAR(255),
        <br>ustatus VARCHAR(255),
        <br>utipo VARCHAR(255),
        <br>primary key (id));
        
        <h1>Info da Conexao</h1>
        
        <br>URL: "jdbc:mysql://localhost:3306/redelem"
        <br>USER: "root"
        <br>SENHA: ""
        
        <br><br>
        <a href="../index.jsp"><b>Voltar</b></a>
    </body>
    
</html>