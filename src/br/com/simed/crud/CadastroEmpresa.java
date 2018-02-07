package br.com.simed.crud;

import br.com.simed.dao.conexaoDB;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cep;
import br.com.simed.model.Cidade;
import br.com.simed.model.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CadastroEmpresa {
    private Connection con;
    private PreparedStatement stm;
    private String sql;
    private ResultSet rs;
    
    public ArrayList listarEmpresa(Empresa empresa){
        ArrayList dados = new ArrayList();
        try {
             con = conexaoDB.getConexao();
             stm = con.prepareStatement(sql="SELECT  id_empresa, nome_empresa, cnpf FROM tbl_empresa  WHERE  nome_empresa LIKE ? ORDER BY id_empresa");
             stm.setString(1,empresa.getNomeEmpresa()+"%");
             rs = stm.executeQuery();
             
             while(rs.next()){
                  dados.add(new Object[]{rs.getInt("id_empresa"),rs.getString("nome_empresa"),rs.getString("cnpf")});
             }
             con.close();
             stm.close();
             rs.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
        public void listaCep(JComboBox e){
      try {
          con = conexaoDB.getConexao();
          stm = con.prepareStatement(sql="SELECT * FROM tbl_cep");
          rs = stm.executeQuery();
          
      while(rs.next()){
          Cep cep = new Cep();
          cep.setCodigo(rs.getInt("cep"));
          cep.setLogradouro(rs.getString("logradouro"));
          e.addItem(cep);
          //e.addItem(rs.getInt("cep"));
          }
          con.close();
          stm.close();
          rs.close();
      } catch (SQLException ex) {
          Logger.getLogger(CadastroCep.class.getName()).log(Level.SEVERE, null, ex);
      }
}
        public void IncluirEmpresa(Empresa c) {
        try {
            con = conexaoDB.getConexao();
            stm = con.prepareStatement(sql="INSERT INTO tbl_empresa (nome_empresa, cnpf, incricao_est, id_cep, numero,tel, email, site) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
            stm.setString(1, c.getNomeEmpresa());
            stm.setInt(2, c.getCnpj());
            stm.setInt(3, c.getInscricaoEstadual());
           // stm.setInt(4, c.getCodigo());
            stm.setInt(5, c.getNumero());
            stm.setInt(6, c.getTelefone());
            stm.setString(7, c.getEmail());
            stm.setString(8, c.getSite());
            stm.execute();
            JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
            
            con.close();
            stm.close();
            
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Um Erro Ocorreu ao Salvar este Registro");
            Logger.getLogger(CadastroEstados.class.getName()).log(Level.SEVERE, null, ex);
            
        }        
    }
}
