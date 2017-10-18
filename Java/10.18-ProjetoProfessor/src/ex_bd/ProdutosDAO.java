package ex_bd;
import java.sql.*;
public class ProdutosDAO
{
 public Produtos produto;
 public BD bd;
 private PreparedStatement statement;
 private ResultSet resultSet;
 private String men, sql;
 public static final byte INCLUSAO = 1;
 public static final byte ALTERACAO = 2;
 public static final byte EXCLUSAO = 3;
 public ProdutosDAO()
 {
 bd = new BD();
 produto = new Produtos();
 }
 public boolean localizar() {
 sql = "select * from produtos where codigo = ?";
 try{
 statement = bd.connection.prepareStatement(sql);
 statement.setString(1, produto.getCodigo());
 resultSet = statement.executeQuery();
 resultSet.first();
 produto.setCodigo(resultSet.getString(1));
 produto.setNome(resultSet.getString(2));
 produto.setPreco(resultSet.getDouble(3));
 return true;
 }
 catch (SQLException erro) {
 return false;
 }
 }
 public String atualizar(int operacao) {
 men = "Operacao realizada com sucesso!";
 try {
 if (operacao==INCLUSAO){
 sql = "insert into produtos values (?,?,?)";
 statement = bd.connection.prepareStatement(sql);
 statement.setString(1, produto.getCodigo());
 statement.setString(2, produto.getNome());
 statement.setString(3, ""+produto.getPreco());
 }
 else if (operacao==ALTERACAO){
 sql = "update produtos set nome = ?, preco = ? where codigo = ?";
 statement = bd.connection.prepareStatement(sql);
 statement.setString(3, produto.getCodigo());
 statement.setString(1, produto.getNome());
 statement.setString(2, ""+produto.getPreco());
 }
 else if (operacao==EXCLUSAO)
 {
 sql = "delete from produtos where codigo = ?";
 statement = bd.connection.prepareStatement(sql);
 statement.setString(1, produto.getCodigo());
 }
 if (statement.executeUpdate() == 0)
 men = "Falha na operacao!";
 }
 catch (SQLException erro)
 {men = "Falha na operacao " + erro.toString();}
 return men;
 }
}