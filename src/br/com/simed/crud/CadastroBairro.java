/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
    public void listaCidade(JComboBox e){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql="SELECT id_cidade,nomeCidade FROM tbl_cidades");
          rs = stm.executeQuery();
          
      while(rs.next()){
          Cidade cidade = new Cidade();
          cidade.setCodigocidade(rs.getInt("id_cidade"));
          cidade.setNome(rs.getString("nomeCidade"));
          e.addItem(cidade);
          //e.addItem(rs.getInt("id_cidade")+" . "+rs.getString("nomeCidade"));
          }
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
      }
}
     public void IncluirBairro(Bairro c) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_bairros (nomeBairro,id_cidade) VALUES (?,?)");
            stm.setString(1, c.getNomeBairro());
            stm.setInt(2, c.getCodigocidade());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
     public void atualizarBairro(Bairro bairro) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_bairros SET nomeBairro=?,id_cidade=? WHERE id_bairro=?");
            stm.setString(1, bairro.getNomeBairro());
            stm.setInt(2, bairro.getCodigocidade());
            stm.setInt(3,bairro.getCodigobairro());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public void excluirBairro(Bairro bairro) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_bairros WHERE id_bairro = ?");
            stm.setInt(1, bairro.getCodigobairro());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
