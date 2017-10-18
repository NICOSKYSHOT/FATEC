<!DOCTYPE html>
<html>
    <head>
        <title>Scripts para o Banco de Dados</title>
        <meta charset="UTF-8">
    </head>
   
    
    <body>
        <a href="../index.jsp"><b>>> INDEX <<</b></a> |
        <a href="acesso/login.jsp"><b>>> LOGIN <<</b></a><br><br>
       [19:20, 5/10/2017] +55 11 98116-9191: JAVAWEB

O que � uma aplica��o JavaWeb - � um projeto escrito em Java para rodar em navegadores Web.

O que comp�e um JavaWeb - arquivos jsp e classes java.

JSP - os arquivos Java que ser�o abertos no navegador, eles ficam dentro do pacote de paginas Web (web). Neles � poss�vel encontrar HTML e Java. O html � escrito normalmente dentro de <html></html> para escrever Java � preciso usar a tag <% %>. 

Java - Est�o no pacote de c�digos fonte (src). S�o classes javas Comuns que ser�o integradas aos JSP.
[19:20, 5/10/2017] +55 11 98116-9191: BEAN

bean - Pacote onde se encontram os objetos, seus construtores, getters/setters. Normalmente essas classes nem precisam de importa��es, j� que o m�ximo que se relacionam s�o com outros que est�o no mesmo pacote.

objetos - s�o as class e tem suas vari�veis declaradas como private. � possivel inst�nciar outras classes como privates para fazer uma rela��o entre elas.

construtor - cria um objeto com os privates da classe (ignorando o de outras classes). Nele v�o o tipo e o nome das privates usadas e depois s�o construidos com this.[atributo] = [atributo]

getters e setters - servem para pegar e colocar valores no objeto ap�s ele ja ter sido criado.

Dica - Ap�s criar as privates � poss�vel usar Alt+Insert no Netbeans para ele criar o Construtor e Gets/Set autom�ticamente.
[19:20, 5/10/2017] +55 11 98116-9191: CONTROLER

controler - Pacote onde se encontram os metodos referentes ao Objeto de mesmo nome. As classes levam o nome do objeto mais o sufixo Controler no final.

Importa��es - Essa classe faz a integra��o entre o Objeto (bean) e os scripts SQL (db).

integra��o - o controler serve como uma maneira de evitar encher o objeto do bean com muitos m�todos. � feito como quest�o de organiza��o e boas pr�ticas.

m�todos - os m�todos que se encontram no controler envolver diversas a��es como o crud. Em controlers de tabelas persistentes comuns (sem chave estrangeira) o controler relmente � s� um link entre o objeto e os scripts.

inserir, alterar e excluir - esses m�todos sempre levam para o pacote db, as classes Dao.

validar - m�todo exclusivo do usu�rio, manda direto pro db.

listar - m�todo para consultar todos os registros, criando um vetor.

buscar - serve para encontrar um registro especifico .

listarTodos - Esse m�todo � usado nas classes comuns quando existe uma classe com fk que vai usar o controler dela.

tabelas com chaves estrangeiras - Nessas tabelas � preciso fazer instancias est�ticas dos controlers antes de escrever os m�todos, pois vamos usar fun��es dele nos m�todos de busca e lista.

buscar fk - para buscar com fks (foreign keys/chaves estrangeiras) � preciso fazer instancia dos outros objetos.

listar fk - o listar cria um vetor, para criar um vetor com chaves estrangeiras � preciso instanciar os outros objetos.
[19:20, 5/10/2017] +55 11 98116-9191: DB

O que tem aqui - aqui est�o as classes que fazem o gerenciamento do banco de dados usando scripts SQL que usam os objetos.

Importa��es - De classes s� � preciso importar o Objeto e o arquivo ConexaoDB do pacote util. Bibliotecas para serem importadas involvem em grande maioria aquelas sobre sql como: ResultSet, Connection, SQLException e PreparedStatement. Outras s�o utilit�rios como ArrayList e List.

private final Connection c - � a vari�vel que importa as informa��es de ConexaoDB, que vai ser usado em praticamente todos os scripts.

