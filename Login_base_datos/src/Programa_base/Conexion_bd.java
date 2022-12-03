/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa_base;

/**
 *
 * @author JORGE GUTIERREZ
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion_bd {
    private final String base = "login";
    private final String user = "root";
    private final String password = "1234";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con= null;
    
    public Connection getConexion(){
    
        try {
            Class.forName(driver);
            
            con = DriverManager.getConnection(url,user,password);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion_bd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return con; 
        
    }
  
     
    
}
