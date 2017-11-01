package dao;

import bd.ConexaoDB;
import bean.Cliente;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ClienteDao {

    private final Connection c;
    
    public ClienteDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }

    public Cliente inseri(Cliente cli) throws SQLException{
        String sql = "INSERT INTO clientes" + " (id, nome, sexo, datanas, cpf)" + " VALUES (?,?,?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,cli.getId());
            stmt.setString(2,cli.getNome());
            stmt.setString(3,cli.getSexo());
            stmt.setString(4,cli.getDatanas());
            stmt.setString(5,cli.getCpf());
            
            stmt.execute();
        }
        return cli;
    }
    
    public Cliente busca(Cliente cli) throws SQLException{
        String sql = "SELECT * FROM clientes WHERE id = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,cli.getId());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                cli.setId(rs.getInt(1));
                cli.setNome(rs.getString(2));
                cli.setSexo(rs.getString(3));          
                cli.setDatanas(rs.getString(4));
                cli.setCpf(rs.getString(5));
            }
        }
        return cli;
    }
    
    public Cliente altera(Cliente cli) throws SQLException{
        String sql = "UPDATE clientes SET nome = ?, sexo = ?, datanas = ?, cpf = ?  WHERE id = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,cli.getNome());
            stmt.setString(2,cli.getSexo());
            stmt.setString(3,cli.getDatanas());
            stmt.setString(4,cli.getCpf());
            stmt.setInt(5,cli.getId());
            
            stmt.execute();
        }
        return cli;
    }
    
    public Cliente exclui(Cliente cli) throws SQLException{
        String sql = "DELETE FROM clientes WHERE id = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,cli.getId());
            
            stmt.execute();
        }
        c.close();
        return cli;
    }
    
}