/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;


/**
 *
 * @author windsonsm
 */
public class ValidaDados  {
   
    //Metodo para restringir a digiracao de caracteres em campo JTextField
    public void RestringirParaNumeros (KeyEvent evt, JTextField campo, int numDigitos) {
        boolean Numero = false;
       if(Character.isDigit(evt.getKeyChar())){
           Numero = true;
       }
       int comprimentoCampo = campo.getText().length();
       if(!Numero || comprimentoCampo == numDigitos){
            evt.consume();
       }
    }
          
    /** Metodo para validar CNPJ **/
    public boolean ValidaCNPJ(JFormattedTextField cnpj){
          
          String numerosCNPJ = cnpj.getText().replaceAll("[-,/,.]", "");
          
          
           if(numerosCNPJ.equals("00000000000000") || numerosCNPJ.equals("11111111111111") || numerosCNPJ.equals("22222222222222")
                  || numerosCNPJ.equals("33333333333333") || numerosCNPJ.equals("44444444444444") || numerosCNPJ.equals("55555555555555") ||
                  numerosCNPJ.equals("66666666666666") || numerosCNPJ.equals("77777777777777") || numerosCNPJ.equals("88888888888888") ||
                  numerosCNPJ.equals("99999999999999")) {
                   
                return false;
          
          }
         
          int soma = 0, aux, dig;  
          String cnpj_calc = numerosCNPJ.substring(0,12);  
  
       if ( numerosCNPJ.length() != 14 )  
         return false;  
  
       char[] chr_cnpj = numerosCNPJ.toCharArray();  
  
       /* Primeira parte */  
       for( int i = 0; i < 4; i++ )  
         if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
           soma += (chr_cnpj[i] - 48 ) * (6 - (i + 1)) ;  
       for( int i = 0; i < 8; i++ )  
         if ( chr_cnpj[i+4]-48 >=0 && chr_cnpj[i+4]-48 <=9 )  
           soma += (chr_cnpj[i+4] - 48 ) * (10 - (i + 1)) ;  
       dig = 11 - (soma % 11);  
  
       cnpj_calc += ( dig == 10 || dig == 11 ) ?  
                      "0" : Integer.toString(dig);  
  
       /* Segunda parte */  
       soma = 0;  
       for ( int i = 0; i < 5; i++ )  
         if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
           soma += (chr_cnpj[i] - 48 ) * (7 - (i + 1)) ;  
       for ( int i = 0; i < 8; i++ )  
         if ( chr_cnpj[i+5]-48 >=0 && chr_cnpj[i+5]-48 <=9 )  
           soma += (chr_cnpj[i+5] - 48 ) * (10 - (i + 1)) ;  
       dig = 11 - (soma % 11);  
       cnpj_calc += ( dig == 10 || dig == 11 ) ?  
                      "0" : Integer.toString(dig);  
  
       return numerosCNPJ.equals(cnpj_calc);          
          
     }         
     
        
    
    
    
}

