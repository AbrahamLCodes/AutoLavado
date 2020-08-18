
package Conexiones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection con = null;
    Statement st = null;
    
    public Conexion() {
        try {
            String rutafile = "C:\\ProyectoAutolavado\\base_de_datos_autolavado.accdb";
            String Url = "jdbc:ucanaccess://" + rutafile;
            con = DriverManager.getConnection(Url);
            st = con.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXIÓN ERRÓNEA:   " + e);
        }
    }
    
    public Connection getConnection() {
        return con;
    }
    
    public void Desconexion() {
        try {
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}