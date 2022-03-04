import java.util.ArrayList;
import java.util.Scanner;

import Classes.Estudiante;

public class Practica3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //array para guardar los objetos de Estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        //Crear 10 objetos estudiante:
        //5 objetos serán creados con datos fijos que el programador defina.
        //5 objetos que reciban como parámetros los valores e implementa el método
        //AsignarNombre. (El usuario introduce los datos)
        estudiantes.add(new Estudiante("Andres", 0, "Programacion", 95));
        estudiantes.add(new Estudiante("Noah", 1, "Historia", 90));
        estudiantes.add(new Estudiante("Isabella", 2, "Matematicas", 88));
        estudiantes.add(new Estudiante("Estefania", 3, "Biologia", 90));
        estudiantes.add(new Estudiante("Miguel", 4, "Calculo", 85));
        for(int i=5; i<10; i++){
            Estudiante est = new Estudiante();
            estudiantes.add(est);
            
        }

        //condicion para establecer si se tiene que salir del loop
        boolean exit = false;

        //string para capturar la entrada para el menu del usuario 
        String userChoice;

        //boolean para saber si el usuario ha introducido datos o no
        boolean capturadoAlumnos = false;

        while(!exit){
            //imprimir el menu principal
            printMenu();
            //escanear en cual menu entrar
            userChoice = scan.nextLine();

            switch(userChoice){

                case "a":
                    //hace que los primeros 5 alumnos sean asignados un nombre que el usuario desee, 
                    //cambia los atributos originales de nombre de la clase "Estudiante" a unos diferentes
                    for(int i=5; i<10; i++){
                        System.out.printf("\n\nIntroducir nombre de alumno #%d: ", i);
                        estudiantes.get(i).SetNombre(scan);
                    }
                    capturadoAlumnos = true;
                    break;
                
                case "b":

                    //checa si el usuario ha capturado los datos de los estudiantes
                    if(capturadoAlumnos){
                        
                        //imprime los 10 estudiantes. 5 tendran un nombre escogido por el usuario, 5 tendran nombres default
                        for(int i=0; i<10; i++){
                            System.out.printf("\n\nEstudiante #%d: ", i+1);
                            System.out.printf("\nNombre: %s", estudiantes.get(i).GetNombre());
                            System.out.printf("\nNumero de Control: %d", estudiantes.get(i).getNumeroDeControl());
                            System.out.printf("\nMateria: %s", estudiantes.get(i).GetMateria());
                            System.out.printf("\nCalificacion: %.2f", estudiantes.get(i).GetCalificacion());
                            System.out.printf("\nEstado: %s", estudiantes.get(i).GetEstado());
                            
                        }
                    }else{
                        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("Por favor primero capturar los valores de alumnos.");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                    }
                    break;

                case "c":
                    exit = true;
                    break;

                default:
                    System.out.println("Por favor escoge una opcion valida.");
            }

        }
        scan.close();
    }

    static void printMenu(){
        System.out.println("\n--------MENU----------");
        System.out.printf("\na) Capturar alumnos");
        System.out.printf("\nb) Mostrar alumnos");
        System.out.printf("\nc) Salir");
        System.out.printf("\nA donde quieres ir?: ");
    }
}