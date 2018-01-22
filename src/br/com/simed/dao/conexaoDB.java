/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.dao;

import br.com.simed.controller.Encripta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;








/**
 *
 * @author windsonsm
 */
public class conexaoDB {

    public static Connection getConexao() throws SQLException {

        try {

            return DriverManager.getConnection(getUrl(), getLoginDB(), getSenhaDB());
            
            

        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar ao Banco de dados" + "\n"+se.getMessage());
           
        }

    }

    
    private static String url;
    private static final String loginDB = "postgres", senhaDB = "Ne271536";

    
    public static String getUrl() {
        return url;
        
       
    }
    
    public static void setUrl(String aUrl) {
        url = aUrl;
    }

    public static String getLoginDB() {
        return loginDB;
    }

    public static String getSenhaDB() {
        return senhaDB;
    }

    

}
