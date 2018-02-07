/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

import br.com.simed.crud.CadastroBairro;
import br.com.simed.crud.CadastroCep;
import br.com.simed.crud.CadastroEmpresa;
import br.com.simed.model.Bairro;
import br.com.simed.model.Cep;
import br.com.simed.model.Cidade;
import br.com.simed.model.Empresa;
import br.com.simed.model.Tabela;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Ranster
 */
public class JIFrameCadastroEmpresas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIFrameCadastroEmpresas
     */
    public JIFrameCadastroEmpresas() {
        initComponents();
        TabelaEmpresaCadastrados();
        
    }
    public void listarEmpresa(){
         
          CadastroEmpresa c = new CadastroEmpresa();
          c.listaCep(CBEmpresa);
     } 
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jText_IdEmpresa = new javax.swing.JTextField();
        jText_NomeEmpresa = new javax.swing.JTextField();
        jText_cnpj = new javax.swing.JTextField();
        jText_inscricao = new javax.swing.JTextField();
        jText_numero = new javax.swing.JTextField();
        jText_telefone = new javax.swing.JTextField();
        jText_email = new javax.swing.JTextField();
        jText_site = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Empresas_Cadastradas = new javax.swing.JTable();
        jButton_Ignorar = new javax.swing.JButton();
        jButton_Excluir = new javax.swing.JButton();
        jButton_Salvar = new javax.swing.JButton();
        jButton_Novo = new javax.swing.JButton();
        jButton_Sair = new javax.swing.JButton();
        jText_Buscar_Nome = new javax.swing.JTextField();
        CBEmpresa = new javax.swing.JComboBox<>();

        setEnabled(false);

        jLabel1.setText("ID Empresa: ");

        jLabel2.setText("Empresa: ");

        jLabel3.setText("CNPJ: ");

        jLabel4.setText("Cep: ");

        jLabel5.setText("Numero: ");

        jLabel6.setText("Telefone: ");

        jLabel7.setText("Email: ");

        jLabel8.setText("Site: ");

        jLabel9.setText("Inscrição:");

        jText_IdEmpresa.setEnabled(false);

        jText_NomeEmpresa.setEnabled(false);

        jText_cnpj.setEnabled(false);

        jText_inscricao.setEnabled(false);

        jText_numero.setEnabled(false);
        jText_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_numeroActionPerformed(evt);
            }
        });

        jText_telefone.setEnabled(false);

        jText_email.setEnabled(false);
        jText_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_emailActionPerformed(evt);
            }
        });

        jText_site.setEnabled(false);
        jText_site.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_siteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("EMPRESA");

        jTable_Empresas_Cadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Empresas_Cadastradas);

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

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jText_Buscar_Nome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jText_Buscar_NomeCaretUpdate(evt);
            }
        });

        CBEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_IdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(447, 447, 447)
                                        .addComponent(jButton_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jText_NomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jText_inscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                    .addGap(34, 34, 34)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jText_site, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jText_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton_Novo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Salvar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Excluir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_Ignorar)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jText_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jText_numero)
                                                            .addComponent(CBEmpresa, 0, 131, Short.MAX_VALUE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_IdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jText_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jText_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(jText_Buscar_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jText_NomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jText_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_inscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jText_site, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Novo)
                            .addComponent(jButton_Salvar)
                            .addComponent(jButton_Excluir)
                            .addComponent(jButton_Ignorar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Sair)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IgnorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IgnorarActionPerformed
       // limparCampos();
       jText_NomeEmpresa.setEnabled(false);
        CBEmpresa.setEnabled(false);
        jText_cnpj.setEnabled(false);
        jText_inscricao.setEnabled(false);
        jText_email.setEnabled(false);
        jText_site.setEnabled(false);
        jText_numero.setEnabled(false);
        jText_telefone.setEnabled(false);
    }//GEN-LAST:event_jButton_IgnorarActionPerformed

    private void jButton_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExcluirActionPerformed
      //  excluir();
       // TabelaBairroCadastrados();
    }//GEN-LAST:event_jButton_ExcluirActionPerformed

    private void jButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalvarActionPerformed
       if(!(jText_IdEmpresa.getText().isEmpty() | jText_NomeEmpresa.getText().isEmpty()| jText_cnpj.getText().isEmpty()| jText_inscricao.getText().isEmpty()| jText_email.getText().isEmpty()| jText_site.getText().isEmpty()| jText_numero.getText().isEmpty()| jText_telefone.getText().isEmpty()| CBEmpresa.getSelectedItem().toString().isEmpty())){
           //atualizar();
           //novo();
           // TabelaBairroCadastrados();
        }else{
            salvar();
            novo();
            TabelaEmpresaCadastrados();
        }
    }//GEN-LAST:event_jButton_SalvarActionPerformed

    private void jButton_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoActionPerformed
        listarEmpresa();;
        novo();
        limparCampos();
    }//GEN-LAST:event_jButton_NovoActionPerformed

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        dispose();
        JFramePrincipal.setTelaNull();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jText_Buscar_NomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jText_Buscar_NomeCaretUpdate
        TabelaEmpresaCadastrados();
    }//GEN-LAST:event_jText_Buscar_NomeCaretUpdate

    private void jText_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_emailActionPerformed

    private void jText_siteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_siteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_siteActionPerformed

    private void jText_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_numeroActionPerformed

    private void CBEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBEmpresa;
    private javax.swing.JButton jButton_Excluir;
    private javax.swing.JButton jButton_Ignorar;
    private javax.swing.JButton jButton_Novo;
    private javax.swing.JButton jButton_Sair;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Empresas_Cadastradas;
    private javax.swing.JTextField jText_Buscar_Nome;
    private javax.swing.JTextField jText_IdEmpresa;
    private javax.swing.JTextField jText_NomeEmpresa;
    private javax.swing.JTextField jText_cnpj;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_inscricao;
    private javax.swing.JTextField jText_numero;
    private javax.swing.JTextField jText_site;
    private javax.swing.JTextField jText_telefone;
    // End of variables declaration//GEN-END:variables
 public void TabelaEmpresaCadastrados() {
        
        Empresa empresa = new Empresa();
        CadastroEmpresa cadastrados = new CadastroEmpresa();
        empresa.setNomeEmpresa(jText_Buscar_Nome.getText().toUpperCase().trim());
        
        ArrayList dados = cadastrados.listarEmpresa(empresa);
        String[] colunas = new String[]{"ID", "NOME", "CNPJ"};
        Tabela modelo = new Tabela(dados, colunas);
        jTable_Empresas_Cadastradas.setModel(modelo);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(0).setResizable(false);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(1).setResizable(false);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(2).setPreferredWidth(290);
        jTable_Empresas_Cadastradas.getColumnModel().getColumn(2).setResizable(false);
       
        jTable_Empresas_Cadastradas.getTableHeader().setReorderingAllowed(false);
        jTable_Empresas_Cadastradas.setAutoResizeMode(jTable_Empresas_Cadastradas.AUTO_RESIZE_OFF);
        jTable_Empresas_Cadastradas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
private void novo() {
        limparCampos();
        jText_NomeEmpresa.setEnabled(true);
        CBEmpresa.setEnabled(true);
        jText_cnpj.setEnabled(true);
        jText_inscricao.setEnabled(true);
        jText_email.setEnabled(true);
        jText_site.setEnabled(true);
        jText_numero.setEnabled(true);
        jText_telefone.setEnabled(true);

    }

 private void limparCampos() {
        jText_NomeEmpresa.setText("");
        CBEmpresa.setSelectedItem("");
        jText_cnpj.setText("");
        jText_inscricao.setText("");
        jText_email.setText("");
        jText_site.setText("");
        jText_numero.setText("");
        jText_telefone.setText("");
        // jText_NomeBairro.setEditable(false);
        //CBCidade.setEditable(false);
        TabelaEmpresaCadastrados();

       
    }
 private void salvar() {
        
        if(!(jText_NomeEmpresa.getText().isEmpty()| jText_cnpj.getText().isEmpty()| jText_inscricao.getText().isEmpty()| jText_email.getText().isEmpty()| jText_site.getText().isEmpty()| jText_numero.getText().isEmpty()| jText_telefone.getText().isEmpty()| CBEmpresa.getSelectedItem().toString().isEmpty())){
            Empresa empresa = new Empresa();
            
            empresa.setNomeEmpresa(jText_NomeEmpresa.getText().trim().toUpperCase());
            empresa.setCnpj(Integer.valueOf(jText_cnpj.getText().trim()));
            empresa.setInscricaoEstadual(Integer.valueOf(jText_inscricao.getText().trim()));
            empresa.setEmail(jText_email.getText().trim().toUpperCase());
            empresa.setSite(jText_site.getText().trim().toUpperCase());
            empresa.setNumero(Integer.valueOf(jText_numero.getText().trim()));
            empresa.setTelefone(Integer.valueOf(jText_telefone.getText().trim()));
            empresa.setTelefone(Integer.valueOf(jText_telefone.getText().trim()));
            int codCep = ((Cep) CBEmpresa.getSelectedItem()).getCodigo();
         //   empresa.setCodigo(codCep);
            
            System.out.println("aqui :" + empresa.getNomeEmpresa());
            System.out.println("aqui :" + empresa.getCnpj());
            System.out.println("aqui :" + empresa.getInscricaoEstadual());
            System.out.println("aqui :" + empresa.getEmail());
            System.out.println("aqui :" + empresa.getSite());
            System.out.println("aqui :" + empresa.getNumero());
            System.out.println("aqui :" + empresa.getTelefone());
            System.out.println("aqui :" + empresa.getCodigo());
            
            
            CadastroEmpresa cadastrar = new CadastroEmpresa();
            cadastrar.IncluirEmpresa(empresa);
            novo();
        }else{
            JOptionPane.showMessageDialog(this, "Dados Inválidos");
        }
     }
}
