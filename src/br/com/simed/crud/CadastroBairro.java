/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroBairro {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    
    public ArrayList listarBairro(Bairro bairro){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
            // stm = con.prepareStatement(sql="SELECT * FROM tbl_bairros WHERE NOME LIKE ? ORDER BY id_bairro");
             stm = con.prepareStatement(sql="SELECT  B.Id_bairro, B.nomeBairro, C.nomeCidade FROM tbl_bairros B, tbl_cidades C WHERE B.id_cidade = C.id_cidade and B.nomeBairro LIKE ? ORDER BY B.id_bairro");
             stm.setString(1,bairro.getNomeCidade()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_bairro"),rs.getString("nomeBairro"),rs.getString("nomeCidade")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
}
