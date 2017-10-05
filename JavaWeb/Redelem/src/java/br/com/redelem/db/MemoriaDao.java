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
    
    public Memoria altera(Memoria mem) throws SQLException{
        String sql = "UPDATE memorias SET muid = ?, macod = ?, mcom = ? WHERE mcod = ?";
        
        try (PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setInt(1,mem.getMuid());
            stmt.setInt(2,mem.getMacod());
            stmt.setString(3,mem.getMcom());
            stmt.setInt(4,mem.getMcod());
            
            stmt.execute();
        }
        return mem;
    }
    
    public Memoria exclui(Memoria mem) throws SQLException{
        String sql = "DELETE FROM memorias WHERE mcod = ?";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        
        stmt.setInt(1,mem.getMcod());
        
        stmt.execute();
        stmt.close();
        c.close();
        return mem;
    }
    
    public Memoria inseri(Memoria mem) throws SQLException{
        String sql = "INSERT INTO memorias" + " (muid, macod, mcom)" + " values (?,?,?)";
    
        PreparedStatement stmt = c.prepareStatement(sql);

        stmt.setInt(1,mem.getMuid());
        stmt.setInt(2,mem.getMacod());
        stmt.setString(3,mem.getMcom());

        // executa
        stmt.execute();
        stmt.close();
        return mem;
    }
    
    public Memoria busca(Memoria mem) throws SQLException{
        String sql = "SELECT * FROM memorias WHERE mcod = ?";
        
        PreparedStatement stmt = this.c.prepareStatement(sql);
            stmt.setInt(1,mem.getMcod());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                mem.setMcod(rs.getInt(1));
                mem.setMuid(rs.getInt(2));
                mem.setMacod(rs.getInt(3));
                mem.setMcom(rs.getString(4));
            }
        return mem;
    }

    public List<Memoria> lista(Memoria  memEnt) throws SQLException{

        List<Memoria> mems = new ArrayList<>();
        
        String sql = "SELECT * FROM memorias WHERE mcom LIKE ?";
        
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
            stmt.setString(1,"%" + memEnt.getMcom() + "%");      
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    Memoria mem = new Memoria(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getString(4)
                    );
                    
                    mems.add(mem);
                }
                
                rs.close();
                stmt.close();
            }
            return mems;
        }
    }
}