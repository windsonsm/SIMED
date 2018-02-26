/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

import br.com.simed.crud.CadastroBairro;
import br.com.simed.crud.CadastroCidade;
import br.com.simed.crud.CadastroEstados;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class JIFrameCadastroBairros extends javax.swing.JInternalFrame {

    public int contador;
    public JIFrameCadastroBairros() {
        initComponents();
        TabelaBairroCadastrados();
       

    }
public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
public void listarCidade(){
        
        int codigoEstado = ((Estado) jComboBoxEstado.getSelectedItem()).getCodigoEstado();
        CadastroBairro c = new CadastroBairro();
         c.listaCidade(codigoEstado,jComboBoxCidade);
      } 
 public void listarSigla(){
         
          CadastroCidade c = new CadastroCidade();
          c.listaEstado(jComboBoxEstado);
      } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jText_NomeBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_IdBairro = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jButton_Ignorar = new javax.swing.JButton();
        jButton_Novo = new javax.swing.JButton();
        jButton_Salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_Excluir = new javax.swing.JButton();
        jText_Buscar_Nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Bairros_Cadastrados = new javax.swing.JTable();
        jButton_Sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();

        setTitle("Cadastro de Bairros - SIMED");

        jText_NomeBairro.setDocument(new br.com.simed.controller.SetUpperCase(100));
        jText_NomeBairro.setEnabled(false);

        jLabel3.setText("ID Bairro: ");

        jLabel2.setText("Cidade:");

        jText_IdBairro.setEnabled(false);

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

        jButton_Ignorar.setText("Ignorar");
        jButton_Ignorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IgnorarActionPerformed(evt);
            }
        });

        jButton_Novo.setText("novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jButton_Excluir.setText("Excluir");
        jButton_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExcluirActionPerformed(evt);
            }
        });

        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        jTable_Bairros_Cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Bairros_Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Bairros_CadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Bairros_Cadastrados);

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado : ");

        jComboBoxEstado.setEnabled(false);
        jComboBoxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEstadoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_IdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_NomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_IdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_NomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Ignorar)
                    .addComponent(jButton_Sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
        limparCampos();
        jText_NomeBairro.setEnabled(false);
        jComboBoxCidade.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        contador = 2;
    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        TabelaBairroCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        limparCampos();
        novo();
        listarSigla(); 
        contador = 2;
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
       if(contador == 1){
           atualizar();
           novo();
            TabelaBairroCadastrados();
        }else{
            salvar();           
            novo();
            TabelaBairroCadastrados();
        }

    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jTable_Bairros_CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Bairros_CadastradosMouseClicked
        if(evt.getClickCount() == 2) {
            contador = 1;
            int linha = jTable_Bairros_Cadastrados.getSelectedRow();
            int idBairro = (int) (jTable_Bairros_Cadastrados.getValueAt(linha, 0));
            jText_IdBairro.setText(String.valueOf(jTable_Bairros_Cadastrados.getValueAt(linha, 0)));
            jText_NomeBairro.setText(String.valueOf(jTable_Bairros_Cadastrados.getValueAt(linha, 1)));
            jComboBoxCidade.setSelectedItem(String.valueOf(jTable_Bairros_Cadastrados.getValueAt(linha, 2)));
            
            CadastroBairro b = new CadastroBairro();
            jComboBoxEstado.removeAllItems();
            b.listaEstado(idBairro, jComboBoxEstado);
            
            
            CadastroBairro C = new CadastroBairro();
            jComboBoxCidade.removeAllItems();
            C.listaCidade1(idBairro, jComboBoxCidade);
            
            
            jText_NomeBairro.setEnabled(true);
            jComboBoxCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            
            
         }
    }//GEN-LAST:event_jTable_Bairros_CadastradosMouseClicked

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
        excluir();
        TabelaBairroCadastrados();
        contador = 2;
        limparCampos();
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jComboBoxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEstadoItemStateChanged
        //jComboBoxCidade.removeAllItems();
        //listarCidade();   
        
        
       
       
    }//GEN-LAST:event_jComboBoxEstadoItemStateChanged

    private void jComboBoxCidadePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxCidadePopupMenuWillBecomeVisible
         jComboBoxCidade.removeAllItems();
         listarCidade();
    }//GEN-LAST:event_jComboBoxCidadePopupMenuWillBecomeVisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Bairros_Cadastrados;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdBairro;
    private javax.swing.JTextField jText_NomeBairro;
    // End of variables declaration//GEN-END:variables

