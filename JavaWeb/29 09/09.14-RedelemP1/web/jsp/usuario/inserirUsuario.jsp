<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="../../css/home.css"/>
        <title>Inserir Usuario - Rede Lembranças</title>
    </head>
    
    <body>
    <nav class="navbar navbar-custom navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" 
                data-target=".navbar-main-collapse">
                    Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">
                Rede Lembranças
                </a>
            </div>
            
            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    
                    <!-- Opções que se tornam uma lista com Bootstrap -->
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#login">Index</a>
                    </li>
                  
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
         
    <!-- Seção de Cadastro-->
    <section  class="container content-section text-center">
        <div class="row">
            <div id="cadastro" class="col-lg-8 col-lg-offset-2">
                
                
                <!-- Aqui vem o FORM de Cadastro -->
       
                <h2>Cadastro</h2>
                <div id="formCAD">
                    <form name="inserirUsuario"  action="validaInserirUsuario.jsp">
                        <label> NOME </label>  <input type="text" name="nome"><br/>
                        <label> login: </label><input type="text" required="required"><br/>
                        <label> Senha: </label><input type="password" required="required"><br/>
                        <label> Data de nascimento: </label><input type="text" required="required"><br/>  
                        <label> Tipo: COMUM</label><br/><br/>
                        <input type="HIDDEN" name="TIPO" value="comum">
                        <input type="HIDDEN" name="ID" value="">
                        
                        <ul class="list-inline banner-login-buttons">
                    <li>
                        <input type="button" value="Cadastrar" class="btn btn-default btn-lg">
                    </li>
                    <li>
                        <input type="button" value="Limpar" class="btn btn-default btn-lg">
                     </li>
                     </ul>
                        
                    *Data de Nascimento
                    Obs: Tipo só pode ser redefinido em Alteração por uma conta adm.
                    </form>
                </div>
            </div>
        </div>
    </section>
      
    </body>
</html>
