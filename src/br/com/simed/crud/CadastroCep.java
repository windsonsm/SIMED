package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cep;
import br.com.simed.model.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroCep {
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    private Connection con;
    
    
     public ArrayList listarCep (Cep cep){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT  C.cep, C.logradouro, B.nome_bairro FROM tbl_cep C, tbl_bairros B WHERE C.id_bairro = B.id_bairro ");
             //and C.cep LIKE ? ORDER BY B.id_cep
             //stm.setString(1,cep.getCodigo()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("cep"),rs.getString("logradouro"),rs.getString("nome_bairro")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
     public void listaBairro(JComboBox e){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql="SELECT id_Bairro,nome_bairro FROM tbl_bairros");
          rs = stm.executeQuery();
          
      while(rs.next()){
          Bairro bairro = new Bairro();
          bairro.setCodigobairro(rs.getInt("id_Bairro"));
          bairro.setNomeBairro(rs.getString("nome_bairro"));
          e.addItem(bairro);
          //e.addItem(rs.getInt("id_cidade")+" . "+rs.getString("nomeCidade"));
          }
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroBairro.class.getName()).log(Level.SEVERE, null, ex);
      }
}
     public void IncluirCep(Cep c) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_cep (cep,logradouro,id_bairro) VALUES (?,?,?)");
            stm.setInt(1, c.getCodigo());
            stm.setString(2, c.getLogradouro());
            stm.setInt(3, c.getCodigobairro());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
     public void atualizarCep(Cep cep) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_cep SET logradouro=?,id_bairro=? WHERE cep=?");
            stm.setString(1, cep.getLogradouro());
            stm.setInt(2, cep.getCodigobairro());
            stm.setInt(3,cep.getCodigo());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void excluirCep(Cep cep) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_cep WHERE cep = ?");
            stm.setInt(1, cep.getCodigo());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

    public boolean buscarCEP(Cep c, JTextField jTextFieldLogradouro, JTextField jTextFieldBairro, JTextField jTextFieldCidade, JTextField jTextFieldUF) {
        boolean cepEncontrado = false;

        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql = "select a.cep,a.logradouro,b.nome_bairro,c.nome_cidade, d.sigla from \n"
                    + "tbl_cep a, tbl_bairros b, tbl_cidades c, tbl_uf d where\n"
                    + "a.id_bairro = b.id_bairro and\n"
                    + "b.id_cidade = c.id_cidade and\n"
                    + "c.id_estado = d.id_estado and a.cep = ?");
            stm.setInt(1, c.getCodigo());
            rs = stm.executeQuery();

            if (rs.next()) {
                cepEncontrado = true;
                jTextFieldLogradouro.setText(rs.getString("logradouro"));
                jTextFieldBairro.setText(rs.getString("nome_bairro"));
                jTextFieldCidade.setText(rs.getString("nome_cidade"));
                jTextFieldUF.setText(rs.getString("sigla"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Localizar Registro...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cepEncontrado;

    }
}
