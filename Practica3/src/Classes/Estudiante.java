package Classes;
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int numeroDeControl;
    private String materia;
    private float calificacion;
    private String estado;    

    //default si no se introducen datos
    public Estudiante(){
        this.nombre = "";
        this.numeroDeControl = 0;
        this.materia = "";
        this.calificacion = 0;
        this.estado = "";
    }

    //si se introducen datos, de esta manera se guardan
    public Estudiante(String nombre, int numeroDeControl, String materia, float calificacion){
        this.nombre = nombre;
        this.numeroDeControl = numeroDeControl;
        this.materia = materia;
        this.calificacion = calificacion;
        this.estado = this.Estado(calificacion);
    }


    public void SetNombre(Scanner scan){
        System.out.printf("\nNombre= ");
        this.nombre = scan.next();

        System.out.printf("Numero de Control= ");
        this.numeroDeControl = scan.nextInt();

        System.out.printf("Materia= ");
        this.materia = scan.next();

        System.out.printf("Calificación= ");
        this.calificacion = scan.nextFloat();

        this.SetEstado(this.calificacion);
    }

    public String GetNombre(){
        return nombre;
    }
    
    public int getNumeroDeControl() {
        return numeroDeControl;
    }

    public void SetNumeroDeControl(int numeroDeControl) {
        this.numeroDeControl = numeroDeControl;
    }

    public void SetMateria(String materia){
        this.materia = materia;
    }

    public String GetMateria(){
        return materia;
    }

    public void SetCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    public float GetCalificacion(){
        return calificacion;
    }
    
    public String Estado(float calificacion){
        return (calificacion >= 60 ? "Aprobado" : "Reprobado");
    }

    public void SetEstado(float calificacion){
        //Si la calificación dada es inferior a 60, 
        //el estado del alumno es reprobado,
        //caso contrario será aprobado
        if (calificacion < 60){
            this.estado = "Reprobado";
        }else{
            this.estado = "Aprobado";
        }
    }
    
    public String GetEstado(){
        return estado;
    }
}

