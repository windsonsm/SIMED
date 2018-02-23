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
             stm = con.prepareStatement(sql="SELECT  B.Id_bairro, B.nome_bairro, C.nome_cidade FROM tbl_bairros B, tbl_cidades C WHERE B.id_cidade = C.id_cidade and B.nome_bairro LIKE ? ORDER BY B.id_bairro");
             stm.setString(1,bairro.getNomeCidade()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_bairro"),rs.getString("nome_bairro"),rs.getString("nome_cidade")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
    
     public void IncluirBairro(Bairro c) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_bairros (nome_bairro,id_cidade) VALUES (?,?)");
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
            stm = con.prepareStatement(sql="UPDATE tbl_bairros SET nome_bairro=?,id_cidade=? WHERE id_bairro=?");
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
     public void listaCidade1(int idBairro,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql = "SELECT  A.ID_CIDADE,A.NOME_CIDADE FROM TBL_CIDADES A, tbl_BAIRROS B WHERE A.ID_CIDADE = B.ID_CIDADE AND\n" +
           "B.ID_BAIRRO = ?");
          stm.setInt(1,idBairro);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Cidade cidade = new Cidade();
          cidade.setCodigocidade(rs.getInt("ID_CIDADE"));
          cidade.setNome(rs.getString("NOME_CIDADE"));
          e.addItem(cidade);
              //e.addItem(rs.getInt("id_estado")+" . "+rs.getString("nome"));
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
     public void listaEstado(int idBairro,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql = "select A.ID_BAIRRO B, C.ID_ESTADO, C.NOME_ESTADO FROM TBL_BAIRROS A ,TBL_CIDADES B,TBL_UF C WHERE A.ID_CIDADE = B.ID_CIDADE AND B.ID_ESTADO = C.ID_ESTADO and A.ID_BAIRRO = ? ");
          stm.setInt(1,idBairro);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Estado estado = new Estado();
          estado.setCodigoEstado(rs.getInt("id_ESTADO"));
          estado.setNomeEstado(rs.getString("nome_ESTADO"));
          e.addItem(estado);
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
      public void listaCidade(int codigoEstado,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql = "select A.ID_Cidade, A.NOME_CIDADE FROM TBL_cidades A ,TBL_uf B WHERE A.ID_ESTADO = B.ID_ESTADO AND B.ID_ESTADO = ?");
          stm.setInt(1,codigoEstado);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Cidade cidade = new Cidade();
          
          cidade.setCodigocidade(rs.getInt("ID_Cidade"));
          cidade.setNome(rs.getString("NOME_CIDADE"));
          e.addItem(cidade);
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
}
