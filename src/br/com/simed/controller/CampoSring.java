/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author windsonsm
 */
public class CampoSring extends PlainDocument {

    private int quantDigitos;

    public CampoSring(int max) {
        super();
        quantDigitos = max;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        if (quantDigitos <= 0) {
            //super.insertString(offset, str, attr);
            super.insertString(offset, str, attr);
            return;
        }
        int total = (getLength() + str.length());
        if (total <= quantDigitos) {
            
               super.insertString(offset, str.replaceAll("[^a-z|^A-Z]", "").toUpperCase(), attr); 
               
                
            
            
        }

    }

}
