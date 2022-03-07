import java.util.Scanner;
import Classes.Mexicano;
 

public class Main {
    public static void main(String[] args) {
        
        //crear objecto mex para poder manipular informacion
        Mexicano mex = new Mexicano();

        //scanner para tomar input del usuario
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introducir nombre:");
        mex.setNombre(scan.nextLine());

        System.out.println("Introducir primer apellido:");
        mex.setPrimerApellido(scan.nextLine());
        
        System.out.println("Introducir segundo apellido:");
        mex.setSegundoApellido(scan.nextLine());
        
        System.out.println("\n\nIntroducir fecha de nacimiento.");
        System.out.println("Introducir dia:");
        mex.setFechaDia(scan.nextLine());
        System.out.println("Introducir mes:");
        mex.setFechaMes(scan.nextLine());
        System.out.println("Introducir year(ej: 2001):");
        mex.setFechaYear(scan.nextLine());


        mex.makeCURP(mex.getNombre(), mex.getPrimerApellido(), mex.getSegundoApellido());
        scan.close();
    }
}
