/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionCashier {
    
    private static Connection contacto = null;
    private static boolean status = false;
    private static String usuario = "davis";
    private static String password = "0631212";
    
    /*Esta clase se encarga de realizar las conexiones a la Base de datos de los
    cajeros exclusivamente
    */
    public static Connection getConexion(){
        
        status = false;
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Supermercado";
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Nose pudo establecer la conexion... revisar Driver"+
                    e.getMessage() + " Error de conexion" + JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            contacto = DriverManager.getConnection(url, usuario, password);
            status = true;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
    //Clase para devolver un true si la conexion se realizo con exito
    //P.D: Solo se utiliza cuando se quiere confirma la conexion
    public static boolean getStatus(){
        return status;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
