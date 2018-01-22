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
    public void incluirEstado(Estado estado) throws SQLException{
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO TBL_ESTADOS(E_SIGLA,E_NOME) VALUES (?,?)");
            stm.setString(1, estado.getSiglaEstado());
            stm.setString(2, estado.getNomeEstado());
            stm.execute();
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
    //Metodo para Excluir Estado
    public void excluirEstado(Estado estado) throws SQLException{
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="DELETE FROM TBL_ESTADOS WHERE E_CODIGO = ?");
            stm.setInt(1, estado.getCodigoEstado());
            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    //Metodo para atualizar Estado
    public void atualizarEstado(Estado estado) throws SQLException{
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="UPDATE TBL_ESTADOS SET E_NOME=?,E_SIGLA=? WHERE E_CODIGO=?");
            stm.setString(1, estado.getNomeEstado());
            stm.setString(2, estado.getSiglaEstado());
            stm.setInt(3,estado.getCodigoEstado());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //Metodo para listar os estados
    public ArrayList listarEstados(){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT E_CODIGO,E_NOME,E_SIGLA FROM TBL_ESTADOS ORDER BY E_CODIGO");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("e_codigo"),rs.getString("e_nome"),rs.getString("e_sigla")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
    //Metodo para buscar estado por Nome
    public ArrayList localizarEstado(Estado estado) throws SQLException {
       ArrayList dados = new ArrayList();
        
        
        try{
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="SELECT E_CODIGO,E_NOME,E_SIGLA FROM TBL_ESTADOS WHERE E_NOME LIKE ?");
            stm.setString(1,estado.getNomeEstado()+"%");
            rs = stm.executeQuery();
            
            while(rs.next()) {
                dados.add(new Object[]{rs.getInt("e_codigo"),rs.getString("e_nome"),rs.getString("e_sigla")});
            }
            con.close();
            rs.close();
            stm.close();            
            
            
        }catch(SQLException | NullPointerException ex) {
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
        
    }
    
    
    
    
    
}
