/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author windsonsm
 */
public class Relogio extends TimerTask{
  
  
    JLabel text;  
   SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");  
     
   public Relogio(JLabel text)  
   {  
      this.text = text;  
   }  
  
   public void run()  
   {  
      text.setText(sdf.format(new Date()));  
   }
}
