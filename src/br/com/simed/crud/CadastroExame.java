package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Estado;
import br.com.simed.model.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroExame {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    
     public void incluirExame(Exame exame) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_exame(nome_exame ) VALUES (?)");
            stm.setString(1, exame.getNomeExame());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
     public void atualizarExame(Exame exame) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_exame SET nome_exame=?  WHERE id_exame=?");
            stm.setString(1, exame.getNomeExame());
            stm.setInt(2, exame.getCodigoExame());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public ArrayList listarExames(Exame exame){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT * FROM tbl_exame  WHERE  nome_exame LIKE ? ORDER BY id_exame");
             stm.setString(1,exame.getNomeExame()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_exame"),rs.getString("nome_exame")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroExame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
     public void excluirExame(Exame exame) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_exame WHERE id_exame = ?");
            stm.setInt(1, exame.getCodigoExame());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroExame.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
