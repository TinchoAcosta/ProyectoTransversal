package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static String url="jdbc:mariadb://localhost/universidadgrupo1";
    private static String usser="root";
    private static String password="";

   
    private static Conexion conexion=null;
    
    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }


    
    public static Connection getConexion() {
        Connection con=null;
      if(conexion == null){         
           conexion= new Conexion();
        }
        try {
            //con = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);            
            con = DriverManager.getConnection(url, usser, password);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion: ERROR "+ex.getErrorCode());
            System.out.println("ERROR "+ex.getMessage());
            ex.printStackTrace();
        }        
        return con;
    }
}

