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

    public InscripcionData() {
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
            String sql = "SELECT * FROM inscripcion,materia WHERE idAlumno = ? AND materia.idMateria = inscripcion.idMateria AND materia.estado=1;";
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

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año "
                    + "FROM inscripcion, materia "
                    + "WHERE inscripcion.idMateria = materia.idMateria "
                    + "AND inscripcion.idAlumno = ? "
                    + "AND materia.estado = 1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al obtener inscripciones." + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<Materia>();
        String sql = "SELECT  *  FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT  idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al obtener inscripciones." + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada con exito ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la inscripcion deseada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar a la tabla Inscripcion. ERROR: " + ex.getMessage());
        }
    }

    public void actuailizarNota(int idAlumno, int idMateria, int notaNueva) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, notaNueva);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la nota deseada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " No se pudo ingresar a la tabla Inscripcion. ERROR: " + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnosMaterias = new ArrayList<Alumno>();

        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a "
                + "WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMaterias.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Error al ingresar a la tabla." + ex.getMessage());
        }
        return alumnosMaterias;
    }
}
