import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //crear 3 instancias del objeto Alumno
        Alumno alumno1 = new Alumno("Andres Barrera", 1280040);
        Alumno alumno2 = new Alumno("Isabella Real", 1250043);
        Alumno alumno3 = new Alumno("Miguel Barrera", 1250494);

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);


        String path = "C:/Users/Admin/Documents/GitHub/ProgramacionOrientadaAObjetos/Practica11/src/practica11.csv";
        
        for(Alumno alumno: alumnos){
            alumno.asignarCalificaciones(Leer.LeerCSV(path));
            alumno.escribirAlumno();
        }
        System.out.println("Se ha generado un archivo con la informacion.");
    }
}
