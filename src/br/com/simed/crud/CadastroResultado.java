
package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import br.com.simed.model.Exame;
import br.com.simed.model.Resultado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CadastroResultado {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    
    
    public void IncluirResultado(Resultado r) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_resultado (nome_resultado,id_exame) VALUES (?,?)");
            stm.setString(1, r.getNomeResultado());
            stm.setInt(2, r.getCodigoExame());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
    public void listaExame(JComboBox e){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql="SELECT id_exame,nome_exame FROM tbl_exame");
          rs = stm.executeQuery();
          
      while(rs.next()){
          Exame exame = new Exame();
          exame.setCodigoExame(rs.getInt("id_exame"));
          exame.setNomeExame(rs.getString("nome_exame"));
          e.addItem(exame);
              //e.addItem(rs.getInt("id_estado")+" . "+rs.getString("nome"));
          }
          
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
      }
}
   
             public ArrayList listarResultados(Resultado r){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT id_resultado,nome_resultado FROM tbl_resultado  WHERE nome_resultado LIKE ? ORDER BY id_resultado");
             stm.setString(1,r.getNomeResultado()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_resultado"),rs.getString("nome_resultado")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
             public void atualizarResultado(Resultado r) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_resultado SET nome_resultado=?,id_exame=? WHERE id_resultado=?");
            stm.setString(1, r.getNomeResultado());
            stm.setInt(2, r.getCodigoExame());
            stm.setInt(3,r.getCodigoResultado());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
             public void excluirResultado(Resultado r) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_resultado WHERE id_resultado = ?");
            stm.setInt(1, r.getCodigoResultado());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroResultado.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
}