ClasseDao() - Aqui a conex�o com o banco de dados � constru�da com this.c e o getConnection.

Prepared Statement - � a classe/m�todo que faz a execu��o do script sql. Nela � poss�vel adicionar v�ri�veis dos objetos no lugar dos ? presentes no sql.

inseri - inseri um novo registro. Sintaxe: "INSERT INTO tabela" + "(campo1, campo2, campo3)" + "values (?,?,?)";

altera - altera um registro j� realizado. Sintaxe: "UPDATE tabela SET atributo1 = ?, atributo2 = ? WHERE atributopk = ?"; 

exclui - remove um registro selecionado. Sintaxe: "REMOVE FROM tabela WHERE atributopk = ?"; 

busca - encontra um registro especifico. Sintaxe: "SELECT * FROM tabela WHERE pk = ?"; 

List<> - s�o vetores selecionados a partir do banco de dados.

lista - encontra todos os registros parecidos com o que foi procurado. Sintaxe: "SELECT * FROM tabela WHERE atributo like ?"; 

listaTodos - encontra todos os registros. Sintaxe: "SELECT * FROM tabela";
[19:20, 5/10/2017] +55 11 98116-9191: UTIL

o que � - � o pacote de classes utilit�rias, no caso desse projeto � usado para a ConxaoDB.

Importa��es - do SQL, Connection, DriverManager, SQLException.

O Driver - Para funcionar � preciso que a biblioteca Driver JBDC do MySQL esteja instalada no projeto. Para instalar � s� ir nas propriedades do projeto e ver as bibliotecas, para conferir as bibliotecas � s� olhar as bibliotecas no explorador da IDE.

Conseguindo conexao - para conseguir conexao � preciso ter uma url, um usuario e uma senha.

Padr�es:
url - "jdbc:mysql://localhost:3306/bancodedados

usuario - "root"

senha - ""

Retornando Conex�o - DiverManager.getConnection(url,usuario,senha);
[19:20, 5/10/2017] +55 11 98116-9191: JSPs - Fun��es das P�ginas

Index - Funciona como no HTML, � a primeira p�gina a ser exibida, podemos colocar links para outras p�ginas a partir daqui.

Pasta Acesso - Cont�m Login e Menu nesse projeto, pode conter outras telas que n�o involvem as tabelas do banco dados.
 
Login - P�gina para acessar o sistema, ela envia VALUES (login e senha) de um usu�rio para a pr�xima p�gina.

Menu - Recebe os VALUES e Valida o Login do Usu�rio. Um usu�rio n�o validado pode ser encontrado ao testar o tipo de usu�rio (se n�o for comum, adm ou outro registrado). Deve haver links para as fun��es das tabelas, mas n�o � poss�vel mandar direto para exclus�o ou atera��o de um registro.

Pastas das Tabelas - Cont�m os aquivos alterar, consultar, excluir, inserir, validaAlterar, validaConsultar e validaInserir.

inserir - uma das p�ginas recomendadas para serem abertas ap�s o menu, nela se encontra um formul�rio com VALUES para serem enviados para o banco de dados como um novo registro.

validaInserir - com a ativa��o do formul�rio os dados s�o enviados a essa p�gina, onde � realizado o processo de chamar os m�todos partindo do objeto, passando pelo controler at� chegar no db.

consulta - nessa p�gina o usu�rio pode definir um termo a ser pesquisado em um campo string da tabela ou simplesmente ir ver todos os registros

validaConsulta - aqui s�o listados, por meio de m�todos das classes java todos os registros dessa tabela, aqui tamb�m � fornecido a op��o de alterar e excluir.

excluir - o validaConsulta permite mandar uma chaveprim�ria para a exclus�o, pegando o c�digo/id do registro da linha que foi escolhido. O excluir � o m�todo mais simples, por�m perigoso, ele pega uma chave prim�ria e remove o banco o registro que tem ela.

alterar - nessa p�gina existe um formul�rio que � preenchido por um select com as insforma��es atuais, para que o usu�rio saiba o que ele est� alterando.

validaAlterar - nessa p�gina o objeto � montado e s�o feitos os m�todos que v�o realizar essa altera��o.
    </body>
    
</html>