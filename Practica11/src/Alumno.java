import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


    //crear un delimiter para poder encontrar el siguente valor
    public static final String delimiter = ",";


    public static float[] Leer(String csvFile){
        //ArrayList<Float> calificacionesTotales = new ArrayList<Float>();
        float calificacionesTotales[] =  new float[7];
        try{
            //float calificacionesTotales[];
            
            File file = new File(csvFile); //crea un objeto de tipo File
            FileReader fr = new FileReader(file); //crear un FileReader que lea desde el objeto
            BufferedReader br = new BufferedReader(fr); //Utilizado para leer texto de un stream de texto
            
            String line = ""; //crear una linea vacia
            String[] tempArray; //array temp para guardar valores individuales del csv, despues de cortarlo por el delimiter

            /*
            while la linea actual no sea null, 
            asignar el primer valor a tempArray
            desde 0 hasta 3, porque estamos usando 3 alumnos:
                desde el inicio del tempArray hasta el fin:

            */
            
            while((line = br.readLine()) != null) {
                tempArray = line.split(delimiter);

                for(int i=0; i<7; i++){
                    calificacionesTotales[i] =  convertirStringToFloat(tempArray[1]);
                }
                
                //calificacionesTotales.add(convertirStringToFloat(tempArray[1])); //TODO: GENERATE RANDOM CALIFIFACION FROM LIST
            }
            br.close();
            return calificacionesTotales;
            

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        return calificacionesTotales;
    }

    public static void asignarCalificaciones(Alumno alumno, float[] tempArray){
        //asignar 7 calififaciones del array especificado
        for(int i=0; i<7; i++){
            alumno.setCalificaciones(tempArray); 
        }
        printCalificaciones(alumno);
        
    }

    //metodo para convertir de String a Float
    public static float convertirStringToFloat(String string){
        //try catch por si el numero no es posible convertir a float
        try{
            //convertir string a float y regresarlo
            float number = Float.parseFloat(string);
            return number;
        }
        //si no es posible convertir, regresar el stacktrace del error
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    
    public static void printCalificaciones(Alumno alumno){
        for(float calififaciones: alumno.calificaciones){
            System.out.println(calififaciones);
        }
    }


    public static void main(String[] args){

        //crear 3 instancias del objeto Alumno
        Alumno alumno1 = new Alumno("Andres Barrera", 1280040);
        Alumno alumno2 = new Alumno("Isabella Real", 1250043);
        Alumno alumno3 = new Alumno("Brady Flavin", 1250494);

        String path = "C:/Users/Admin/Documents/GitHub/ProgramacionOrientadaAObjetos/Practica11/src/practica11new.csv";
        Alumno.asignarCalificaciones(alumno1, Alumno.Leer(path)); 
        
        /*LEFT OFF AT:
        SUCCESFULLY: added calififaciones to a student
        FAILED: the grades arent different, ask if they can be random or not from the csv file
        FAILED: must create a method to print a students name, ID, grades and overall grade (make it 1 function call in main)
        */
    }
}