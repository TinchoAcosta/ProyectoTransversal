
package AccesoADatos;

import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con = null;
    private MateriaData matData;
    private AlumnoData alumData;
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion inscr) {
        String sql = "INSERT INTO Inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscr.getNota());
            ps.setInt(2, inscr.getAlumno().getIdAlumno());
            ps.setInt(3, inscr.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscr.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha inscripto exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo inscribir. ERROR: " + ex.getMessage());
            System.out.println(ex.getErrorCode());
            ex.printStackTrace();
        }
    }
}
