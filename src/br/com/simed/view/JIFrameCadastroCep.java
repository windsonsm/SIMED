/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

import br.com.simed.crud.CadastroBairro;
import br.com.simed.model.Bairro;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import br.com.simed.crud.CadastroCep;
import br.com.simed.crud.CadastroCidade;
import br.com.simed.model.Cep;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import javax.swing.JOptionPane;


public class JIFrameCadastroCep extends javax.swing.JInternalFrame {

    public int contador;
    public JIFrameCadastroCep() {
        initComponents();
        TabelaCepCadastrados();
    }
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
    public void listarSigla(){
         
          CadastroCidade c = new CadastroCidade();
          c.listaEstado(jComboBoxEstado);
      }
    public void listarCidade(){
        
        int codigoEstado = ((Estado) jComboBoxEstado.getSelectedItem()).getCodigoEstado();
        CadastroBairro c = new CadastroBairro();
         c.listaCidade(codigoEstado,jComboBoxCidade);
      }
    public void listarBairro(){
        
        int codigoCidade = ((Cidade) jComboBoxCidade.getSelectedItem()).getCodigocidade();
        CadastroBairro c = new CadastroBairro();
         c.listaBairro(codigoCidade,jComboBoxBairro);
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText_IdCep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_NomeLogradouro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxBairro = new javax.swing.JComboBox<>();
        jButton_Ignorar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Salvar = new javax.swing.JButton();
        jButton_Novo = new javax.swing.JButton();
        jText_Buscar_Nome = new javax.swing.JTextField();
        jButton_Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Cep_Cadastrados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jComboBoxCidade = new javax.swing.JComboBox<>();

        setTitle("Cadastro de Cep - SIMED");

        jLabel1.setText("Cep: ");

        jText_IdCep.setEnabled(false);

        jLabel2.setText("Logradouro: ");

        jText_NomeLogradouro.setDocument(new br.com.simed.controller.SetUpperCase(100));
        jText_NomeLogradouro.setEnabled(false);

        jLabel3.setText("Bairro: ");

        jComboBoxBairro.setEnabled(false);
        jComboBoxBairro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxBairroPopupMenuWillBecomeVisible(evt);
            }
        });

        jButton_Ignorar.setText("Ignorar");
        jButton_Ignorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IgnorarActionPerformed(evt);
            }
        });

        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jButton_Novo.setText("novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jTable_Cep_Cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Cep_Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Cep_CadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Cep_Cadastrados);

        jLabel4.setText("Estado: ");

        jLabel5.setText("Cidade: ");

        jComboBoxEstado.setEnabled(false);
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jComboBoxCidade.setEnabled(false);
        jComboBoxCidade.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxCidadePopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Ignorar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_IdCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(115, 115, 115))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_NomeLogradouro))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_IdCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_NomeLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Ignorar)
                    .addComponent(jButton_Sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        contador = 2;
        listarSigla();
        //listarBairro();
        novo();
        limparCampos();
        
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
      if(contador == 1){
            atualizar();
            novo();
            //TabelaCidadeCadastrados();
        }else{
            salvar();
            novo();
        }
       
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        excluir();
        TabelaCepCadastrados();
       contador = 2;
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
       limparCampos();
       jText_NomeLogradouro.setEnabled(false);
       jText_IdCep.setEnabled(false);
       jComboBoxBairro.setEnabled(false);
       jComboBoxEstado.setEnabled(false);
       jComboBoxCidade.setEnabled(false);
      
    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        //TabelaBairroCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate

    private void jTable_Cep_CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Cep_CadastradosMouseClicked
        if(evt.getClickCount() == 2) {

            int linha = jTable_Cep_Cadastrados.getSelectedRow();
            int idCep = (int) (jTable_Cep_Cadastrados.getValueAt(linha, 0));
            jText_IdCep.setText(String.valueOf(jTable_Cep_Cadastrados.getValueAt(linha, 0)));
            jText_NomeLogradouro.setText(String.valueOf(jTable_Cep_Cadastrados.getValueAt(linha, 1)));
            jComboBoxBairro.setSelectedItem(String.valueOf(jTable_Cep_Cadastrados.getValueAt(linha, 2)));
            contador = 1;
            jText_NomeLogradouro.setEnabled(true);
            jText_IdCep.setEnabled(true);
            jComboBoxBairro.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            //listarBairro();
            
            //parte de listar nos combobox de acordo com um campo 
            
            CadastroCep a = new CadastroCep();
            jComboBoxEstado.removeAllItems();
            a.listarEstado(idCep,jComboBoxEstado);
            
            CadastroCep b = new CadastroCep();
            jComboBoxCidade.removeAllItems();
            b.listarCidade(idCep,jComboBoxCidade);
            
            CadastroCep c = new CadastroCep();
            jComboBoxBairro.removeAllItems();
            b.listarBairro(idCep,jComboBoxBairro);
        }
    }//GEN-LAST:event_jTable_Cep_CadastradosMouseClicked

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jComboBoxCidadePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCidadePopupMenuWillBecomeVisible
        jComboBoxCidade.removeAllItems();
         listarCidade();
    }//GEN-LAST:event_jComboBoxCidadePopupMenuWillBecomeVisible

    private void jComboBoxBairroPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxBairroPopupMenuWillBecomeVisible
        jComboBoxBairro.removeAllItems();
         listarBairro();
    }//GEN-LAST:event_jComboBoxBairroPopupMenuWillBecomeVisible

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JComboBox<String> jComboBoxBairro;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Cep_Cadastrados;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdCep;
    private javax.swing.JTextField jText_NomeLogradouro;
    // End of variables declaration//GEN-END:variables
 
    public void TabelaCepCadastrados() {
        
        Cep cep = new Cep();
        CadastroCep ceps_cadastrados = new CadastroCep();
        //cep.setCodigo(Integer.valueOf(jText_Buscar_Nome.getText().trim()));
        
        ArrayList dados = ceps_cadastrados.listarCep(cep);
        String[] colunas = new String[]{"ID", "NOME", "BAIRRO"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Cep_Cadastrados.setModel(modelo);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(0).setResizable(false);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(1).setResizable(false);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(2).setPreferredWidth(290);
        jTable_Cep_Cadastrados.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Cep_Cadastrados.getTableHeader().setReorderingAllowed(false);
        jTable_Cep_Cadastrados.setAutoResizeMode(jTable_Cep_Cadastrados.AUTO_RESIZE_OFF);
        jTable_Cep_Cadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    private void novo() {
        limparCampos();
        jText_NomeLogradouro.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jText_IdCep.setEnabled(true);
        jComboBoxBairro.setEnabled(true);
        TabelaCepCadastrados();
    }

 private void limparCampos() {
      jText_NomeLogradouro.setText("");
      jText_IdCep.setText("");
      jComboBoxBairro.setSelectedItem("");
      
      jComboBoxEstado.setSelectedItem(null);
      jComboBoxCidade.setSelectedItem(null);
      jComboBoxBairro.setSelectedItem(null);


       
    }
   private void salvar() {
        
        if(!(jText_IdCep.getText().isEmpty() |jText_NomeLogradouro.getText().isEmpty() | jComboBoxBairro.getSelectedItem().toString().isEmpty())){
            Cep cep = new Cep();
            
            
            cep.setCodigo(Integer.valueOf(jText_IdCep.getText().trim()));
            cep.setLogradouro(jText_NomeLogradouro.getText().trim());
            int codCep = ((Bairro) jComboBoxBairro.getSelectedItem()).getCodigobairro();
            cep.setCodigobairro(codCep);
            
            CadastroCep cadastrar = new CadastroCep();
            cadastrar.IncluirCep(cep);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     }
   private void atualizar() {
        
        if(!jText_IdCep.getText().isEmpty() |(jText_NomeLogradouro.getText().isEmpty() | jComboBoxBairro.getSelectedItem().toString().isEmpty())){
            Cep cep = new Cep();
            cep.setCodigo(Integer.valueOf(jText_IdCep.getText().trim()));
            cep.setLogradouro(jText_NomeLogradouro.getText().trim());
            int codCep = ((Bairro) jComboBoxBairro.getSelectedItem()).getCodigobairro();
            cep.setCodigobairro(codCep);
            

            CadastroCep atualizar = new CadastroCep();
            atualizar.atualizarCep(cep);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
    }
   private void excluir() {
        if (!(jText_IdCep.getText().isEmpty() | jText_NomeLogradouro.getText().isEmpty() | jComboBoxBairro.getSelectedItem().toString().isEmpty())) {

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir este Registro", "", JOptionPane.YES_NO_OPTION);
            boolean resposta;
            resposta = opcao == JOptionPane.YES_OPTION;
            if (resposta) {
                Cep cep = new Cep();
                cep.setCodigo(Integer.valueOf(jText_IdCep.getText().trim()));
                CadastroCep excluir = new CadastroCep();
                excluir.excluirCep(cep);
                limparCampos();
            }

        }else{
            JOptionPane.showMessageDialog(this, "Nenhum Registro Foi Selecionado ...");
        }
    }
}
