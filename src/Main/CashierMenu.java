/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ClasesInternas.InformacionProducto;
import ClasesInternas.MostrarFactura;
import ClasesInternas.NuevaFactura;
import java.awt.Toolkit;

/**
 *
 * @author Vivia Jones
 */
public class CashierMenu extends javax.swing.JFrame {

    /**
     * Creates new form CashierMenu
     */
    public CashierMenu() {
        initComponents();
        setTitle("Menu del Cajero");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon.png")));
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
        ProductSearchBTN = new javax.swing.JButton();
        NewBillBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        CerrarSesionbtn = new javax.swing.JButton();
        LogoLBL = new javax.swing.JLabel();
        ProductInfoBTN = new javax.swing.JButton();
        colorfondo = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductSearchBTN.setBackground(new java.awt.Color(255, 197, 101));
        ProductSearchBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductSearchBTN.setForeground(new java.awt.Color(0, 0, 102));
        ProductSearchBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search-32.png"))); // NOI18N
        ProductSearchBTN.setText("Buscar Factura");
        ProductSearchBTN.setMaximumSize(new java.awt.Dimension(157, 41));
        ProductSearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductSearchBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ProductSearchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 40));

        NewBillBTN.setBackground(new java.awt.Color(255, 197, 101));
        NewBillBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewBillBTN.setForeground(new java.awt.Color(0, 0, 102));
        NewBillBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-32.png"))); // NOI18N
        NewBillBTN.setText("Nueva Factura");
        NewBillBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillBTNActionPerformed(evt);
            }
        });
        jPanel1.add(NewBillBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 160, 40));

        exitBTN.setBackground(new java.awt.Color(255, 197, 101));
        exitBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(0, 0, 102));
        exitBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        exitBTN.setText("Salir");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        jPanel1.add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, -1, 40));

        CerrarSesionbtn.setBackground(new java.awt.Color(255, 197, 101));
        CerrarSesionbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CerrarSesionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit_1.png"))); // NOI18N
        CerrarSesionbtn.setText("Cerrar Sesión");
        CerrarSesionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionbtnActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSesionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, 40));

        LogoLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoSFW.PNG"))); // NOI18N
        jPanel1.add(LogoLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 200, 80));

        ProductInfoBTN.setBackground(new java.awt.Color(255, 197, 101));
        ProductInfoBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductInfoBTN.setForeground(new java.awt.Color(0, 0, 102));
        ProductInfoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cart.png"))); // NOI18N
        ProductInfoBTN.setText("Informacion del Producto");
        ProductInfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductInfoBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ProductInfoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        colorfondo.setBackground(new java.awt.Color(255, 197, 101));
        colorfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bk.jpg"))); // NOI18N
        jPanel1.add(colorfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1370, 100));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void ProductInfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductInfoBTNActionPerformed
        // TODO add your handling code here:
        InformacionProducto prod = new InformacionProducto();
        this.desktop.add(prod);
        prod.setVisible(true);
    }//GEN-LAST:event_ProductInfoBTNActionPerformed

    private void NewBillBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillBTNActionPerformed
        // TODO add your handling code here:
       NuevaFactura nuev = new NuevaFactura();
       this.desktop.add(nuev);
       nuev.setVisible(true);
    }//GEN-LAST:event_NewBillBTNActionPerformed

    private void ProductSearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductSearchBTNActionPerformed
        // TODO add your handling code here:
        MostrarFactura factura = new MostrarFactura();
        this.desktop.add(factura);
        factura.setVisible(true);
    }//GEN-LAST:event_ProductSearchBTNActionPerformed

    private void CerrarSesionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionbtnActionPerformed
        // TODO add your handling code here:
        CashierLogin log = new CashierLogin();
        dispose();
        log.setVisible(true);
    }//GEN-LAST:event_CerrarSesionbtnActionPerformed

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
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesionbtn;
    private javax.swing.JLabel LogoLBL;
    private javax.swing.JButton NewBillBTN;
    private javax.swing.JButton ProductInfoBTN;
    private javax.swing.JButton ProductSearchBTN;
    private javax.swing.JLabel colorfondo;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton exitBTN;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
