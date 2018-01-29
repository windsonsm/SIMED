package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
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

public class CadastroCidade {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
     
    
    public void atualizarCidade(Cidade cidade) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_cidades SET nome=?,id_estado=? WHERE id_cidade=?");
            stm.setString(1, cidade.getNomeCidade());
            stm.setInt(2, cidade.getCodigoEstado());
            stm.setInt(3,cidade.getCodigocidade());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
public void listaEstado(JComboBox e){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql="SELECT id_estado,nome FROM tbl_uf");
          rs = stm.executeQuery();
          
      while(rs.next()){
          Estado estado = new Estado();
          estado.setCodigoEstado(rs.getInt("id_estado"));
          estado.setNomeEstado(rs.getString("nome"));
          e.addItem(estado);
              //e.addItem(rs.getInt("id_estado")+" . "+rs.getString("nome"));
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
     public void IncluirCidade(Cidade c) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_cidades (Nome,id_estado) VALUES (?,?)");
            stm.setString(1, c.getNomeCidade());
            stm.setInt(2, c.getCodigoEstado());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
     
     public ArrayList listarCidade(Cidade cidade){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT * FROM tbl_cidades WHERE NOME LIKE ? ORDER BY id_cidade");
             stm.setString(1,cidade.getNomeCidade()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_cidade"),rs.getString("nome"),rs.getString("id_estado")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
      public void excluirCidade(Cidade cidade) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_cidades WHERE id_cidade = ?");
            stm.setInt(1, cidade.getCodigocidade());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
