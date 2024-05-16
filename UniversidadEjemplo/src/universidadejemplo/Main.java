package universidadejemplo;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1999, 2, 10);
        Alumno alumno=new Alumno(13423232,"pablo","gomez",fecha,true);
        Alumno alumnoModifi=new Alumno(10,12345,"Lucas","Perez",fecha,true);
        AlumnoData ad = new AlumnoData();
        //ad.guardarAlumno(alumno);
        
        //Alumno alumno2 = ad.buscarAlumno(10);
        //System.out.println(alumno2);
        
        //List<Alumno> alumnos = ad.listarAlumnos();
        //System.out.println(alumnos);
        
        
       // ad.modificarAlumno(alumnoModifi);
        
        
        ad.eliminarAlumno(10);
        
    }
    
}
