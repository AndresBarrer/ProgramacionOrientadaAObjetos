import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir{
    public static void EscribirTxt(String string){

        File file = new File("Calificaciones.txt");

        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(string);
            writer.write(System.getProperty("line.separator"));
            writer.close();

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }    
    }
}
