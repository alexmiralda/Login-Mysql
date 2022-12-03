/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa_base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL_registro extends Conexion_bd {

    public boolean registrar(T_registro user) {

        PreparedStatement ps = null;

        Connection con = getConexion();

        String sql = "INSERT INTO registro ( Usuario, Contraseña, Correo) VALUES(?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContraseña());
            ps.setString(3, user.getCorreo());
            
            ps.execute();
            
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL_registro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
