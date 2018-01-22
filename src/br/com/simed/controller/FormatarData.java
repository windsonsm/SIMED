/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Windson
 */
public class FormatarData {   
    
   /*Retorna uma String da data do sistema no formato informado*/  
   public static String dataAgora(){
       
       DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
       Date now = new Date();  
       
       return dateformat.format(now);
       
   }
   
   /*Retorna uma String da data do sistema no formato longo conforme informado  */
    public static String dataLonga(){
       
       DateFormat dateformat = new SimpleDateFormat("'Montes Claros - MG,' dd 'de' MMMM 'de' yyyy");
       Date now = new Date();  
       
       return dateformat.format(now);
       
   }
   
     /*Retorna um Date no formato informado*/
     public static java.sql.Date formataData(String data) {   
        if (data == null || data.equals(""))  
            return null;  
          
        java.sql.Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            date = new java.sql.Date( formatter.parse(data).getTime());  
        } catch (ParseException e) {              
            System.out.println(e);  
        }  
        return date;  
    }
    
   
    
}


