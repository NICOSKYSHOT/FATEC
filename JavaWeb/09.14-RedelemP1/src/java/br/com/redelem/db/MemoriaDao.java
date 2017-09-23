package br.com.redelem.db;

import br.com.redelem.bean.Memoria;
import br.com.redelem.util.ConexaoDB;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class MemoriaDao {

    private final Connection c;
    
    public MemoriaDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Memoria busca(Memoria mem) throws SQLException{
        String sql = "SELECT uid, unome FROM usuario INNER JOIN memorias ON usuario.uid = memoria.muid";
        
        try (
            PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setInt(1,mem.getMcod());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                mem.setMcod(rs.getInt(1));
                mem.setMcom(rs.getString(2));
                mem.setMuid(rs.getInt(3));
                mem.setMacod(rs.getInt(4));
            }
        }
        return mem;
    }
    
    public Memoria altera(Memoria mem) throws SQLException{
        String sql = "UPDATE memorias SET mcom = ? WHERE mcod = ?";
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,mem.getMcom());
            stmt.setInt(6,mem.getMcod());
            
            stmt.execute();
        }
        return mem;
    }

    public Memoria exclui(Memoria mem) throws SQLException{
        String sql = "delete from memorias WHERE mcod = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,mem.getMcod());
            
            stmt.execute();
        }
        c.close();
        return mem;
    }

    public List<Memoria> lista(Memoria  memEnt) throws SQLException{

        List<Memoria> mems = new ArrayList<>();
        
        String sql = "select * from memorias where mcom like ?";
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + memEnt.getMcom() + "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Memoria mem = new Memoria(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getInt(4)
                    );
                    
                    mems.add(mem);
                }
            }
        }
        return mems;
    }
    
    public Memoria inseri(Memoria mem) throws SQLException{
        String sql = "insert into memorias" + " (mcom)" + " values (?)";
    
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1,mem.getMcom());
            
            stmt.execute();
        }
        return mem;
    }
}