public class Main {
    public static void main(String[] args){

        //crear 3 instancias del objeto Alumno
        Alumno alumno1 = new Alumno("Andres Barrera", 1280040);
        Alumno alumno2 = new Alumno("Isabella Real", 1250043);
        Alumno alumno3 = new Alumno("Miguel Barrera", 1250494);

        String path = "C:/Users/Admin/Documents/GitHub/ProgramacionOrientadaAObjetos/Practica11/src/practica11.csv";
        alumno1.asignarCalificaciones(Leer.LeerCSV(path));
        alumno2.asignarCalificaciones(Leer.LeerCSV(path));
        alumno3.asignarCalificaciones(Leer.LeerCSV(path)); 

        //alumno1.printPromedioCalificaciones();
        alumno1.escribirAlumno();
        alumno2.escribirAlumno();
        alumno3.escribirAlumno();
    }
}