private void novo() {
        limparCampos();
        jText_NomeBairro.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        listarSigla();
        jComboBoxEstadoItemStateChanged(null);

    }

 private void limparCampos() {
      jText_NomeBairro.setText("");
      jText_IdBairro.setText("");
      jComboBoxCidade.removeAllItems();
      jComboBoxEstado.removeAllItems();
      //jComboBoxCidade.setSelectedItem(null);
      //jComboBoxEstado.setSelectedItem(null);
      TabelaBairroCadastrados();

       
    }
   private void salvar() {
        
        if(!(jText_NomeBairro.getText().isEmpty() | jComboBoxCidade.getSelectedItem().toString().isEmpty())){
            Bairro bairro = new Bairro();
            
            bairro.setNomeBairro(jText_NomeBairro.getText().trim().toUpperCase());
            int codCidade = ((Cidade) jComboBoxCidade.getSelectedItem()).getCodigocidade();
            bairro.setCodigocidade(codCidade);
            System.out.println("aqui : "+ bairro.getNomeBairro());
            System.out.println("aqui : "+ bairro.getCodigocidade());
            CadastroBairro cadastrar = new CadastroBairro();
            cadastrar.IncluirBairro(bairro);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     }
  
 public void TabelaBairroCadastrados() {
        
        Bairro cidade = new Bairro();
        CadastroBairro cidades_cadastrados = new CadastroBairro();
        cidade.setNome(jText_Buscar_Nome.getText().toUpperCase().trim());
        
        ArrayList dados = cidades_cadastrados.listarBairro(cidade);
        String[] colunas = new String[]{"ID", "NOME", "CIDADE"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Bairros_Cadastrados.setModel(modelo);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(0).setResizable(false);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(1).setResizable(false);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(2).setPreferredWidth(290);
        jTable_Bairros_Cadastrados.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Bairros_Cadastrados.getTableHeader().setReorderingAllowed(false);
        jTable_Bairros_Cadastrados.setAutoResizeMode(jTable_Bairros_Cadastrados.AUTO_RESIZE_OFF);
        jTable_Bairros_Cadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    private void excluir() {
        if (!(jText_NomeBairro.getText().isEmpty() && jText_IdBairro.getText().isEmpty())) {

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir este Registro", "", JOptionPane.YES_NO_OPTION);
            boolean resposta;
            resposta = opcao == JOptionPane.YES_OPTION;
            if (resposta) {
                Bairro bairro = new Bairro();
                bairro.setCodigobairro(Integer.valueOf(jText_IdBairro.getText().trim()));

                CadastroBairro excluir = new CadastroBairro();
                excluir.excluirBairro(bairro);
            }

        }else{
            JOptionPane.showMessageDialog(this, "Nenhum Registro Foi Selecionado ...");
        }
    }
       private void atualizar() {
        
        if(!(jText_NomeBairro.getText().isEmpty() | jComboBoxCidade.getSelectedItem().toString().isEmpty())){
            Bairro bairro = new Bairro();
            bairro.setNomeBairro(jText_NomeBairro.getText().trim().toUpperCase());
            int codCidade = ((Cidade) jComboBoxCidade.getSelectedItem()).getCodigocidade();
            bairro.setCodigocidade(codCidade);
            bairro.setCodigobairro(Integer.valueOf(jText_IdBairro.getText().trim()));
            

            CadastroBairro atualizar = new CadastroBairro();
            atualizar.atualizarBairro(bairro);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
    }
}
