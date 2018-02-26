package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cep;
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
       public void listarEstado(int idCep,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          System.out.println("");
          stm = con.prepareStatement(sql = "SELECT D.ID_ESTADO, D.NOME_ESTADO FROM TBL_CEP A , TBL_BAIRROS B, TBL_CIDADES C, TBL_UF D WHERE A.ID_BAIRRO = B.ID_BAIRRO AND B.ID_CIDADE = C.ID_CIDADE AND C.ID_ESTADO = D.ID_ESTADO and A.CEP = ?");
          stm.setInt(1,idCep);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Estado estado = new Estado();
          estado.setCodigoEstado(rs.getInt("id_estado"));
          estado.setNomeEstado(rs.getString("nome_estado"));
          e.addItem(estado);
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
        public void listarCidade(int idCep,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          System.out.println("");
          //FALTA MODIFICAR AK 
          stm = con.prepareStatement(sql = "SELECT C.ID_CIDADE, C.NOME_CIDADE FROM TBL_CEP A , TBL_BAIRROS B, TBL_CIDADES C  WHERE A.ID_BAIRRO = B.ID_BAIRRO AND B.ID_CIDADE = C.ID_CIDADE and A.CEP = ?");
          stm.setInt(1,idCep);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Cidade cidade = new Cidade();
          cidade.setCodigocidade(rs.getInt("id_cidade"));
          cidade.setNome(rs.getString("nome_cidade"));
          e.addItem(cidade);
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
        
        public void listarBairro(int idCep,JComboBox e  ){
      try {
          con = conexaoDB.getConexao();
          System.out.println("");
          //FALTA MODIFICAR AK 
          stm = con.prepareStatement(sql = "SELECT B.ID_BAIRRO, B.NOME_BAIRRO FROM TBL_CEP A , TBL_BAIRROS B WHERE A.ID_BAIRRO = B.ID_BAIRRO AND A.CEP = ?");
          stm.setInt(1,idCep);
          rs = stm.executeQuery();
          
      while(rs.next()){
          Bairro bairro = new Bairro();
          bairro.setCodigobairro(rs.getInt("id_bairro"));
          bairro.setNomeBairro(rs.getString("nome_bairro"));
          e.addItem(bairro);
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
}
