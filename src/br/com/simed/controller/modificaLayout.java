/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.simed.controller;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author windsonsm
 */
public class modificaLayout {
    //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
    //com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel
    String seta_look = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
   
            
    
    public  void Ninbus() {
        try {
            UIManager.setLookAndFeel(seta_look);
            
            
            //SwingUtilities.updateComponentTreeUI(internalFrame);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar tema = " + erro);
        }
    }
    
}
