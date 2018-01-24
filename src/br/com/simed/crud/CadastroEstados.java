/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author windsonsm
 */
public class CadastroEstados {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    
    //Metodo para Incluir Estado
    public void incluirEstado(Estado estado) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO TBL_UF(id_estado,SIGLA,NOME) VALUES (?,?)");
            stm.setString(1, estado.getSiglaEstado());
            stm.setString(2, estado.getNomeEstado());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
    //Metodo para Excluir Estado
    public void excluirEstado(Estado estado) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM tbl_uf WHERE id_estado = ?");
            stm.setInt(1, estado.getCodigoEstado());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso...");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Este Registro possui Relacionamento e não poderá ser Excluido");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    //Metodo para atualizar Estado
    public void atualizarEstado(Estado estado) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE tbl_uf SET nome=?,sigla=? WHERE id_estado=?");
            stm.setString(1, estado.getNomeEstado());
            stm.setString(2, estado.getSiglaEstado());
            stm.setInt(3,estado.getCodigoEstado());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Registro ...");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //Metodo para listar os estados
    public ArrayList listarEstados(Estado estado){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT * FROM tbl_uf WHERE NOME LIKE ? ORDER BY id_estado");
             stm.setString(1,estado.getNomeEstado()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_estado"),rs.getString("nome"),rs.getString("sigla")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
   
    
    
    
    
    
}
