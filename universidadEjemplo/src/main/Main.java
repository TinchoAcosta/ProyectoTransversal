package main;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        try {
            Connection cn = Conexion.getConexion();
            
            String sql3 = "INSERT INTO alumno(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) "
                    + "VALUES (4518592,'Perez','Juan','2001-05-05',true),"
                    + "(5685213,'Acosta','Martin','1999-03-02',1),"
                    + "(1234567,'Moyano','Debora','1998-10-08',1)";
            String sql4 = "INSERT INTO materia(`nombre`, `año`, `estado`) "
                    + "VALUES ('Ingles',2,true),"
                    + "('Matematicas',3,1),"
                    + "('Historia',2,1),"
                    + "('Geografia',3,1)";
            String sql5 = "INSERT INTO inscripcion(`nota`, `idAlumno`, `idMateria`) "
                        + "VALUES (5,7,1),"
                               + "(7,7,2),"
                               + "(9,8,4),"
                               + "(10,8,3),"
                               + "(8,9,2),"
                               + "(6,9,3)";
            String sql6 = "SELECT alumno.idAlumno, alumno.nombre, alumno.apellido, alumno.dni, alumno.fechaNacimiento, alumno.estado, materia.nombre "
                        + "FROM inscripcion, alumno, materia "
                        + "WHERE alumno.idAlumno = inscripcion.idAlumno "
                        + "AND materia.idMateria = inscripcion.idMateria "
                        + "AND nota > 8;";
            String sql7 = "DELETE FROM `inscripcion` WHERE idInscripto = 6;";
            PreparedStatement ps;
            int fila;
            
//            //Alumnos cargados//
//            ps = cn.prepareStatement(sql3);
//            fila = ps.executeUpdate();
//            if(fila == 3){
//                JOptionPane.showMessageDialog(null, "Todos los alumnos agregados.");
//            }else{
//                JOptionPane.showMessageDialog(null, "Uno o ningun alumno pudo ser cargado.");                
//            }
//            //Materias cargadas//
//            ps = cn.prepareStatement(sql4);
//            fila = ps.executeUpdate();
//            if(fila == 4){
//                JOptionPane.showMessageDialog(null, "Todas las materias agregadas.");
//            }else{
//                JOptionPane.showMessageDialog(null, "No se pudieron cargar las materias.");                
//            }
//            
//            ps = cn.prepareStatement(sql5);
//            fila = ps.executeUpdate();
//            if(fila == 6) {
//                JOptionPane.showMessageDialog(null, "Todas las inscripciones agregadas.");
//            }else{
//                JOptionPane.showMessageDialog(null, "No se pudieron cargar las inscripciones.");
//            }

            ps = cn.prepareStatement(sql6);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("idAlumno"));
                System.out.println("Nombre: "+rs.getString("nombre"));
                System.out.println("Apellido: "+rs.getString("apellido"));
                System.out.println("DNI: "+rs.getInt("dni"));
                System.out.println("Nacimiento: "+rs.getDate("fechaNacimiento"));
                System.out.println("Estado: "+rs.getBoolean("estado"));
                System.out.println("Materia: "+rs.getString("materia.nombre"));
                System.out.println("---------------------------*---------------------------");
            }
            
//             ps = cn.prepareStatement(sql7);
//            fila = ps.executeUpdate();
//            if(fila == 1){
//                JOptionPane.showMessageDialog(null, "Inscripcion eliminada.");
//            }else{
//                JOptionPane.showMessageDialog(null, "No se pudo eliminar.");                
//            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR SQL: "+ex.getErrorCode());
            System.out.println("ERROR "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
