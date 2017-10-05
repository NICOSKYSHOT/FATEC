<!DOCTYPE html>
<html>
    <head>
        <title>Scripts para o Banco de Dados</title>
        <meta charset="UTF-8">
    </head>
    
    <style type="text/css">
        body{
            text-align: center;
            background-color: chartreuse;
            font-family: sans-serif;
            font-size: 26px;
        }
        a{
            text-decoration: none;
            color: snow;

        }
    </style>
    
    <body>
        <a href="../index.jsp"><b>>> INDEX <<</b></a> |
        <a href="acesso/login.jsp"><b>>> LOGIN <<</b></a><br><br>
        
        <h1>Criando Banco de Dados:</h1>
        
        CREATE DATABASE redelem;

        <h1>Criando a tabela usuários</h1>
        
        <br>CREATE TABLE redelem.usuarios(
        <br>uid BIGINT NOT NULL AUTO_INCREMENT,
        <br>unome VARCHAR(50),
        <br>ulogin VARCHAR(50),
        <br>usenha VARCHAR(50),
        <br>ustatus VARCHAR(50),
        <br>utipo VARCHAR(50),
        <br>primary key (uid));
        
        <h1>Criando a tabela acontecimentos</h1>
        
        <br>CREATE TABLE redelem.usuarios(
        <br>acod BIGINT NOT NULL AUTO_INCREMENT,
        <br>atitulo VARCHAR(50),
        <br>adata VARCHAR(50),
        <br>ainfo VARCHAR(255),
        <br>primary key (acod));
        
        <h1>Info da Conexao</h1>
        
        <br>URL: "jdbc:mysql://localhost:3306/redelemp1"
        <br>USER: "root"
        <br>SENHA: ""
        
    </body>
    
</html>