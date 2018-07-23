/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vivia Jones
 */
public class MostrarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form MostrarFactura
     */
    public MostrarFactura() {
        initComponents();
        setTitle("Facturas");
        setLocation(200, 50);
    }
    //No esta siendo utilizada pero sirve para rellenar la tabla con toda la informacion de la base de datos por defecto
    public void CargarData(){
        try{
            DefaultTableModel modelo = (DefaultTableModel) Facturatbl.getModel();
            modelo.setRowCount(0);
            PreparedStatement stmt = ClasesInternas.ConexionAdmin.getConexion().
                prepareStatement("SELECT Factura.idfactura AS [IdFactura], Vendedor.nombre AS Vendedor, Vendedor.cedula AS Cedula,\n" +
                    " Factura.fecha AS [Fecha Factura] , \n" +
                    "Producto.nombre AS Nombre_Producto, Factura.cantidad, (Factura.precio * Factura.cantidad) AS Total, (ModoPago.nombre + ' - ' + ModoPago.descripcion) AS [Modo_Pago] FROM Factura\n" +
                    "INNER JOIN Producto ON Factura.idproducto = Producto.idproducto\n" +
                    "INNER JOIN ModoPago ON ModoPago.idpago = Factura.idpago\n" +
                    "INNER JOIN Vendedor ON Vendedor.idvendedor = Factura.idvendedor");
            ResultSet res = stmt.executeQuery();
            Vector v = new Vector();
            while(res.next()){
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getInt(6));
                v.add(res.getFloat(7));
                v.add(res.getString(8));
                modelo.addRow(v);
                Facturatbl.setModel(modelo);
            }
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
    public void CargarArticulo(){
        DefaultTableModel modelo = (DefaultTableModel) Facturatbl.getModel();
        modelo.setRowCount(0);
        try{
            PreparedStatement stmt = ClasesInternas.ConexionAdmin.getConexion().
                prepareStatement("SELECT Factura.idfactura AS [IdFactura], Vendedor.nombre AS Vendedor, Vendedor.cedula AS Cedula,\n" +
                    " Factura.fecha AS [Fecha Factura] , \n" +
                    "Producto.nombre AS Nombre_Producto, Factura.cantidad, (Factura.precio * Factura.cantidad) AS Total, (ModoPago.nombre + ' - ' + ModoPago.descripcion) AS [Modo_Pago] FROM Factura\n" +
                    "INNER JOIN Producto ON Factura.idproducto = Producto.idproducto\n" +
                    "INNER JOIN ModoPago ON ModoPago.idpago = Factura.idpago\n" +
                    "INNER JOIN Vendedor ON Vendedor.idvendedor = Factura.idvendedor\n" +
                    "WHERE Factura.idfactura = ? AND Vendedor.cedula = ?");
            stmt.setString(1, FacturaIdtxt.getText());
            stmt.setString(2, Cedulatxt.getText());
            ResultSet resul = stmt.executeQuery();
            Vector v = new Vector();
            while(resul.next()){
                v.add(resul.getInt(1));
                v.add(resul.getString(2));
                v.add(resul.getString(3));
                v.add(resul.getString(4));
                v.add(resul.getString(5));
                v.add(resul.getInt(6));
                v.add(resul.getFloat(7));
                v.add(resul.getString(8));
                modelo.addRow(v);
                Facturatbl.setModel(modelo);
            }
        }catch(SQLException e){
            e.getMessage();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulolbl = new javax.swing.JLabel();
        Idlbl = new javax.swing.JLabel();
        FacturaIdtxt = new javax.swing.JTextField();
        Cedulalbl = new javax.swing.JLabel();
        Cedulatxt = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Facturatbl = new javax.swing.JTable();

        setClosable(true);

        Titulolbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulolbl.setText("Buscar Facturas");

        Idlbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Idlbl.setText("Factura ID:");

        Cedulalbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Cedulalbl.setText("Vendedor Cedula:");

        Buscarbtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search-32.png"))); // NOI18N
        Buscarbtn.setText("Buscar");
        Buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtnActionPerformed(evt);
            }
        });

        Facturatbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdFactura", "Vendedor", "Cedula", "Fecha", "Producto", "Cantidad", "Total", "ModoPago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Facturatbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Idlbl)
                                    .addComponent(Cedulalbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FacturaIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Buscarbtn)
                                .addGap(110, 110, 110)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(Titulolbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Titulolbl)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FacturaIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cedulalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(Buscarbtn)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

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

    private void BuscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtnActionPerformed
        // TODO add your handling code here:
        CargarArticulo();
    }//GEN-LAST:event_BuscarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JLabel Cedulalbl;
    private javax.swing.JTextField Cedulatxt;
    private javax.swing.JTextField FacturaIdtxt;
    private javax.swing.JTable Facturatbl;
    private javax.swing.JLabel Idlbl;
    private javax.swing.JLabel Titulolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
