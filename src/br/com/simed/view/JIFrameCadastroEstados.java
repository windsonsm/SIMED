/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

import br.com.simed.crud.CadastroEstados;
import br.com.simed.model.Bairro;
import br.com.simed.model.Estado;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Windson
 */
public class JIFrameCadastroEstados extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFrameEstado
     */
    public int contador;
    public JIFrameCadastroEstados() {
        initComponents();
        TabelaEstadosCadastrados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_IdEstado = new javax.swing.JTextField();
        jText_NomeEstado = new javax.swing.JTextField();
        jText_SiglaEstado = new javax.swing.JTextField();
        jButton_Salvar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Ignorar = new javax.swing.JButton();
        jButton_Novo = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Estados_Cadastrados = new javax.swing.JTable();
        jText_Buscar_Nome = new javax.swing.JTextField();

        setTitle("Cadastro de Estados - SIMED");

        jLabel1.setText("ID Estado:");

        jLabel3.setText("Nome:");

        jLabel2.setText("Sigla:");

        jText_IdEstado.setEditable(false);

        jText_NomeEstado.setEditable(false);

        jText_SiglaEstado.setEditable(false);

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_Ignorar.setText("Ignorar");
        jButton_Ignorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IgnorarActionPerformed(evt);
            }
        });

        jButton_Novo.setText("Novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jTable_Estados_Cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Estados_Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Estados_CadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Estados_Cadastrados);

        jText_Buscar_Nome.setToolTipText("Busca Por Nome ...");
        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_IdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jText_NomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jText_SiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Ignorar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Sair)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_Excluir, jButton_Ignorar, jButton_Novo, jButton_Sair, jButton_Salvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_IdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_NomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jText_SiglaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Ignorar))
                .addGap(18, 18, 18)
                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Sair)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_Excluir, jButton_Ignorar, jButton_Novo, jButton_Sair, jButton_Salvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
       
       contador = 2;
       novo();
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
       limparCampos();
       contador = 2;
        
    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        if( contador == 1 ){
          atualizar();
          novo();  
        
        }else{
          salvar();
          novo();
        }
       
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        TabelaEstadosCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate

    private void jTable_Estados_CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Estados_CadastradosMouseClicked
        if(evt.getClickCount() == 2) {
            contador = 1;
            jText_NomeEstado.setEditable(true);
            jText_SiglaEstado.setEditable(true);
            int linha = jTable_Estados_Cadastrados.getSelectedRow();
            jText_IdEstado.setText(String.valueOf(jTable_Estados_Cadastrados.getValueAt(linha, 0)));      
            jText_NomeEstado.setText(String.valueOf(jTable_Estados_Cadastrados.getValueAt(linha, 1)));
            jText_SiglaEstado.setText(String.valueOf(jTable_Estados_Cadastrados.getValueAt(linha, 2)));
            
            
        }
    }//GEN-LAST:event_jTable_Estados_CadastradosMouseClicked

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        excluir();
        contador = 2;
        
    }//GEN-LAST:event_jButton_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Estados_Cadastrados;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdEstado;
    private javax.swing.JTextField jText_NomeEstado;
    private javax.swing.JTextField jText_SiglaEstado;
    // End of variables declaration//GEN-END:variables

    //Posiciona o JIFrame no JDesktopPane 
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
    
    private void salvar() {
        
        if(!(jText_NomeEstado.getText().isEmpty() | jText_SiglaEstado.getText().isEmpty())){
            Estado estado = new Estado();
            estado.setNomeEstado(jText_NomeEstado.getText().trim().toUpperCase());
            estado.setSiglaEstado(jText_SiglaEstado.getText().trim().toUpperCase());

            CadastroEstados cadastrar = new CadastroEstados();
            cadastrar.incluirEstado(estado);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     }
    
    private void limparCampos() {
        jText_IdEstado.setText("");
        jText_NomeEstado.setText("");
        jText_SiglaEstado.setText("");

        jText_IdEstado.setEditable(false);
        jText_NomeEstado.setEditable(false);
        jText_SiglaEstado.setEditable(false);
        TabelaEstadosCadastrados();
        

    }
    
    private void novo() {
        limparCampos();
        jText_NomeEstado.setEditable(true);
        jText_SiglaEstado.setEditable(true);
        jText_NomeEstado.requestFocus();

    }
    
    private void excluir() {
        if (!(jText_IdEstado.getText().isEmpty() && jText_NomeEstado.getText().isEmpty() && jText_SiglaEstado.getText().isEmpty())) {

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir este Registro", "", JOptionPane.YES_NO_OPTION);
            boolean resposta;
            resposta = opcao == JOptionPane.YES_OPTION;
            if (resposta) {
                Estado estado = new Estado();
                estado.setCodigoEstado(Integer.valueOf(jText_IdEstado.getText().trim()));

                CadastroEstados excluir_estado = new CadastroEstados();
                excluir_estado.excluirEstado(estado);
                limparCampos();
            }

        }else{
            JOptionPane.showMessageDialog(this, "Nenhum Registro Foi Selecionado ...");
        }
    }
    
     public void TabelaEstadosCadastrados() {
        
        Estado estado = new Estado();
        CadastroEstados estados_cadastrados = new CadastroEstados();
        estado.setNomeEstado(jText_Buscar_Nome.getText().toUpperCase().trim());
        
        ArrayList dados = estados_cadastrados.listarEstados(estado);
        String[] colunas = new String[]{"ID", "NOME", "SIGLA"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Estados_Cadastrados.setModel(modelo);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(0).setResizable(false);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(1).setResizable(false);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTable_Estados_Cadastrados.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Estados_Cadastrados.getTableHeader().setReorderingAllowed(false);
        jTable_Estados_Cadastrados.setAutoResizeMode(jTable_Estados_Cadastrados.AUTO_RESIZE_OFF);
        jTable_Estados_Cadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
   private void atualizar() {
        
        if(!(jText_NomeEstado.getText().isEmpty() | jText_SiglaEstado.getText().isEmpty())){
            Estado estado = new Estado();
            estado.setNomeEstado(jText_NomeEstado.getText().trim().toUpperCase());
            estado.setSiglaEstado(jText_SiglaEstado.getText().trim().toUpperCase());
            estado.setCodigoEstado(Integer.valueOf(jText_IdEstado.getText().trim()));
            

            CadastroEstados atualizar = new CadastroEstados();
            atualizar.atualizarEstado(estado);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
    }
}