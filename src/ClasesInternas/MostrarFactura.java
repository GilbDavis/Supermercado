/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import static ClasesInternas.CreateCashier.res;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
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
        CargarArticulo();
        setLocation(200, 50);
        Date();
    }
    
    public void Date(){
        String date =DatePicker.getDate().toString();
        Cedulatxt.setText(date);
    }
    
    public void CargarArticulo(){
        DefaultTableModel modelo = (DefaultTableModel) Facturatbl.getModel();
        modelo.setRowCount(0);
        try{
            PreparedStatement stmt = ClasesInternas.ConexionAdmin.getConexion().
                prepareStatement("SELECT Factura.idfactura AS [IdFactura],"
                        + " Vendedor.nombre AS Vendedor, Vendedor.cedula AS"
                        + " Cedula, " +
                        " Factura.fecha AS [Fecha Factura] ,Detalle.cantidad, " +
                        "Producto.nombre AS Nombre_Producto, "
                        + "dbo.Total(Detalle.precio, Detalle.cantidad) AS Total," +
                        "(ModoPago.nombre + ' - ' + ModoPago.descripcion) AS"
                        + " [Modo_Pago] FROM Factura" +
                        "INNER JOIN Detalle ON Factura.idfactura = Detalle.idfactura" +
                        "INNER JOIN Producto ON Detalle.idproducto = Producto.idproducto" +
                        "INNER JOIN ModoPago ON ModoPago.idpago = Factura.idpago" +
                        "INNER JOIN Vendedor ON Vendedor.idvendedor = Factura.idvendedor" +
                        "WHERE Factura.idfactura = ? OR Vendedor.cedula = ? OR Factura.fecha = ?" +
                        "GROUP BY Factura.idfactura, Vendedor.nombre,"
                        + " Vendedor.cedula, Factura.fecha, Detalle.cantidad,"
                        + " Producto.nombre, " +
                        "Detalle.precio, ModoPago.nombre, ModoPago.descripcion;");
            stmt.setString(1, FacturaIdtxt.getText());
            stmt.setString(2, Cedulatxt.getText());
            stmt.setDate(3, (Date) DatePicker.getDate());
            res = stmt.executeQuery();
            while(res.next()){
             Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getFloat(6));
                v.add(res.getString(7));
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
        Fechalbl = new javax.swing.JLabel();
        Buscarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Facturatbl = new javax.swing.JTable();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);

        Titulolbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Titulolbl.setText("Buscar Facturas");

        Idlbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Idlbl.setText("Factura ID:");

        Cedulalbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Cedulalbl.setText("Vendedor Cedula:");

        Fechalbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Fechalbl.setText("Fecha Factura");

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
                "IdFactura", "Vendedor", "Cedula", "Fecha_Factura", "Cantidad", "Nombre_Producto", "Total", "ModoPago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fechalbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(Cedulalbl))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(Idlbl))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FacturaIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cedulatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(Buscarbtn)
                            .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(Titulolbl)))
                .addContainerGap(29, Short.MAX_VALUE))
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
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FacturaIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cedulatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(Cedulalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fechalbl, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addComponent(Buscarbtn)))
                .addContainerGap(35, Short.MAX_VALUE))
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
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JTextField FacturaIdtxt;
    private javax.swing.JTable Facturatbl;
    private javax.swing.JLabel Fechalbl;
    private javax.swing.JLabel Idlbl;
    private javax.swing.JLabel Titulolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
