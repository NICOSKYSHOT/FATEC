/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.db;

import br.com.fatec.bean.PessoaFisica;
import br.com.fatec.util.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class PessoaDao {
    
     private final Connection c;
    
    public PessoaDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public List<PessoaFisica> listaTodos() throws SQLException{
         // usus: array armazena a lista de registros

        List<PessoaFisica> pess = new ArrayList<>();
        
        String sql = "select * from pessoas";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            PessoaFisica pes = new PessoaFisica(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)   
            );
            // adiciona o usu à lista de usus
            pess.add(pes);
        }
        
        rs.close();
        stmt.close();
        return pess;
        
    }
    
    public PessoaFisica busca(PessoaFisica pes) throws SQLException{
        String sql = "select * from pessoas WHERE id = ?";
        
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,pes.getIdPessoa());
            // executa
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                pes.setIdPessoa(rs.getInt(1));
                pes.setNome(rs.getString(2));
                pes.setCpf(rs.getString(3));
                pes.setTipo(rs.getString(4));
                pes.setEmail(rs.getString(5));
                // adiciona o usu à lista de usus
            }
        return pes;
    }
    
}
