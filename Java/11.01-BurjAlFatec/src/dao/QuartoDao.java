package dao;

import bd.ConexaoDB;
import bean.Quarto;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class QuartoDao {

    private final Connection c;
    
    public QuartoDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }

    public Quarto inseri(Quarto qua) throws SQLException{
        String sql = "INSERT INTO quartos" + " (id, numero, tamanho, andar, tipo)" + " VALUES (?,?,?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,qua.getCod());
            stmt.setString(2,qua.getNumero());
            stmt.setString(3,qua.getTamanho());
            stmt.setString(4,qua.getAndar());
            stmt.setString(5,qua.getTipo());
            
            stmt.execute();
        }
        return qua;
    }
    
    public Quarto busca(Quarto qua) throws SQLException{
        String sql = "SELECT * FROM quartos WHERE cod = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,qua.getCod());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                qua.setCod(rs.getInt(1));
                qua.setNumero(rs.getString(2));
                qua.setTamanho(rs.getString(3));          
                qua.setAndar(rs.getString(4));
                qua.setTipo(rs.getString(5));
            }
        }
        return qua;
    }
    
    public Quarto altera(Quarto qua) throws SQLException{
        String sql = "UPDATE quartos SET numero = ?, tamanho = ?, andar = ?, tipo = ?  WHERE cod= ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,qua.getNumero());
            stmt.setString(2,qua.getTamanho());
            stmt.setString(3,qua.getAndar());
            stmt.setString(4,qua.getTipo());
            stmt.setInt(5,qua.getCod());
            
            stmt.execute();
        }
        return qua;
    }
    
    public Quarto exclui(Quarto qua) throws SQLException{
        String sql = "DELETE FROM quartos WHERE cod = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,qua.getCod());
            
            stmt.execute();
        }
        c.close();
        return qua;
    }
    
}