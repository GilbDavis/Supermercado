/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gilberto Davis 1-741-815
 */
public class AutenticacionCashier extends ConexionCashier{
    
    public boolean Autenticacion(String user, String pass){
        
        ClasesInternas.ConexionCashier.getConexion();
        try{
            String consulta       = "SELECT * FROM Vendedor WHERE email = ? AND pass = ?";
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
