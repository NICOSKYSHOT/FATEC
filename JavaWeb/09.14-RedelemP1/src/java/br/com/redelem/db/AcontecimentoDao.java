package br.com.redelem.db;

import br.com.redelem.bean.Acontecimento;
import br.com.redelem.util.ConexaoDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class AcontecimentoDao {

    private final Connection c;
    
    public AcontecimentoDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Acontecimento busca(Acontecimento aco) throws SQLException{
        String sql = "select * from acontecimentos WHERE acod = ?";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,aco.getAcod());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                aco.setAcod(rs.getInt(1));
                aco.setAtitulo(rs.getString(2));
                aco.setAdata(rs.getString(3));
                aco.setAinfo(rs.getString(4));
            }
        }
        return aco;
    }
    
    public Acontecimento altera(Acontecimento aco) throws SQLException{
        String sql = "UPDATE acontecimentos SET atitulo = ?, adata = ?, ainfo = ? WHERE acod = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,aco.getAtitulo());
            stmt.setString(2,aco.getAdata());
            stmt.setString(3,aco.getAinfo());
            stmt.setInt(4,aco.getAcod());
            
            stmt.execute();
        }
        return aco;
    }

    public Acontecimento exclui(Acontecimento aco) throws SQLException{
        String sql = "delete from acontecimentos WHERE acod = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,aco.getAcod());
            
            stmt.execute();
        }
        c.close();
        return aco;
    }
    
    
    public List<Acontecimento> lista(Acontecimento acoEnt) throws SQLException{

        List<Acontecimento> acos = new ArrayList<>();
        
        String sql = "select * from acontecimentos where atitulo like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + acoEnt.getAtitulo() + "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Acontecimento aco = new Acontecimento(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)
                    );
                    
                    acos.add(aco);
                }
            }
        }
        return acos;
    }
    
    public List<Acontecimento> listaTodos() throws SQLException{
         // usus: array armazena a lista de registros

        List<Acontecimento> acos = new ArrayList<>();
        
        String sql = "select * from acontecimentos";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                Acontecimento aco = new Acontecimento(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                // adiciona o usu à lista de usus
                acos.add(aco);
            }
            
            rs.close();
        }
        return acos;
        
    }
    
    public Acontecimento inseri(Acontecimento aco) throws SQLException{
        String sql = "insert into acontecimentos" + " (atitulo, adata, ainfo)" + " values (?,?,?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,aco.getAtitulo());
            stmt.setString(2,aco.getAdata());
            stmt.setString(3,aco.getAinfo());
            
            stmt.execute();
        }
        return aco;
    }
}