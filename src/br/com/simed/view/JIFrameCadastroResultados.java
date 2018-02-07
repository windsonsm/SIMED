/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

import br.com.simed.crud.CadastroCidade;
import br.com.simed.crud.CadastroResultado;
import br.com.simed.model.Cidade;
import br.com.simed.model.Estado;
import br.com.simed.model.Exame;
import br.com.simed.model.Resultado;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Ranster
 */
public class JIFrameCadastroResultados extends javax.swing.JInternalFrame {
private int soma; 
     public JIFrameCadastroResultados() {
        initComponents();
        TabelaResultadosCadastrados();
    }
public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }
public void listarExame(){
         
          CadastroResultado c = new CadastroResultado();
          c.listaExame(CBExame);
          
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Sair = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Ignorar = new javax.swing.JButton();
        CBExame = new javax.swing.JComboBox<>();
        jText_Buscar_Nome = new javax.swing.JTextField();
        jButton_Novo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jText_IdResultado = new javax.swing.JTextField();
        jText_NomeResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Resultados_Cadastrados = new javax.swing.JTable();

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
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

        CBExame.setEnabled(false);
        CBExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBExameActionPerformed(evt);
            }
        });

        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        jButton_Novo.setText("novo");
        jButton_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Resultado:");

        jLabel1.setText("Resultado: ");

        jText_IdResultado.setEnabled(false);

        jText_NomeResultado.setEnabled(false);

        jLabel2.setText("Exame: ");

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalvarActionPerformed(evt);
            }
        });

        jTable_Resultados_Cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Resultados_Cadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Resultados_CadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Resultados_Cadastrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_NomeResultado)
                                    .addComponent(CBExame, 0, 201, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Ignorar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_IdResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_IdResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_NomeResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Novo)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButton_Excluir)
                    .addComponent(jButton_Ignorar))
                .addGap(8, 8, 8)
                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
       excluir();
        //TabelaCidadeCadastrados();
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
        limparCampos();
        jText_NomeResultado.setEnabled(false);
        CBExame.setEnabled(false);
    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void CBExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBExameActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        TabelaResultadosCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
      novo();
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
        if(soma == 2){
           atualizar();
           novo();
        }else{
           salvar();
           novo();
        }

    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jTable_Resultados_CadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Resultados_CadastradosMouseClicked
        if(evt.getClickCount() == 2) {
            listarExame();
            soma = 2;
            jText_NomeResultado.setEnabled(true);
            CBExame.setEnabled(true);
            int linha = jTable_Resultados_Cadastrados.getSelectedRow();
            jText_IdResultado.setText(String.valueOf(jTable_Resultados_Cadastrados.getValueAt(linha, 0)));
            jText_NomeResultado.setText(String.valueOf(jTable_Resultados_Cadastrados.getValueAt(linha, 1)));
            //CBExame.setSelectedItem(String.valueOf(jTable_Resultados_Cadastrados.getValueAt(linha, 2)));
            //  CBEstado.getSelectedItem().toString(jTable_Cidades_Cadastrados.getValueAt(linha, 1));

        }
    }//GEN-LAST:event_jTable_Resultados_CadastradosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> CBExame;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Resultados_Cadastrados;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdResultado;
    private javax.swing.JTextField jText_NomeResultado;
    // End of variables declaration//GEN-END:variables

private void novo() {
        limparCampos();
        listarExame();
        jText_NomeResultado.setEnabled(true);
        CBExame.setEnabled(true);
        soma = 1;
    }

 private void limparCampos() {
      jText_IdResultado.setText("");
      jText_NomeResultado.setText("");
      CBExame.setSelectedItem("");
      TabelaResultadosCadastrados();
       // jText_NomeCidade.setEditable(false);
        //CBEstado.setEditable(false);
       // TabelaCidadeCadastrados();
}
  private void salvar() {
        
        if(!(jText_NomeResultado.getText().isEmpty() | CBExame.getSelectedItem().toString().isEmpty())){
            Resultado r = new Resultado();
            
            r.setNomeResultado(jText_NomeResultado.getText().trim().toUpperCase());
            int cod = ((Exame) CBExame.getSelectedItem()).getCodigoExame();
            r.setCodigoExame(cod);

            CadastroResultado cadastrar = new CadastroResultado();
            cadastrar.IncluirResultado(r);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     }
  public void TabelaResultadosCadastrados() {
        
        Resultado r = new Resultado();
        CadastroResultado cadastrados = new CadastroResultado();
        r.setNomeResultado(jText_Buscar_Nome.getText().toUpperCase().trim());
        
        ArrayList dados = cadastrados.listarResultados(r);
        String[] colunas = new String[]{"ID", "NOME"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Resultados_Cadastrados.setModel(modelo);
        jTable_Resultados_Cadastrados.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Resultados_Cadastrados.getColumnModel().getColumn(0).setResizable(false);
        jTable_Resultados_Cadastrados.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Resultados_Cadastrados.getColumnModel().getColumn(1).setResizable(false);
        //jTable_Cidades_Cadastrados.getColumnModel().getColumn(2).setPreferredWidth(80);
        //jTable_Cidades_Cadastrados.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Resultados_Cadastrados.getTableHeader().setReorderingAllowed(false);
        jTable_Resultados_Cadastrados.setAutoResizeMode(jTable_Resultados_Cadastrados.AUTO_RESIZE_OFF);
        jTable_Resultados_Cadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
  private void atualizar() {
        
        if(!(jText_NomeResultado.getText().isEmpty() |jText_IdResultado.getText().isEmpty() | CBExame.getSelectedItem().toString().isEmpty())){
            Resultado r = new Resultado();
            r.setNomeResultado(jText_NomeResultado.getText().trim().toUpperCase());
            int codEstado = ((Exame) CBExame.getSelectedItem()).getCodigoExame();
            r.setCodigoExame(codEstado);
            r.setCodigoResultado(Integer.valueOf(jText_IdResultado.getText().trim()));
            

            CadastroResultado atualizar = new CadastroResultado();
            atualizar.atualizarResultado(r);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
    }
  private void excluir() {
        if (!(jText_IdResultado.getText().isEmpty() | jText_NomeResultado.getText().isEmpty() | CBExame.getSelectedItem().toString().isEmpty())) {

            int opcao = JOptionPane.showConfirmDialog(this, "Deseja Realmente Excluir este Registro", "", JOptionPane.YES_NO_OPTION);
            boolean resposta;
            resposta = opcao == JOptionPane.YES_OPTION;
            if (resposta) {
                Resultado r = new Resultado();
                r.setCodigoResultado(Integer.valueOf(jText_IdResultado.getText().trim()));

                CadastroResultado excluir = new CadastroResultado();
               excluir.excluirResultado(r);
                limparCampos();
            }

        }else{
            JOptionPane.showMessageDialog(this, "Nenhum Registro Foi Selecionado ...");
        }
    }
}
