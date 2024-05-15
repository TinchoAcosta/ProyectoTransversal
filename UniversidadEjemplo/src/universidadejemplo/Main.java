package universidadejemplo;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1999, 2, 10);
        Alumno alumno=new Alumno(134,"pablo","gomez",fecha,true);
        AlumnoData ad = new AlumnoData();
        ad.guardarAlumno(alumno);
    }
    
}
