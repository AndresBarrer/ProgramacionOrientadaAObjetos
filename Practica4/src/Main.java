import java.util.ArrayList;
import Classes.Mexicano;

public class Main {
    public static void main(String[] args) {
        
        //crear objeto para poder manipular informacion
        ArrayList<Mexicano> mexicanos = new ArrayList<Mexicano>();
        mexicanos.add(new Mexicano("Andres", "Barrera", "Rodriguez", "2001", 
                    "12", "20", "2001", "12", "20", "H", "Baja California", "Mexicana", true));
        
        mexicanos.add(new Mexicano("Estefania", "Barrera", "Rodriguez", "2001", 
                    "12", "20", "2001", "12", "20", "M", "Baja California", "Extranjera", true));
        
        mexicanos.add(new Mexicano("Isabella", "Hope", "Real", "2002", 
                    "01", "16", "2002", "01", "16", "M", "Baja California Sur", "Extranjera", false));

        System.out.println("\nPersona 1: ");
        mexicanos.get(0).makeCURP();

        System.out.println("\nPersona 2: ");
        mexicanos.get(1).makeRFC();

        System.out.println("\nPersona 3: ");
        mexicanos.get(2).makeCURP();
        mexicanos.get(2).makeRFC();
    }
}

