package view;

import bean.Cliente;
import control.ClienteControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConsultarCliente extends javax.swing.JFrame {

    public ConsultarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDatanas = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarCli = new javax.swing.JButton();
        BtnLimpa = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAlterarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        Nav = new javax.swing.JMenu();
        menuHome = new javax.swing.JMenuItem();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadQua = new javax.swing.JMenuItem();
        menuConCli = new javax.swing.JMenuItem();
        menuConQua = new javax.swing.JMenuItem();
        Op = new javax.swing.JMenu();
        menuBuscar = new javax.swing.JMenuItem();
        menuLimpar = new javax.swing.JMenuItem();
        menuAlterar = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 98, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 0));
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Sexo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 144, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 0));
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Data de Nascimento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 0));
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("CPF");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 236, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 118, 166, -1));
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 164, 166, -1));
        jPanel1.add(txtDatanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 210, 166, -1));
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 256, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Consulta Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));

        btnBuscarCli.setBackground(new java.awt.Color(204, 153, 0));
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 110, -1));

        BtnLimpa.setBackground(new java.awt.Color(204, 153, 0));
        BtnLimpa.setText("Limpar");
        BtnLimpa.setToolTipText("");
        BtnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 170, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("ID PARA BUSCA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("Busca Por Cliente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 5, 170, -1));

        btnAlterarCli.setBackground(new java.awt.Color(204, 153, 0));
        btnAlterarCli.setText("Alterar");
        btnAlterarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 172, -1));

        btnExcluirCli.setBackground(new java.awt.Color(204, 153, 0));
        btnExcluirCli.setText("Excluir");
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 253, 172, -1));

        jButton1.setText("jButton1");

        Nav.setText("Navegação");

        menuHome.setText("Home");
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });
        Nav.add(menuHome);

        menuCadCli.setText("Cadastro Cliente");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        Nav.add(menuCadCli);

        menuCadQua.setText("Cadastro Quarto");
        menuCadQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadQuaActionPerformed(evt);
            }
        });
        Nav.add(menuCadQua);

        menuConCli.setText("Consultar Clientes");
        menuConCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConCliActionPerformed(evt);
            }
        });
        Nav.add(menuConCli);

        menuConQua.setText("Consultar Quartos");
        menuConQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConQuaActionPerformed(evt);
            }
        });
        Nav.add(menuConQua);

        jMenuBar2.add(Nav);

        Op.setText("Opções");

        menuBuscar.setText("Buscar");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        Op.add(menuBuscar);

        menuLimpar.setText("Limpar");
        menuLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLimparActionPerformed(evt);
            }
        });
        Op.add(menuLimpar);

        menuAlterar.setText("Alterar");
        menuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarActionPerformed(evt);
            }
        });
        Op.add(menuAlterar);

        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        Op.add(menuExcluir);

        jMenuBar2.add(Op);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
       Home frame = new Home();
       frame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
    int id = Integer.parseInt(txtId.getText());
   
    Cliente cli = new Cliente(id,"","","","");
    ClienteControle clicont = new ClienteControle();
    
        try {
            cli = clicont.buscarCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null,"BUSCA REALIZADA");
        
        txtNome.setText(cli.getNome());
        txtSexo.setText(cli.getSexo());
        txtDatanas.setText(cli.getDatanas());
        txtCpf.setText(cli.getCpf());
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimparActionPerformed
        txtNome.setText("");
        txtSexo.setText("");
        txtDatanas.setText("");
        txtCpf.setText("");
        txtId.setText("");
    }//GEN-LAST:event_menuLimparActionPerformed

    private void BtnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpaActionPerformed
        txtNome.setText("");
        txtSexo.setText("");
        txtDatanas.setText("");
        txtCpf.setText("");
        txtId.setText("");
    }//GEN-LAST:event_BtnLimpaActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
    int id = Integer.parseInt(txtId.getText());
   
   
    Cliente cli = new Cliente(id,"","","","");
    ClienteControle clicont = new ClienteControle();
    
        try {
            cli = clicont.buscarCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null,"BUSCA REALIZADA");
        
        txtNome.setText(cli.getNome());
        txtSexo.setText(cli.getSexo());
        txtDatanas.setText(cli.getDatanas());
        txtCpf.setText(cli.getCpf());
    }//GEN-LAST:event_btnBuscarCliActionPerformed

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

    private void btnAlterarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCliActionPerformed
    int id = Integer.parseInt(txtId.getText());
    String nome = txtNome.getText();
    String sexo = txtSexo.getText();
    String datanas = txtDatanas.getText();
    String cpf = txtCpf.getText();
    
    Cliente cli = new Cliente(id,nome,sexo,datanas,cpf);
    ClienteControle cliCont = new ClienteControle();
        try {
            cli  = cliCont.alterarCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarCliActionPerformed

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
    int id = Integer.parseInt(txtId.getText());
    
    Cliente cli = new Cliente(id,"","","","");
    ClienteControle cliCont = new ClienteControle();
        try {
            cli = cliCont.excluirCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirCliActionPerformed

    private void menuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarActionPerformed
    int id = Integer.parseInt(txtId.getText());
    String nome = txtNome.getText();
    String sexo = txtSexo.getText();
    String datanas = txtDatanas.getText();
    String cpf = txtCpf.getText();
    
    Cliente cli = new Cliente(id,nome,sexo,datanas,cpf);
    ClienteControle cliCont = new ClienteControle();
        try {
            cli  = cliCont.alterarCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAlterarActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
         int id = Integer.parseInt(txtId.getText());
    
    Cliente cli = new Cliente(id,"","","","");
    ClienteControle cliCont = new ClienteControle();
        try {
            cli = cliCont.excluirCliente(cli);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ConsultarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new ConsultarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpa;
    private javax.swing.JMenu Nav;
    private javax.swing.JMenu Op;
    private javax.swing.JButton btnAlterarCli;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private javax.swing.JMenuItem menuAlterar;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenuItem menuCadCli;
    private javax.swing.JMenuItem menuCadQua;
    private javax.swing.JMenuItem menuConCli;
    private javax.swing.JMenuItem menuConQua;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuHome;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDatanas;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}