<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    
<head>
    
    <!-- Para os caracteres especiais da lingua portuguesa -->
    <meta charset="utf-8">
    
     <!-- Ajustes do Bootstrap -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 
     <!-- Informações sobre a página -->
    <meta name="description" content="Uma rede social que ajuda a exercitar a memória dos usuários">
    <meta name="author" content="Vitor Francisco Lamounier">
    <title>Rede Lembranças</title>

    <!-- CSS -->
    <link href="css/home.css" rel="stylesheet">
    
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

    <!-- Menu de Navegação -->
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
                        <a class="page-scroll" href="jsp/usuario/inserirUsuario.jsp">Cadastro</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#login">Entrar</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#sobre">Sobre</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Intro Header -->
    <header class="intro">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <h1 class="brand-heading">Lembre</h1>
                        <p class="intro-text">Rede Lembranças</p>
                        <a href="#login" class="btn btn-circle page-scroll">
                            <i class="fa fa-angle-double-down animated"></i>V
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>

  
    
    <!-- Seção de Login -->
    <section class="content-section text-center">
        <div class="login-section">
            <div id="login" class="container">
                <div   class="col-lg-8 col-lg-offset-2">
                
                <a class="navbar-brand page-scroll" href="jsp/usuario/inserirUsuario.jsp">
                NOVA CONTA
                </a>
                 <h2>Entrar</h2>
       
                <!-- Aqui vem o FORM de Login -->    
                <div>
                    <form>
                        <p>Email: <input name="email" type="text" size="50"/> </p>
                        <p>Senha:<input  name="senha" type="text" size="10"/></p>

                        <ul class="list-inline banner-login-buttons">
                    <li>
                        <input type="button" value="Entrar" class="btn btn-default btn-lg">
                    </li>
                    <li>
                        <input type="button" value="Recuperar senha" class="btn btn-default btn-lg">
                     </li>
                    <li>
                        <input type="button" value="Limpar" class="btn btn-default btn-lg">
                     </li>
                        </ul>
                    </form> 
                    
                </div>
            </div>
        </div>
        </div>
    </section>

    <!-- Seção Sobre -->
    <section id="sobre" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                
                <img src="img/rl-logo.png" alt="logo">
                <h2>Sobre a rede lembranças</h2>

                <p>Uma rede social que ajuda a exercitar a memória dos usuários. <a> V </a></p>
                
                <p><a>Nossa Motivação: </a> Com o aumento do número de pessoas da terceira idade no ambiente virtual e com a ascensão de um mercado acessível para os mesmos, são necessários sistemas que permitam com facilidade uma maior interação entre eles. </p>
                
                <p><a>Nossa Proposta: </a> A proposta é uma rede social onde idosos podem lembrar de acontecimentos históricos de anos anteriores e poder compartilhar suas próprias lembranças. O administrador pode exibir acontecimentos históricos para ajudar que eles se lembrem. </p>
                
                <p><a>Nossa Visão: </a> A Visão é desenvolver e aplicar uma rede social onde os usuários possam interagir e exercitar suas memórias com segurança e facilidade. </p>
                
            </div>
        </div>
    </section>

    <!-- Rodapé -->
    <footer>
        <div class="container text-center">
            <p>Mariana Benigno & Vitor Lamounier <br/> &copy; Rede Lembranças</p>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="vendor/jquery/jquery.js"></script>

    <!-- Bootstrap com JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Tema JavaScript -->
    <script src="js/grayscale.min.js"></script>

</body>

</html>

