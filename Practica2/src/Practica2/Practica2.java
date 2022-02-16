package Practica2;
import java.util.Scanner;

import Practica2.Classes.Audifonos;
import Practica2.Classes.Automovil;
import Practica2.Classes.Bicicleta;
import Practica2.Classes.Celular;
import Practica2.Classes.Computadora;

public class Practica2 {
    public static void main(String[] args){
        
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        int userChoiceMenu;
        char userChoiceSubMenu;

        Computadora comp1 = new Computadora();
        Audifonos aud1 = new Audifonos();
        Bicicleta bic1 = new Bicicleta();
        Celular cel1 = new Celular();
        Automovil auto1 = new Automovil();

        while (!exit) {
            
            printMenu();

            userChoiceMenu = scan.nextInt();
            
            switch (userChoiceMenu) {
                case 1:
                    //Set values and then get values for each object
                    System.out.println("Clase \"Computadora\"\n");
                    
                    printSubMenu();
                    //IMPLEMENT SUB MENU
                    /*
                    switch(userChoiceSubMenu){

                    }
                    */


                    System.out.println("Introducir cpu:");
                    Scanner inCpu = new Scanner(System.in);
                    comp1.setCpu(inCpu.next());

                    System.out.println("Introducir gpu:");
                    Scanner inGpu = new Scanner(System.in);
                    comp1.setGpu(inGpu.next());

                    System.out.println("Introducir ram:");
                    Scanner inRam = new Scanner(System.in);
                    comp1.setRam(inRam.nextInt());

                    System.out.println("Introducir Fuente de Poder:");
                    Scanner inFuenteDePoder = new Scanner(System.in);
                    comp1.setFuenteDePoder(inFuenteDePoder.nextInt());
                    break;

                case 2:
                    System.out.println("Clase \"Audifonos\"\n");

                    System.out.println("Introducir color:");
                    Scanner inColorAud = new Scanner(System.in);
                    aud1.setColor(inColorAud.next());

                    System.out.println("Introducir modelo:");
                    Scanner inModeloAud = new Scanner(System.in);
                    aud1.setModelo(inModeloAud.next());

                    System.out.println("Introducir tamaño:");
                    Scanner inTamAud = new Scanner(System.in);
                    aud1.setTam(inTamAud.next());

                    System.out.println("Introducir portabilidad:");
                    Scanner inPortabilidadAud = new Scanner(System.in);
                    aud1.setPortabilidad(inPortabilidadAud.next());

                    System.out.println("Introducir Tipo de Entrada:");
                    Scanner inTipoDeEntradaAud = new Scanner(System.in);
                    aud1.setTipoDeEntrada(inTipoDeEntradaAud.next());
                    break;

                case 3:
                    System.out.println("Clase \"Bicicleta\"\n");

                    System.out.println("Introducir Modelo:");
                    Scanner inModeloBic = new Scanner(System.in);
                    bic1.setModelo(inModeloBic.next());

                    System.out.println("Introducir Color:");
                    Scanner inColorBic = new Scanner(System.in);
                    bic1.setColor(inColorBic.next());

                    System.out.println("Introducir Tam de Llantas:");
                    Scanner inTamBic = new Scanner(System.in);
                    bic1.setTamDeLlantas(inTamBic.next());

                    System.out.println("Introducir Tipo:");
                    Scanner inTipo = new Scanner(System.in);
                    bic1.setTipo(inTipo.next());

                    System.out.println("Introducir Material:");
                    Scanner inMaterial = new Scanner(System.in);
                    bic1.setMaterial(inMaterial.next());
                    break;

                case 4:
                    System.out.println("Clase \"Celular\"\n");

                    System.out.println("Introducir Modelo:");
                    Scanner inModeloCel = new Scanner(System.in);
                    cel1.setModelo(inModeloCel.next());

                    System.out.println("Introducir Color:");
                    Scanner inColorCel = new Scanner(System.in);
                    cel1.setColor(inColorCel.next());

                    System.out.println("Introducir Tam:");
                    Scanner inTamCel = new Scanner(System.in);
                    cel1.setTam(inTamCel.next());

                    System.out.println("Introducir Almacenamiento :");
                    Scanner inAlmacenamientoCel = new Scanner(System.in);
                    cel1.setAlmacenamiento(inAlmacenamientoCel.nextInt());

                    System.out.println("Introducir Resolucion de Camara:");
                    Scanner inResolucionCel = new Scanner(System.in);
                    cel1.setResolucionCamara(inResolucionCel.next());
                    break;

                case 5: 
                    System.out.println("Clase \"Automovil\"\n");

                    System.out.println("Introducir Modelo:");
                    Scanner inModeloAuto = new Scanner(System.in);
                    auto1.setModelo(inModeloAuto.next());

                    System.out.println("Introducir Color:");
                    Scanner inColorAuto = new Scanner(System.in);
                    auto1.setColor(inColorAuto.next());

                    System.out.println("Introducir Tam:");
                    Scanner inTamAuto = new Scanner(System.in);
                    auto1.setTam(inTamAuto.next());

                    System.out.println("Introducir year de creacion:");
                    Scanner inYearDeCreacion = new Scanner(System.in);
                    auto1.setYearDeCreacion(inYearDeCreacion.nextInt());

                    System.out.println("Introducir Cantidad de Puertas:");
                    Scanner inNumeroDePuertas = new Scanner(System.in);
                    auto1.setNumeroDePuertas(inNumeroDePuertas.nextInt());
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Entrada invalida.");
            }   
        }
        scan.close();
    }

    static void printMenu() {
        System.out.println("\nCual clase quieres capturar? Introducir Numero.");
        System.out.println("MENU");
        System.out.println("1) Computadora");
        System.out.println("2) Audifonos");
        System.out.println("3) Bicicleta");
        System.out.println("4) Celular");
        System.out.println("5) Automovil");
        System.out.println("6) Exit");

    }

    static void printSubMenu(){
        System.out.println("\na) Capturar atributos");
        System.out.println("b) Imprimir Objetos");
    }

    
    
}
