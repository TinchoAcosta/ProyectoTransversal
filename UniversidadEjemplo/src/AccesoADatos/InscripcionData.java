
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con = null;
    private MateriaData matData;
    private AlumnoData alumData;
    
    public InscripcionData(){
        con = Conexion.getConexion();
        matData = new MateriaData();
        alumData = new AlumnoData();
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
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno;
                Materia materia;
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripto(rs.getInt("idInscripto"));
                inscr.setNota(rs.getInt("nota"));
                alumno = alumData.buscarAlumno(rs.getInt("idAlumno"));
                materia = matData.buscarMateria(rs.getInt("idMateria"));
                inscr.setAlumno(alumno);
                inscr.setMateria(materia);
                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de Inscripciones " + ex.getMessage());
            System.out.println(ex.getErrorCode());
            ex.printStackTrace();
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno;
                Materia materia;
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripto(rs.getInt("idInscripto"));
                inscr.setNota(rs.getInt("nota"));
                alumno = alumData.buscarAlumno(id);
                materia = matData.buscarMateria(rs.getInt("idMateria"));
                inscr.setAlumno(alumno);
                inscr.setMateria(materia);
                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de Inscripciones " + ex.getMessage());
            System.out.println(ex.getErrorCode());
            ex.printStackTrace();
        }
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        try{
            String sql = "SELECT inscripcion.idMateria, nombre, año "
                    + "FROM inscripcion, materia "
                    + "WHERE inscripcion.idMateria = materia.idMateria "
                    + "AND inscripcion.idAlumno = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);
                
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "Error al obtener inscripciones."+ex.getMessage());
        }
        return materias;
    }
}
