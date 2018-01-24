/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.simed.view;

/**
 *
 * @author Ranster
 */
public class JFrameLogin extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public JFrameLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogin1 = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        botaoConectar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jPsenha = new javax.swing.JPasswordField();

        jLabelLogin1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simed/images/icons/userr.png"))); // NOI18N
        jLabelLogin1.setText("Usuário:");

        jLabelSenha.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simed/images/icons/senha.png"))); // NOI18N
        jLabelSenha.setText("Senha:");

        jTusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTusuarioActionPerformed(evt);
            }
        });

        botaoConectar.setBackground(new java.awt.Color(228, 238, 248));
        botaoConectar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        botaoConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simed/images/icons/2683_32x32.png"))); // NOI18N
        botaoConectar.setText("Conectar");
        botaoConectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConectar.setPreferredSize(new java.awt.Dimension(100, 80));
        botaoConectar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConectarActionPerformed(evt);
            }
        });

        botaoCancelar.setBackground(new java.awt.Color(228, 238, 248));
        botaoCancelar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/simed/images/icons/Log_Out_Icon_32.png"))); // NOI18N
        botaoCancelar.setText("Sair");
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCancelar.setMaximumSize(new java.awt.Dimension(105, 33));
        botaoCancelar.setMinimumSize(new java.awt.Dimension(105, 33));
        botaoCancelar.setPreferredSize(new java.awt.Dimension(100, 80));
        botaoCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTusuario)
                            .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoConectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelLogin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTusuarioActionPerformed

    private void botaoConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConectarActionPerformed
        JFramePrincipal tela = new JFramePrincipal();
        tela.setVisible(true);
        //dispose();

        //Recebendo URL do Banco de Dados
        /*        try {
            FileInputStream stream = new FileInputStream("urlDB.conf");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);

            conexaoDB.setUrl(br.readLine());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frameLogin.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(frameLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Fim

        Usuario usuario = new Usuario();
        usuario.setLogin(jTusuario.getText().toUpperCase().trim());
        usuario.setSenha(new String(jPsenha.getPassword()));

        CadastroUsuario validarUsuario = new CadastroUsuario();

        if (validarUsuario.validaUsuario(usuario)) {

            framePrincipal.setLogado(usuario);
            framePrincipal.getInstancia();
            framePrincipal.getInstancia().setExtendedState(framePrincipal.MAXIMIZED_BOTH);
            framePrincipal.getInstancia().setLocationRelativeTo(null);
            framePrincipal.getInstancia().setVisible(true);

            framePrincipal.setPermissoes();

            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Dados não conferem");
        }
        */
    }//GEN-LAST:event_botaoConectarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
    }//GEN-LAST:event_botaoCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConectar;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPsenha;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
