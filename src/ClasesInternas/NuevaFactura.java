/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vivia Jones
 */
public class NuevaFactura extends javax.swing.JInternalFrame {
    
    private JPanel panel;

    /**
     * Creates new form NuevaFactura
     */
    public NuevaFactura() {
        initComponents();
        setTitle("Cajero");
        NumeroFactura();
        ProductoCombo();
        setLocation(200, 50);
    }
    
    public NuevaFactura(String cEmail, String cPass){
        initComponents();
        ProductoCantidadtxt.setText(cEmail);
        Totaltxt.setText(cPass);
    }
    
    //Este metodo me permite sumar automaticamente el precio de los productos y
    //Mostrarlo en el jtextfield de Total
    public void SumaPrecio(){
        float suma = 0;
        for(int i = 0; i < CajaTablatbl.getRowCount(); i++){
            suma = suma + (Float.parseFloat(CajaTablatbl.getValueAt(i, 3)
                    .toString()) * Float.parseFloat(CajaTablatbl.getValueAt(i, 1)
                            .toString()));
        }
        Totaltxt.setText("$" + Float.toString(suma));
    }
    //La funcion de este metodo es rellenar el campo con los valores de la Base de datos
    //para su futro uso
    public void ProductoCombo(){
        try{
            PreparedStatement stmt = ClasesInternas.ConexionCashier
                    .getConexion()
                    .prepareStatement("SELECT idproducto, nombre FROM Producto");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                ProductoCombobx.addItem(res.getString(1));
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    //Rellenar el campo Factura n° con el numero de factura correspondiente
    public void NumeroFactura(){
        try{
            PreparedStatement stmt = ClasesInternas.ConexionCashier.
                    getConexion().prepareStatement("SELECT COUNT(*) FROM Factura");
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                int contador = Integer.parseInt(res.getString(1));
                contador = contador + 1;
                FacturaNumerotxt.setText(String.valueOf(contador));
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NumeroFacturalbl = new javax.swing.JLabel();
        ProductoIdlbl = new javax.swing.JLabel();
        ProductoNombrelbl = new javax.swing.JLabel();
        ProductoPreciolbl = new javax.swing.JLabel();
        ProductoCantidadlbl = new javax.swing.JLabel();
        FacturaNumerotxt = new javax.swing.JTextField();
        ProductoNombretxt = new javax.swing.JTextField();
        ProductoPreciotxt = new javax.swing.JTextField();
        ProductoCantidadtxt = new javax.swing.JTextField();
        Añadirbtn = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        CajaTablatbl = new javax.swing.JTable();
        Totallbl = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        Facturarbtn = new javax.swing.JButton();
        ProductoCombobx = new javax.swing.JComboBox<>();
        Eliminarbtn = new javax.swing.JButton();

        setClosable(true);

        NumeroFacturalbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NumeroFacturalbl.setText("Factura n°");

        ProductoIdlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductoIdlbl.setText("Producto ID");

        ProductoNombrelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductoNombrelbl.setText("Nombre");

        ProductoPreciolbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductoPreciolbl.setText("Precio");

        ProductoCantidadlbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductoCantidadlbl.setText("Cantidad");

        FacturaNumerotxt.setEditable(false);
        FacturaNumerotxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FacturaNumerotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaNumerotxtActionPerformed(evt);
            }
        });

        ProductoNombretxt.setEditable(false);
        ProductoNombretxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ProductoPreciotxt.setEditable(false);
        ProductoPreciotxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ProductoCantidadtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Añadirbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Añadirbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7-32.png"))); // NOI18N
        Añadirbtn.setText("Añadir");
        Añadirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirbtnActionPerformed(evt);
            }
        });

        CajaTablatbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cantidad", "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scroll.setViewportView(CajaTablatbl);

        Totallbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Totallbl.setText("Total");

        Totaltxt.setEditable(false);
        Totaltxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });

        Facturarbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Facturarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cart.png"))); // NOI18N
        Facturarbtn.setText("Facturar");
        Facturarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarbtnActionPerformed(evt);
            }
        });

        ProductoCombobx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProductoCombobx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoCombobxActionPerformed(evt);
            }
        });

        Eliminarbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eliminarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/del.png"))); // NOI18N
        Eliminarbtn.setText("Remover");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(103, 517, Short.MAX_VALUE)
                .addComponent(Facturarbtn)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductoIdlbl)
                                    .addComponent(NumeroFacturalbl)
                                    .addComponent(ProductoNombrelbl)
                                    .addComponent(ProductoPreciolbl)
                                    .addComponent(ProductoCantidadlbl))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FacturaNumerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductoNombretxt)
                                    .addComponent(ProductoPreciotxt)
                                    .addComponent(ProductoCantidadtxt)
                                    .addComponent(ProductoCombobx, 0, 132, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Añadirbtn)
                                .addGap(18, 18, 18)
                                .addComponent(Eliminarbtn)))
                        .addGap(18, 18, 18)
                        .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(Totallbl)
                        .addGap(18, 18, 18)
                        .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeroFacturalbl)
                            .addComponent(FacturaNumerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProductoCombobx)
                            .addComponent(ProductoIdlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductoNombrelbl)
                            .addComponent(ProductoNombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductoPreciolbl)
                            .addComponent(ProductoPreciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductoCantidadlbl)
                            .addComponent(ProductoCantidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Añadirbtn)
                            .addComponent(Eliminarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totallbl)
                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Facturarbtn)
                .addGap(32, 32, 32))
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

    private void FacturaNumerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaNumerotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacturaNumerotxtActionPerformed

    private void ProductoCombobxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoCombobxActionPerformed
        // TODO add your handling code here:
        try{
            String selec = (String)ProductoCombobx.getSelectedItem();
            
            PreparedStatement stmt = ClasesInternas.ConexionCashier
                    .getConexion()
                    .prepareStatement("SELECT idproducto, nombre, precio FROM"
                            + " Producto WHERE idproducto = ?");
            stmt.setString(1, selec);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                String nombreprod = res.getString("nombre");
                Float precio = res.getFloat("precio");
                ProductoNombretxt.setText(nombreprod);
                ProductoPreciotxt.setText(precio.toString());
                }
            }catch(SQLException e){
            e.getMessage();
        }
    }//GEN-LAST:event_ProductoCombobxActionPerformed

    private void AñadirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)CajaTablatbl.getModel();
        int pId = Integer.parseInt(ProductoCombobx.getSelectedItem().toString());
        String pNombre = ProductoNombretxt.getText(); //Nombre del Producto
        Float pPrecio = Float.parseFloat(ProductoPreciotxt.getText()); //Precio del Producto
        int pCantidad = Integer.parseInt(ProductoCantidadtxt.getText());
        Vector vec = new Vector();
        vec.add(pId);
        vec.add(pCantidad);
        vec.add(pNombre);
        vec.add(pPrecio);
        model.addRow(vec);
        CajaTablatbl.setModel(model);
        SumaPrecio();
    }//GEN-LAST:event_AñadirbtnActionPerformed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabla = (DefaultTableModel) CajaTablatbl.getModel();
        int columna = CajaTablatbl.getSelectedRow();
        
        final JTextField user = new JTextField(20);
        final JPasswordField pass = new JPasswordField(20);
        panel = new JPanel(new GridLayout(2, 2));
        
        panel.add(new JLabel("Correo: "));
        panel.add(user);
        panel.add(Box.createHorizontalBox());
        panel.add(new JLabel("Contraseña: "));
        panel.add(pass);
        
        int resultado = JOptionPane.showConfirmDialog(null, panel,
                "Login Administrador", JOptionPane.OK_CANCEL_OPTION);
        if(resultado == JOptionPane.OK_OPTION){
            AutenticacionAdmin autentadm = new AutenticacionAdmin();
            String userfinal = user.getText();
            String passfinal = pass.getText();
            if(autentadm.Autenticacion(userfinal, passfinal)){
                tabla.removeRow(columna);
                JOptionPane.showMessageDialog(null, "Producto Removido",
                        "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,
                        "Usuario o Contraseña incorrecta!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void FacturarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CajaTablatbl.getModel();
        
        final JComboBox box = new JComboBox();
        final JComboBox corr = new JComboBox();
        panel = new JPanel(new GridLayout(2, 2));
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/invoice.png"));
        panel.add(new JLabel("Vendedor: "));
        panel.add(corr);
        panel.add(Box.createHorizontalBox());
        panel.add(new JLabel("Metodo de Pago:"));
        panel.add(box);
        //Este try se encarga de rellenar los combobox con datos de la Base de datos
        try{
            try{
                PreparedStatement stmt = ClasesInternas
                    .ConexionCashier.getConexion()
                    .prepareStatement("SELECT * FROM Vendedor");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                corr.addItem(res.getString("email"));
            }
            }catch(SQLException e){
                e.getMessage();
            }
            
            try{
                PreparedStatement stmt = ClasesInternas
                    .ConexionCashier.getConexion()
                    .prepareStatement("SELECT * FROM ModoPago");
                ResultSet res = stmt.executeQuery();
                while(res.next()){
                    box.addItem(res.getString("nombre") + "-" +
                            res.getString("descripcion"));
                }
            }catch(SQLException e){
                e.getMessage();
            }
        }catch(Exception e){
            e.getMessage();
        }
        //Aqui finaliza el try para los ComboBox
            
        //Inicializa el JPanel perzonalizado para seleccionar el metodo de pago y vendedor que realiza la factura
        int resultado = JOptionPane.showConfirmDialog(this, panel,
                "Facturación", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icon);
        
        if(resultado == JOptionPane.OK_OPTION){
            try{
                //Pedir el id del vendedor segun su Correo
                PreparedStatement stmt1 = ClasesInternas
                        .ConexionCashier
                        .getConexion().prepareStatement("SELECT idvendedor FROM Vendedor WHERE email = ?");
                String uCorreo = (String) corr.getSelectedItem();
                stmt1.setString(1, uCorreo);
                ResultSet res1 = stmt1.executeQuery();
                String uIdvend = "";
                if(res1.next()){
                    uIdvend = res1.getString("idvendedor");
                }
                stmt1.close();
                res1.close();
                //Finalizacion de la consulta correo
                
                //Inserta los valores de la tabla y combobox al finalizar la transaccion
                int columnas = CajaTablatbl.getRowCount();
                Connection conn = ClasesInternas.ConexionCashier.getConexion();
                conn.setAutoCommit(false);
                PreparedStatement stmt = conn
                        .prepareStatement("INSERT INTO Factura(idproducto,"
                                + " idpago, idvendedor, cantidad, precio)"
                                + " VALUES (?, ?, ?, ?, ?);");
                for(int i = 0; i < columnas; i++){
                    int idprod = Integer.parseInt(CajaTablatbl.getValueAt(i, 0).toString());
                    int cantid = Integer.parseInt(CajaTablatbl.getValueAt(i, 1).toString());
                    float preci = Float.parseFloat(CajaTablatbl.getValueAt(i, 3).toString());
                    
                    int idpag = box.getSelectedIndex() + 1;
                    stmt.setInt(1, idprod);
                    stmt.setString(2, Integer.toString(idpag));
                    stmt.setString(3, uIdvend);
                    stmt.setInt(4, cantid);
                    stmt.setFloat(5, preci);
                    
                    stmt.addBatch();
                }
                
                stmt.executeBatch();
                conn.commit();
                stmt.close();
                conn.close();
                //Aqui finaliza el codigo de la insercion de facturacion
                
                //Este pedazo de codigo es para restarle la cantidad de productos vendidos a la Base de Datos
                PreparedStatement stmtcan = ClasesInternas
                        .ConexionCashier.getConexion()
                        .prepareStatement("UPDATE Producto SET "
                                + "stock = stock - ? WHERE idproducto = ?");
                for(int i = 0; i < columnas; i++){
                    int cCantidad = Integer.parseInt(CajaTablatbl.getValueAt(i, 1).toString());
                    int cIdprod = Integer.parseInt(CajaTablatbl.getValueAt(i, 0).toString());
                    
                    stmtcan.setInt(1, cCantidad);
                    stmtcan.setInt(2, cIdprod);
                    
                    stmtcan.addBatch();
                }
                
                stmtcan.executeBatch();
                stmtcan.close();
            }catch(SQLException e){
                e.getMessage();
            }
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
          
            MessageFormat header = new MessageFormat("Factura Supermercados Romero");
            MessageFormat footer = new MessageFormat("Por ti hacemos lo que hacemos");
            
            try{
                CajaTablatbl.print(JTable.PrintMode.FIT_WIDTH, header, footer); 
            }catch(PrinterException e){
                System.err.format("No se puede imprimir ", e.getMessage());
            }
            
            model.setRowCount(0);
            model.fireTableDataChanged();
            Totaltxt.setText("$");
            NumeroFactura();
            JOptionPane.showMessageDialog(this, "Transaccion Finalizada!", "Transacción", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Transaccion cancelada!", "Transacción", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_FacturarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadirbtn;
    private javax.swing.JTable CajaTablatbl;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JTextField FacturaNumerotxt;
    private javax.swing.JButton Facturarbtn;
    private javax.swing.JLabel NumeroFacturalbl;
    private javax.swing.JLabel ProductoCantidadlbl;
    private javax.swing.JTextField ProductoCantidadtxt;
    private javax.swing.JComboBox<String> ProductoCombobx;
    private javax.swing.JLabel ProductoIdlbl;
    private javax.swing.JLabel ProductoNombrelbl;
    private javax.swing.JTextField ProductoNombretxt;
    private javax.swing.JLabel ProductoPreciolbl;
    private javax.swing.JTextField ProductoPreciotxt;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel Totallbl;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
