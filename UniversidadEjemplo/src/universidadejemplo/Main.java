package universidadejemplo;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        LocalDate fecha = LocalDate.of(1999, 2, 10);
//        Alumno alumno=new Alumno(13423232,"pablo","gomez",fecha,true);
//        Alumno alumnoModifi=new Alumno(10,12345,"Lucas","Perez",fecha,true);
            AlumnoData ad = new AlumnoData();
//        //ad.guardarAlumno(alumno);
//        //Alumno alumno2 = ad.buscarAlumno(10);
//        //System.out.println(alumno2);
//        //List<Alumno> alumnos = ad.listarAlumnos();
//        //System.out.println(alumnos);
//       // ad.modificarAlumno(alumnoModifi);
//        ad.eliminarAlumno(10);
            
            MateriaData nuevaMateria = new MateriaData();
            //Alumno pepito = ad.buscarAlumno(1);
            //Materia lengua = nuevaMateria.buscarMateria(4);
            
            //nuevaMateria.guardarMateria(lengua);
            //System.out.println(nuevaMateria.buscarMateria(4));
            //Inscripcion inscripcion1 = new Inscripcion(8, pepito, lengua);
            InscripcionData inscrData = new InscripcionData();
            //inscrData.guardarInscripcion(inscripcion1);
            
            
//            List<Inscripcion> listaInscripciones = inscrData.obtenerInscripciones();
//            for(Inscripcion inscr: listaInscripciones){
//                System.out.println(inscr.getAlumno().getDni()+" "+ inscr.getAlumno().getApellido()+ " "+inscr.getAlumno().getNombre()+" "+inscr.getMateria().getNombre()+" "+inscr.getMateria().getAño()+" "+ inscr.getNota());
//            }
//            List<Inscripcion> listaInscripciones = inscrData.obtenerInscripcionesPorAlumno(8);
//            for(Inscripcion inscr: listaInscripciones){
//                System.out.println(inscr.getAlumno().getDni()+" "+ inscr.getAlumno().getApellido()+ " "+inscr.getAlumno().getNombre()+" "+inscr.getMateria().getNombre()+" "+inscr.getMateria().getAño()+" "+ inscr.getNota());
//            }
            
            /*
            List<Materia> listaMaterias = inscrData.obtenerMateriasCursadas(8);
            for(Materia materia: listaMaterias){
                System.out.println(materia.getNombre());
            }
              */
            
            
//            lengua.setAño(3);
//            nuevaMateria.modificarMateria(lengua);
//            nuevaMateria.eliminarMateria(5);
//            
//            List<Materia> materias = nuevaMateria.listarMaterias();
//            System.out.println(materias);
            

           //PRUEBA BORRAR INSCRIPCION 
           //inscrData.borrarInscripcionMateriaAlumno(7, 1);
            
            //PRUEBA ACTUALIZAR NOTA
            //inscrData.actuailizarNota(7, 1, 9);
            
            //PRUEBA MATERIA NO CURSADA
            
//            List<Materia> lista = inscrData.obtenerMateriasNOCursadas(9);
//            for (Materia materia:lista) {
//                System.out.println("nombre materia: "+materia.getNombre());
//            }
            
            //PRUEBA OBTENER ALUMNO POR MATERIA
//            List<Alumno> lista = inscrData.obtenerAlumnosXMateria(2);
//            for (Alumno alumno:lista) {
//                System.out.println("id alumno: "+alumno.getIdAlumno());
//                System.out.println("nombre alumno: "+alumno.getNombre());
//            }
//            List<Materia> lista = inscrData.obtenerMateriasCursadas(8);
//             for (Materia alumno:lista) {
//                System.out.println("id alumno: "+alumno.getIdMateria());
//                System.out.println("nombre alumno: "+alumno.getNombre());
//            }
            
    }
    
}
