/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import static ClasesInternas.ConexionCashier.getConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vivia Jones
 */
public class AutenticacionAdmin extends ConexionAdmin{
    
    public boolean Autenticacion(String user, String pass){
        
        ClasesInternas.ConexionAdmin.getConexion();
        try{
            String consulta       = "SELECT * FROM Administrador WHERE "
                    + "usuario = ? AND pass = ?";
            PreparedStatement pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs          = pst.executeQuery();
            if(rs.next()){
                return true;
            }
            pst.close();
            rs.close();
        }catch(SQLException e){
            System.err.println("Error: " + e);
        }
        return false;
    }
}
