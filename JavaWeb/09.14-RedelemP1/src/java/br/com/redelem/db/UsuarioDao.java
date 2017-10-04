package br.com.redelem.db;

import br.com.redelem.bean.Usuario;
import br.com.redelem.util.ConexaoDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    private final Connection c;
    
    public UsuarioDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Usuario busca(Usuario usu) throws SQLException{
        String sql = "select * from usuarios WHERE uid = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,usu.getUid());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usu.setUid(rs.getInt(1));
                usu.setUnome(rs.getString(2));
                usu.setUlogin(rs.getString(3));
                usu.setUsenha(rs.getString(4));
                usu.setUnasc(rs.getString(5));
                usu.setUtipo(rs.getString(6));
            }
        }
        return usu;
    }
    
    public Usuario altera(Usuario usu) throws SQLException{
        String sql = "UPDATE usuarios SET unome = ?, ulogin = ?, usenha = ?, unasc = ?, utipo = ? WHERE uid = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,usu.getUnome());
            stmt.setString(2,usu.getUlogin());
            stmt.setString(3,usu.getUsenha());
            stmt.setString(4,usu.getUnasc());
            stmt.setString(5,usu.getUtipo());
            stmt.setInt(6,usu.getUid());
            
            stmt.execute();
        }
        return usu;
    }

    public Usuario exclui(Usuario usu) throws SQLException{
        String sql = "delete from usuarios WHERE uid = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,usu.getUid());
            
            stmt.execute();
        }
        c.close();
        return usu;
    }
    
    public Usuario validaLogin(Usuario usu) throws SQLException{
       
        String sql = "select * from usuarios WHERE ulogin = ? AND usenha = ?";
       
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,usu.getUlogin());
            stmt.setString(2,usu.getUsenha());
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usu.setUid(rs.getInt(1));
                usu.setUnome(rs.getString(2));
                usu.setUlogin(rs.getString(3));
                usu.setUsenha(rs.getString(4));
                usu.setUnasc(rs.getString(5));
                usu.setUtipo(rs.getString(6));
            }
        }
        return usu;
    }
    
    public List<Usuario> lista(Usuario usuEnt) throws SQLException{

        List<Usuario> usus = new ArrayList<>();
        
        String sql = "select * from usuarios where unome like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + usuEnt.getUnome() + "%");      
            
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
    
    public List<Usuario> listaTodos() throws SQLException{
         // usus: array armazena a lista de registros

        List<Usuario> usus = new ArrayList<>();
        
        String sql = "select * from usuarios";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Usuario usu = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                // adiciona o usu à lista de usus
                usus.add(usu);
            }
            
            rs.close();
        }
        return usus;
        
    }
    
    public Usuario inseri(Usuario usu) throws SQLException{
        String sql = "insert into usuarios" + " (unome, ulogin, usenha, unasc, utipo)" + " values (?,?,?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,usu.getUnome());
            stmt.setString(2,usu.getUlogin());
            stmt.setString(3,usu.getUsenha());
            stmt.setString(4,usu.getUnasc());
            stmt.setString(5,usu.getUtipo());
            
            stmt.execute();
        }
        return usu;
    }
}