package Practica2;
import java.util.Scanner;
import java.util.ArrayList;

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
        int userChoiceSubMenu;

        ArrayList<Computadora> computadoras = new ArrayList<Computadora>(); 
        ArrayList<Audifonos> audifonos = new ArrayList<Audifonos>(); 
        ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>(); 
        ArrayList<Celular> celulares = new ArrayList<Celular>(); 
        ArrayList<Automovil> automoviles = new ArrayList<Automovil>(); 

        for (int i = 0; i < 3; i++) 
		{ 
			Computadora comp = new Computadora();
            Audifonos aud = new Audifonos();
            Bicicleta bic = new Bicicleta();
            Celular cel = new Celular();
            Automovil auto = new Automovil();  
			
            computadoras.add(comp);
            audifonos.add(aud);
            bicicletas.add(bic);
            celulares.add(cel);
            automoviles.add(auto);
		} 

        while (!exit) {
            
            printMenu();
            userChoiceMenu = scan.nextInt();
            
            switch (userChoiceMenu) {
                case 1:
                    //Set values and then get values for each object
                    System.out.println("\n\nClase \"Computadora\"");
                    
                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    Scanner inCpu = new Scanner(System.in);
                    Scanner inGpu = new Scanner(System.in);
                    Scanner inRam = new Scanner(System.in);
                    Scanner inFuenteDePoder = new Scanner(System.in);
                    Scanner inHDD = new Scanner(System.in);

                    switch(userChoiceSubMenu){

                        case 1:
                            //Capturar Atributos
                            
                            for (int i=0; i<3; i++){
                                System.out.printf("\nINTRODUCIR DATOS PARA COMPUTADORA #%d\n",i+1);

                                System.out.printf("Introducir cpu: ");
                                computadoras.get(i).setCpu(inCpu.next());
            
                                System.out.printf("Introducir gpu: ");
                                computadoras.get(i).setGpu(inGpu.next());
            
                                System.out.printf("Introducir ram (GB): ");
                                computadoras.get(i).setRam(inRam.nextInt());
            
                                System.out.printf("Introducir Fuente de Poder (Watts): ");
                                computadoras.get(i).setFuenteDePoder(inFuenteDePoder.nextInt());

                                System.out.printf("Introducir HDD (Capacidad): ");
                                computadoras.get(i).setFuenteDePoder(inHDD.nextInt());
                                
                            }

                            break;
        
                        case 2:
                            //Imprimir Objetos
                            for(int i=0; i<3; i++){
                                System.out.printf("\n\nCOMPUTADORA #%d",i+1);
                                System.out.printf("\nCpu: %s", computadoras.get(i).getCpu());
                                System.out.printf("\nGpu: %s", computadoras.get(i).getGpu());
                                System.out.printf("\nRam: %d", computadoras.get(i).getRam());
                                System.out.printf("\nFuente de Poder: %d", computadoras.get(i).getFuenteDePoder());
                                System.out.printf("\nHDD: %d", computadoras.get(i).getHdd());
                            }
                            break;
        
                        default:
                            System.out.println("Entrada invalida.");
                            break;
                    }

                    inCpu.close();
                    inGpu.close();
                    inRam.close();
                    inFuenteDePoder.close();
                    inHDD.close();

                    break;

                case 2:
                    System.out.println("\n\nClase \"Audifonos\"");
                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    Scanner inColorAud = new Scanner(System.in);
                    Scanner inModeloAud = new Scanner(System.in);
                    Scanner inTamAud = new Scanner(System.in);
                    Scanner inPortabilidadAud = new Scanner(System.in);
                    Scanner inTipoDeEntradaAud = new Scanner(System.in);

                    switch(userChoiceSubMenu){
                    
                        case 1:

                            //Capturar Atributos
                            for (int i=0; i<3; i++){
                                System.out.printf("Introducir color:");
                                audifonos.get(i).setColor(inColorAud.next());
            
                                System.out.printf("Introducir modelo:");
                                audifonos.get(i).setModelo(inModeloAud.next());
            
                                System.out.printf("Introducir tamaño:");
                                audifonos.get(i).setTam(inTamAud.next());
            
                                System.out.printf("Introducir portabilidad:");
                                audifonos.get(i).setPortabilidad(inPortabilidadAud.next());
            
                                System.out.printf("Introducir Tipo de Entrada:");
                                audifonos.get(i).setTipoDeEntrada(inTipoDeEntradaAud.next());
                            }

                            break;

                        case 2:
                            //Imprimir Objetos
                            for(int i=0; i<3; i++){
                                System.out.printf("\n\nAUDIFONO #%d",i+1);
                                System.out.printf("\nColor: %s", audifonos.get(i).getColor());
                                System.out.printf("\nModelo: %s", audifonos.get(i).getModelo());
                                System.out.printf("\nTam: %d", audifonos.get(i).getTam());
                                System.out.printf("\nPortabilidad: %d", audifonos.get(i).getPortabilidad());
                                System.out.printf("\nTipo de Entrada: %s", audifonos.get(i).getTipoDeEntrada());
                            }
                            break;

                        default:
                            System.out.println("\nEntrada invalida.");
                            break;
                    }
                    inColorAud.close();
                    inModeloAud.close();
                    inTamAud.close();
                    inPortabilidadAud.close();
                    inTipoDeEntradaAud.close();

                    break;

                case 3:
                    System.out.println("\n\nClase \"Bicicleta\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    Scanner inModeloBic = new Scanner(System.in);
                    Scanner inColorBic = new Scanner(System.in);
                    Scanner inTamBic = new Scanner(System.in);
                    Scanner inTipo = new Scanner(System.in);
                    Scanner inMaterial = new Scanner(System.in);

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){

                                System.out.println("Introducir Modelo:");
                                bicicletas.get(i).setModelo(inModeloBic.next());
            
                                System.out.println("Introducir Color:");
                                bicicletas.get(i).setColor(inColorBic.next());
            
                                System.out.println("Introducir Tam de Llantas:");
                                bicicletas.get(i).setTamDeLlantas(inTamBic.next());
            
                                System.out.println("Introducir Tipo:");
                                bicicletas.get(i).setTipo(inTipo.next());
            
                                System.out.println("Introducir Material:");
                                bicicletas.get(i).setMaterial(inMaterial.next());
                            }
                            break;
                        
                        case 2:
                        
                            //Imprimir Objetos
                            for(int i=0; i<3; i++){
                                System.out.printf("\n\nBICICLETA #%d",i+1);
                                System.out.printf("\nModelo: %s", bicicletas.get(i).getModelo());
                                System.out.printf("\nColor: %s", bicicletas.get(i).getColor());
                                System.out.printf("\nTam de Llantas: %d", bicicletas.get(i).getTamDeLlantas());
                                System.out.printf("\nTipo: %d", bicicletas.get(i).getTipo());
                                System.out.printf("\nMaterial: %d", bicicletas.get(i).getMaterial());
                            }
                            break;
                        
                        default:
                            System.out.println("\nEntrada Invalida.");
                            break;

                    }
                    inModeloBic.close();
                    inColorBic.close();
                    inTamBic.close();
                    inTipo.close();
                    inMaterial.close();

                    break;

                case 4:
                    System.out.println("\n\nClase \"Celular\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    Scanner inModeloCel = new Scanner(System.in);
                    Scanner inColorCel = new Scanner(System.in);
                    Scanner inTamCel = new Scanner(System.in);
                    Scanner inAlmacenamientoCel = new Scanner(System.in);
                    Scanner inResolucionCel = new Scanner(System.in);

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){
                                System.out.println("Introducir Modelo:");
                                celulares.get(0).setModelo(inModeloCel.next());
            
                                System.out.println("Introducir Color:");
                                celulares.get(0).setColor(inColorCel.next());
            
                                System.out.println("Introducir Tam:");
                                celulares.get(0).setTam(inTamCel.next());
            
                                System.out.println("Introducir Almacenamiento :");
                                celulares.get(0).setAlmacenamiento(inAlmacenamientoCel.nextInt());
            
                                System.out.println("Introducir Resolucion de Camara:");
                                celulares.get(0).setResolucionCamara(inResolucionCel.next());
                            }
                            break;
                        
                        case 2:
                            
                            //Imprimir Objetos
                            for(int i=0; i<3; i++){
                                System.out.printf("\n\nCAMARA #%d",i+1);
                                System.out.printf("\nModelo: %s", celulares.get(i).getModelo());
                                System.out.printf("\nColor: %s", celulares.get(i).getColor());
                                System.out.printf("\nTam: %d", celulares.get(i).getTam());
                                System.out.printf("\nAlmacenamiento: %d", celulares.get(i).getAlmacenamiento());
                                System.out.printf("\nResolucion de Camara (1080p, 4k): %d", celulares.get(i).getResolucionCamara());
                            }
                            break;

                        default:
                            System.out.println("Entrada Invalida.");

                    }

                    inModeloCel.close();
                    inColorCel.close();
                    inTamCel.close();
                    inAlmacenamientoCel.close();
                    inResolucionCel.close();
                    break;

                case 5: 
                    System.out.println("\n\nClase \"Automovil\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    Scanner inModeloAuto = new Scanner(System.in);
                    Scanner inColorAuto = new Scanner(System.in);
                    Scanner inTamAuto = new Scanner(System.in);
                    Scanner inYearDeCreacion = new Scanner(System.in);
                    Scanner inNumeroDePuertas = new Scanner(System.in);

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){
                                System.out.printf("Introducir Modelo:");
                                automoviles.get(i).setModelo(inModeloAuto.next());
            
                                System.out.printf("Introducir Color:");
                                automoviles.get(i).setColor(inColorAuto.next());
            
                                System.out.printf("Introducir Tam de Auto:");
                                automoviles.get(i).setTam(inTamAuto.next());
            
                                System.out.printf("Introducir year de creacion:");
                                automoviles.get(i).setYearDeCreacion(inYearDeCreacion.nextInt());
            
                                System.out.printf("Introducir Cantidad de Puertas:");
                                automoviles.get(i).setNumeroDePuertas(inNumeroDePuertas.nextInt());
                            }
                            break;

                        case 2:

                            //Imprimir Objetos
                            for(int i=0; i<3; i++){
                                System.out.printf("\n\nAUTO #%d",i+1);
                                System.out.printf("\nModelo: %s", automoviles.get(i).getModelo());
                                System.out.printf("\nColor: %s", automoviles.get(i).getColor());
                                System.out.printf("\nTam: %d", automoviles.get(i).getTam());
                                System.out.printf("\nYear de Creacion: %d", automoviles.get(i).getYearDeCreacion());
                                System.out.printf("\nCantidad de Puertas: %d", automoviles.get(i).getNumeroDePuertas());
                            }
                            break;

                        default:
                            System.out.println("Entrada Invalida.");
                            break;

                    }

                    inModeloAuto.close();
                    inColorAuto.close();
                    inTamAuto.close();
                    inYearDeCreacion.close();
                    inNumeroDePuertas.close();
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
        System.out.printf("\nEscoge una clase.");
        System.out.printf("\nMENU");
        System.out.printf("\n1) Computadora");
        System.out.printf("\n2) Audifonos");
        System.out.printf("\n3) Bicicleta");
        System.out.printf("\n4) Celular");
        System.out.printf("\n5) Automovil");
        System.out.printf("\n6) Exit");
        System.out.printf("\nIntroducir Numero: ");

    }

    static void printSubMenu(){
        System.out.printf("\nEscoge una opcion.");
        System.out.printf("\n1) Capturar atributos");
        System.out.printf("\n2) Imprimir Objetos");
        System.out.printf("\nIntroducir numero: ");
    }   
}
