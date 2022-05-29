import java.io.File;

public class Alumno {

    String nombre;
    int matricula;
    float calificaciones[] = new float[7];
    float promedioGeneral;

    public Alumno(String nombre, int matricula){
        setNombre(nombre);
        setMatricula(matricula);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setCalificaciones(float[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    public float[] getCalificaciones() {
        return calificaciones;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }
    public float getPromedioGeneral() {
        calcularPromedio();
        return promedioGeneral;
    }

    //Alumno alumno, 
    public void asignarCalificaciones(float[] Array){
        //asignar 7 calififaciones del array especificado
        for(int i=0; i<7; i++){
            setCalificaciones(Array); 
        }
    }

    public void printCalificaciones(){
        for(float cal: calificaciones){
            System.out.println(cal);
        }
    }

    public void printAlumno(Alumno alumno){
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Matricula: " + alumno.getMatricula()); 
        printCalificaciones();
        //printPromedioCalificaciones();
        System.out.println("");
    }

    public void calcularPromedio(){
        float calificacionTemporal = 0;

        for(float cal: calificaciones){
            calificacionTemporal += cal;
        }
        setPromedioGeneral(calificacionTemporal/(calificaciones.length));
    }

    public void escribirAlumno(){
        
        Escribir.EscribirTxt("Nombre: "+ getNombre());
        Escribir.EscribirTxt("Matricula: "+ Integer.toString(getMatricula()));
        Escribir.EscribirTxt("Promedio General: "+ Float.toString(getPromedioGeneral()));
        Escribir.EscribirTxt("\n");


        //Escribir.EscribirTxt(file, Integer.toString(getMatricula()));

        //use returned value of promedio to be able to print
    }
}