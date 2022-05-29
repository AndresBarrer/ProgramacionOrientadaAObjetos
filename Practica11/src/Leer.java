import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Leer {
    
    static String delimiter = ",";

    public static float[] LeerCSV(String csvFile){
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
                Random rand = new Random();


                for(int i=0; i<7; i++){
                    //System.out.println("");
                    //calificacionesTotales[i] =  StringToFloat.convertirStringToFloat(tempArray[i]);
                    calificacionesTotales[i] =  StringToFloat.convertirStringToFloat(tempArray[rand.nextInt(21)]);
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
}