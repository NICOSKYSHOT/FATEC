package br.com.fatec.db;

import br.com.fatec.util.ConexaoDB;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import br.com.fatec.bean.Usuario;

public class UsuarioDao {

    private final Connection c;
    
    public UsuarioDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Usuario busca(Usuario usu) throws SQLException{
        String sql = "select * from usuarios WHERE id = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,usu.getId());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usu.setId(rs.getInt(1));
                usu.setNome(rs.getString(2));
                usu.setLogin(rs.getString(3));
                usu.setSenha(rs.getString(4));
                usu.setStatus(rs.getString(5));
                usu.setTipo(rs.getString(6));
            }
        }
        return usu;
    }
    
    
    
    public Usuario altera(Usuario usu) throws SQLException{
        String sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ?, status = ?, tipo = ? WHERE id = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,usu.getNome());
            stmt.setString(2,usu.getLogin());
            stmt.setString(3,usu.getSenha());
            stmt.setString(4,usu.getStatus());
            stmt.setString(5,usu.getTipo());
            stmt.setInt(6,usu.getId());
            
            stmt.execute();
        }
        return usu;
    }

    public Usuario exclui(Usuario usu) throws SQLException{
        String sql = "delete from usuarios WHERE id = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,usu.getId());
            
            stmt.execute();
        }
        c.close();
        return usu;
    }
    
    public Usuario validaLogin(Usuario usu) throws SQLException{
       
        String sql = "select * from usuarios WHERE login = ? AND senha = ?";
       
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,usu.getLogin());
            stmt.setString(2,usu.getSenha());
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usu.setId(rs.getInt(1));
                usu.setNome(rs.getString(2));
                usu.setLogin(rs.getString(3));
                usu.setSenha(rs.getString(4));
                usu.setStatus(rs.getString(5));
                usu.setTipo(rs.getString(6));
            }
        }
        return usu;
    }
    
    public List<Usuario> lista(Usuario usuEnt) throws SQLException{

        List<Usuario> usus = new ArrayList<>();
        
        String sql = "select * from usuarios where nome like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + usuEnt.getNome() + "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Usuario usu = new Usuario(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    
                    usus.add(usu);
                }
            }
        }
        return usus;
    }
    
    public Usuario inseri(Usuario usu) throws SQLException{
        String sql = "insert into usuarios" + " (nome, login, senha, status, tipo)" + " values (?,?,?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,usu.getNome());
            stmt.setString(2,usu.getLogin());
            stmt.setString(3,usu.getSenha());
            stmt.setString(4,usu.getStatus());
            stmt.setString(5,usu.getTipo());
            
            stmt.execute();
        }
        return usu;
    }
}