/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ClasesInternas.AutenticacionAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivia Jones
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        Titutlolbl = new javax.swing.JLabel();
        AdminIdlbl = new javax.swing.JLabel();
        PasswordAdminlbl = new javax.swing.JLabel();
        IDimg = new javax.swing.JLabel();
        Passimg = new javax.swing.JLabel();
        AdminIdTXT = new javax.swing.JTextField();
        AdminLoginBTN = new javax.swing.JButton();
        AdminPassJPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        Titutlolbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Titutlolbl.setText("Inicio de Sesion Admin");

        AdminIdlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminIdlbl.setText("Admin ID:");

        PasswordAdminlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordAdminlbl.setText("Password:");

        IDimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/an.png"))); // NOI18N

        Passimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave.png"))); // NOI18N

        AdminLoginBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login (1).png"))); // NOI18N
        AdminLoginBTN.setText("LOGIN");
        AdminLoginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginBTNActionPerformed(evt);
            }
        });

        AdminPassJPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPassJPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Titutlolbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDimg)
                            .addComponent(Passimg))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminIdlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordAdminlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdminIdTXT)
                            .addComponent(AdminPassJPF, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(AdminLoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titutlolbl)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDimg)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminIdlbl)
                        .addComponent(AdminIdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Passimg)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(PasswordAdminlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminPassJPF))
                .addGap(46, 46, 46)
                .addComponent(AdminLoginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPassJPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPassJPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPassJPFActionPerformed

    private void AdminLoginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginBTNActionPerformed
        // TODO add your handling code here:
        String mUser = AdminIdTXT.getText();
        String mPassword = AdminPassJPF.getText();
        
        AutenticacionAdmin autenticacion = new AutenticacionAdmin();
        ClasesInternas.ConexionAdmin.getConexion();
        if(autenticacion.Autenticacion(mUser, mPassword) == true){
            AdminMenu adminmenu = new AdminMenu();
            adminmenu.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido" + mUser + "!",
                    "Felicidades", JOptionPane.INFORMATION_MESSAGE);
            AdminIdTXT.setText("");
            AdminPassJPF.setText("");
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "USUARIO Y CONTRASEÑA INCORRECTO",
                    "Error de Autenticacion", JOptionPane.ERROR_MESSAGE);
            AdminIdTXT.setText("");
            AdminPassJPF.setText("");
        }
    }//GEN-LAST:event_AdminLoginBTNActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminIdTXT;
    private javax.swing.JLabel AdminIdlbl;
    private javax.swing.JButton AdminLoginBTN;
    private javax.swing.JPasswordField AdminPassJPF;
    private javax.swing.JLabel IDimg;
    private javax.swing.JLabel Passimg;
    private javax.swing.JLabel PasswordAdminlbl;
    private javax.swing.JLabel Titutlolbl;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
