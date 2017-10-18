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

O que é uma aplicação JavaWeb - É um projeto escrito em Java para rodar em navegadores Web.

O que compõe um JavaWeb - arquivos jsp e classes java.

JSP - os arquivos Java que serão abertos no navegador, eles ficam dentro do pacote de paginas Web (web). Neles é possível encontrar HTML e Java. O html é escrito normalmente dentro de <html></html> para escrever Java é preciso usar a tag <% %>. 

Java - Estão no pacote de códigos fonte (src). São classes javas Comuns que serão integradas aos JSP.
[19:20, 5/10/2017] +55 11 98116-9191: BEAN

bean - Pacote onde se encontram os objetos, seus construtores, getters/setters. Normalmente essas classes nem precisam de importações, já que o máximo que se relacionam são com outros que estão no mesmo pacote.

objetos - são as class e tem suas variáveis declaradas como private. É possivel instânciar outras classes como privates para fazer uma relação entre elas.

construtor - cria um objeto com os privates da classe (ignorando o de outras classes). Nele vão o tipo e o nome das privates usadas e depois são construidos com this.[atributo] = [atributo]

getters e setters - servem para pegar e colocar valores no objeto após ele ja ter sido criado.

Dica - Após criar as privates é possível usar Alt+Insert no Netbeans para ele criar o Construtor e Gets/Set automáticamente.
[19:20, 5/10/2017] +55 11 98116-9191: CONTROLER

controler - Pacote onde se encontram os metodos referentes ao Objeto de mesmo nome. As classes levam o nome do objeto mais o sufixo Controler no final.

Importações - Essa classe faz a integração entre o Objeto (bean) e os scripts SQL (db).

integração - o controler serve como uma maneira de evitar encher o objeto do bean com muitos métodos. È feito como questão de organização e boas práticas.

métodos - os métodos que se encontram no controler envolver diversas ações como o crud. Em controlers de tabelas persistentes comuns (sem chave estrangeira) o controler relmente é só um link entre o objeto e os scripts.

inserir, alterar e excluir - esses métodos sempre levam para o pacote db, as classes Dao.

validar - método exclusivo do usuário, manda direto pro db.

listar - método para consultar todos os registros, criando um vetor.

buscar - serve para encontrar um registro especifico .

listarTodos - Esse método é usado nas classes comuns quando existe uma classe com fk que vai usar o controler dela.

tabelas com chaves estrangeiras - Nessas tabelas é preciso fazer instancias estáticas dos controlers antes de escrever os métodos, pois vamos usar funções dele nos métodos de busca e lista.

buscar fk - para buscar com fks (foreign keys/chaves estrangeiras) é preciso fazer instancia dos outros objetos.

listar fk - o listar cria um vetor, para criar um vetor com chaves estrangeiras é preciso instanciar os outros objetos.
[19:20, 5/10/2017] +55 11 98116-9191: DB

O que tem aqui - aqui estão as classes que fazem o gerenciamento do banco de dados usando scripts SQL que usam os objetos.

Importações - De classes só é preciso importar o Objeto e o arquivo ConexaoDB do pacote util. Bibliotecas para serem importadas involvem em grande maioria aquelas sobre sql como: ResultSet, Connection, SQLException e PreparedStatement. Outras são utilitários como ArrayList e List.

private final Connection c - é a variável que importa as informações de ConexaoDB, que vai ser usado em praticamente todos os scripts.

ClasseDao() - Aqui a conexão com o banco de dados é construída com this.c e o getConnection.

Prepared Statement - é a classe/método que faz a execução do script sql. Nela é possível adicionar váriáveis dos objetos no lugar dos ? presentes no sql.

inseri - inseri um novo registro. Sintaxe: "INSERT INTO tabela" + "(campo1, campo2, campo3)" + "values (?,?,?)";

altera - altera um registro já realizado. Sintaxe: "UPDATE tabela SET atributo1 = ?, atributo2 = ? WHERE atributopk = ?"; 

exclui - remove um registro selecionado. Sintaxe: "REMOVE FROM tabela WHERE atributopk = ?"; 

busca - encontra um registro especifico. Sintaxe: "SELECT * FROM tabela WHERE pk = ?"; 

List<> - são vetores selecionados a partir do banco de dados.

lista - encontra todos os registros parecidos com o que foi procurado. Sintaxe: "SELECT * FROM tabela WHERE atributo like ?"; 

listaTodos - encontra todos os registros. Sintaxe: "SELECT * FROM tabela";
[19:20, 5/10/2017] +55 11 98116-9191: UTIL

o que é - é o pacote de classes utilitárias, no caso desse projeto é usado para a ConxaoDB.

Importações - do SQL, Connection, DriverManager, SQLException.

O Driver - Para funcionar é preciso que a biblioteca Driver JBDC do MySQL esteja instalada no projeto. Para instalar é só ir nas propriedades do projeto e ver as bibliotecas, para conferir as bibliotecas é só olhar as bibliotecas no explorador da IDE.

Conseguindo conexao - para conseguir conexao é preciso ter uma url, um usuario e uma senha.

Padrões:
url - "jdbc:mysql://localhost:3306/bancodedados

usuario - "root"

senha - ""

Retornando Conexão - DiverManager.getConnection(url,usuario,senha);
[19:20, 5/10/2017] +55 11 98116-9191: JSPs - Funções das Páginas

Index - Funciona como no HTML, é a primeira página a ser exibida, podemos colocar links para outras páginas a partir daqui.

Pasta Acesso - Contém Login e Menu nesse projeto, pode conter outras telas que não involvem as tabelas do banco dados.
 
Login - Página para acessar o sistema, ela envia VALUES (login e senha) de um usuário para a próxima página.

Menu - Recebe os VALUES e Valida o Login do Usuário. Um usuário não validado pode ser encontrado ao testar o tipo de usuário (se não for comum, adm ou outro registrado). Deve haver links para as funções das tabelas, mas não é possível mandar direto para exclusão ou ateração de um registro.

Pastas das Tabelas - Contém os aquivos alterar, consultar, excluir, inserir, validaAlterar, validaConsultar e validaInserir.

inserir - uma das páginas recomendadas para serem abertas após o menu, nela se encontra um formulário com VALUES para serem enviados para o banco de dados como um novo registro.

validaInserir - com a ativação do formulário os dados são enviados a essa página, onde é realizado o processo de chamar os métodos partindo do objeto, passando pelo controler até chegar no db.

consulta - nessa página o usuário pode definir um termo a ser pesquisado em um campo string da tabela ou simplesmente ir ver todos os registros

validaConsulta - aqui são listados, por meio de métodos das classes java todos os registros dessa tabela, aqui também é fornecido a opção de alterar e excluir.

excluir - o validaConsulta permite mandar uma chaveprimária para a exclusão, pegando o código/id do registro da linha que foi escolhido. O excluir é o método mais simples, porém perigoso, ele pega uma chave primária e remove o banco o registro que tem ela.

alterar - nessa página existe um formulário que é preenchido por um select com as insformações atuais, para que o usuário saiba o que ele está alterando.

validaAlterar - nessa página o objeto é montado e são feitos os métodos que vão realizar essa alteração.
    </body>
    
</html>