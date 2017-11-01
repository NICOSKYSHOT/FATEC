package view;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnCadCli = new javax.swing.JButton();
        btnCadQua = new javax.swing.JButton();
        btnConCli = new javax.swing.JButton();
        btnConQua = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadQua = new javax.swing.JMenuItem();
        menuConCli = new javax.swing.JMenuItem();
        menuConQua = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(210, 280));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 280));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Burj Al Fatec");

        BtnCadCli.setBackground(new java.awt.Color(204, 153, 0));
        BtnCadCli.setText("Cadastro Cliente");
        BtnCadCli.setToolTipText("");
        BtnCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadCliActionPerformed(evt);
            }
        });

        btnCadQua.setBackground(new java.awt.Color(204, 153, 0));
        btnCadQua.setText("Cadastro Quarto");
        btnCadQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadQuaActionPerformed(evt);
            }
        });

        btnConCli.setBackground(new java.awt.Color(204, 153, 0));
        btnConCli.setText("Consulta Cliente");
        btnConCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConCliActionPerformed(evt);
            }
        });

        btnConQua.setBackground(new java.awt.Color(204, 153, 0));
        btnConQua.setText("Consulta Quarto");
        btnConQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConQuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(BtnCadCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadQua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConQua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(BtnCadCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadQua)
                .addGap(8, 8, 8)
                .addComponent(btnConCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConQua)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 0));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 0));

        jMenu1.setText("Navegação");

        menuCadCli.setText("Cadastro Cliente");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadCli);

        menuCadQua.setText("Cadastro Quarto");
        menuCadQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadQuaActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadQua);

        menuConCli.setText("Consultar Clientes");
        menuConCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConCliActionPerformed(evt);
            }
        });
        jMenu1.add(menuConCli);

        menuConQua.setText("Consultar Quartos");
        menuConQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConQuaActionPerformed(evt);
            }
        });
        jMenu1.add(menuConQua);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadCliActionPerformed
       CadastroCliente frame = new CadastroCliente();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnCadCliActionPerformed

    private void btnCadQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadQuaActionPerformed
       CadastroQuarto frame = new CadastroQuarto();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCadQuaActionPerformed

    private void btnConCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConCliActionPerformed
       ConsultarCliente frame = new ConsultarCliente();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnConCliActionPerformed

    private void btnConQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConQuaActionPerformed
       ConsultarQuarto frame = new ConsultarQuarto();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnConQuaActionPerformed

    private void menuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCliActionPerformed
       CadastroCliente frame = new CadastroCliente();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuCadCliActionPerformed

    private void menuCadQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadQuaActionPerformed
       CadastroQuarto frame = new CadastroQuarto();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuCadQuaActionPerformed

    private void menuConCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConCliActionPerformed
       ConsultarCliente frame = new ConsultarCliente();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuConCliActionPerformed

    private void menuConQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConQuaActionPerformed
       ConsultarQuarto frame = new ConsultarQuarto();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuConQuaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadCli;
    private javax.swing.JButton btnCadQua;
    private javax.swing.JButton btnConCli;
    private javax.swing.JButton btnConQua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuCadCli;
    private javax.swing.JMenuItem menuCadQua;
    private javax.swing.JMenuItem menuConCli;
    private javax.swing.JMenuItem menuConQua;
    // End of variables declaration//GEN-END:variables
}