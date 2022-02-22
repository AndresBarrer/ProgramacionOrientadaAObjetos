package Practica2;
import java.util.Scanner;
import java.util.ArrayList;

import Practica2.Classes.Audifonos;
import Practica2.Classes.Automovil;
import Practica2.Classes.Bicicleta;
import Practica2.Classes.Celular;
import Practica2.Classes.Computadora;

/*
P02- Clases, objetos metodos, atributos
Autor: Andres Barrera Rodriguez
Grupo: 541
Materia: Programacion Orientada a Objetos Laboratorio
*/

public class Practica2 {
    public static void main(String[] args){
        
        //boolean para saber si nos tenemos que salir del menu
        boolean exit = false;

        //scanner para capturar input
        Scanner scan = new Scanner(System.in);

        //ints para saber cual opcion el usuario escogio
        int userChoiceMenu;
        int userChoiceSubMenu;

        //condiciones para saber si el usuario ha capturado los atributos de objetos
        boolean capturaDeObjetosComp = false;
        boolean capturaDeObjetosAud = false;
        boolean capturaDeObjetosBic = false;
        boolean capturaDeObjetosCel = false;
        boolean capturaDeObjetosAuto = false;

        //crear arrays para guardar objetos
        ArrayList<Computadora> computadoras = new ArrayList<Computadora>(); 
        ArrayList<Audifonos> audifonos = new ArrayList<Audifonos>(); 
        ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>(); 
        ArrayList<Celular> celulares = new ArrayList<Celular>(); 
        ArrayList<Automovil> automoviles = new ArrayList<Automovil>(); 

        //crear 3 objetos de cada clase
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
    
        //condicion para saber si se tiene que salir del menu principal
        while (!exit) {
            
            //llamamos funcion para imprimir el menu en pantalla, y le preguntamos al usuario introducir un valor
            printMenu();
            userChoiceMenu = scan.nextInt();
            
            switch (userChoiceMenu) {
                case 1:
                    System.out.println("\n\nClase \"Computadora\"");
                    
                    //llamamos funcion para imprimir el submenu en pantalla, y le preguntamos al usuario introducir un valor
                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    
                    switch(userChoiceSubMenu){

                        case 1:

                            //Capturar Atributos
                            for (int i=0; i<3; i++){
                                System.out.printf("\nINTRODUCIR DATOS PARA COMPUTADORA #%d\n",i+1);

                                System.out.printf("Introducir cpu: ");
                                computadoras.get(i).setCpu(scan.next());
            
                                System.out.printf("Introducir gpu: ");
                                computadoras.get(i).setGpu(scan.next());
            
                                System.out.printf("Introducir ram (GB): ");
                                computadoras.get(i).setRam(scan.nextInt());
            
                                System.out.printf("Introducir Fuente de Poder (Watts): ");
                                computadoras.get(i).setFuenteDePoder(scan.nextInt());

                                System.out.printf("Introducir HDD (Capacidad en GB): ");
                                computadoras.get(i).setHdd(scan.nextInt());
                                
                            }
                            capturaDeObjetosComp = true;
                            break;
        
                        case 2:
                            //validacion de captura de objetos
                            if(capturaDeObjetosComp == true){
                            
                                //Imprimir Objetos
                                for(int i=0; i<3; i++){
                                    System.out.printf("\n\nCOMPUTADORA #%d",i+1);
                                    System.out.printf("\nCpu: %s", computadoras.get(i).getCpu());
                                    System.out.printf("\nGpu: %s", computadoras.get(i).getGpu());
                                    System.out.printf("\nRam: %d", computadoras.get(i).getRam());
                                    System.out.printf("\nFuente de Poder: %d", computadoras.get(i).getFuenteDePoder());
                                    System.out.printf("\nHDD: %d", computadoras.get(i).getHdd());
                                }

                            }else{
                                System.out.println("\n!-----------------------------------------------!");
                                System.out.println("Debe capturar objetos primero antes de imprimir.");
                                System.out.println("!-----------------------------------------------!\n");
                                break;
                            }
                            break;
        
                        default:

                            System.out.println("Entrada invalida.");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("\n\nClase \"Audifonos\"");
                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    switch(userChoiceSubMenu){
                    
                        case 1:

                            //Capturar Atributos
                            for (int i=0; i<3; i++){
                                System.out.printf("\nINTRODUCIR DATOS PARA AUDIFONOS #%d\n",i+1);

                                System.out.printf("Introducir color: ");
                                audifonos.get(i).setColor(scan.next());
            
                                System.out.printf("Introducir modelo: ");
                                audifonos.get(i).setModelo(scan.next());
            
                                System.out.printf("Introducir tamaño: ");
                                audifonos.get(i).setTam(scan.next());
            
                                System.out.printf("Introducir portabilidad: ");
                                audifonos.get(i).setPortabilidad(scan.next());
            
                                System.out.printf("Introducir Tipo de Entrada: ");
                                audifonos.get(i).setTipoDeEntrada(scan.next());
                            }
                            capturaDeObjetosAud = true;
                            break;

                        case 2:
                            if(capturaDeObjetosAud == true){
                                //Imprimir Objetos
                                for(int i=0; i<3; i++){
                                    System.out.printf("\n\nAUDIFONO #%d",i+1);
                                    System.out.printf("\nColor: %s", audifonos.get(i).getColor());
                                    System.out.printf("\nModelo: %s", audifonos.get(i).getModelo());
                                    System.out.printf("\nTam: %s", audifonos.get(i).getTam());
                                    System.out.printf("\nPortabilidad: %s", audifonos.get(i).getPortabilidad());
                                    System.out.printf("\nTipo de Entrada: %s", audifonos.get(i).getTipoDeEntrada());
                                }
                            }else{

                                System.out.println("\n!-----------------------------------------------!");
                                System.out.println("Debe capturar objetos primero antes de imprimir.");
                                System.out.println("!-----------------------------------------------!\n");
                                break;
                            }
                            break;

                        default:
                            System.out.println("\nEntrada invalida.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n\nClase \"Bicicleta\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){

                                System.out.printf("\nINTRODUCIR DATOS PARA BICICLETA #%d\n",i+1);
                                System.out.println("Introducir Modelo: ");
                                bicicletas.get(i).setModelo(scan.next());
            
                                System.out.println("Introducir Color: ");
                                bicicletas.get(i).setColor(scan.next());
            
                                System.out.println("Introducir Tam de Llantas: ");
                                bicicletas.get(i).setTamDeLlantas(scan.nextInt());
            
                                System.out.println("Introducir Tipo: ");
                                bicicletas.get(i).setTipo(scan.next());
            
                                System.out.println("Introducir Material: ");
                                bicicletas.get(i).setMaterial(scan.next());
                            }
                            capturaDeObjetosBic = true;
                            break;
                        
                        case 2:
                            if(capturaDeObjetosBic == true){
                                //Imprimir Objetos
                                for(int i=0; i<3; i++){
                                    System.out.printf("\n\nBICICLETA #%d",i+1);
                                    System.out.printf("\nModelo: %s", bicicletas.get(i).getModelo());
                                    System.out.printf("\nColor: %s", bicicletas.get(i).getColor());
                                    System.out.printf("\nTam de Llantas: %d", bicicletas.get(i).getTamDeLlantas());
                                    System.out.printf("\nTipo: %s", bicicletas.get(i).getTipo());
                                    System.out.printf("\nMaterial: %s", bicicletas.get(i).getMaterial());
                                }
                            }else{

                                System.out.println("\n!-----------------------------------------------!");
                                System.out.println("Debe capturar objetos primero antes de imprimir.");
                                System.out.println("!-----------------------------------------------!\n");
                                break;
                            }
                            break;
                        
                        default:
                            System.out.println("\nEntrada Invalida.");
                            break;

                    }
                    break;

                case 4:
                    System.out.println("\n\nClase \"Celular\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){

                                System.out.printf("\nINTRODUCIR DATOS PARA CELULAR #%d\n",i+1);
                                System.out.println("Introducir Modelo:");
                                celulares.get(i).setModelo(scan.next());
            
                                System.out.println("Introducir Color:");
                                celulares.get(i).setColor(scan.next());
            
                                System.out.println("Introducir Tam:");
                                celulares.get(i).setTam(scan.next());
            
                                System.out.println("Introducir Almacenamiento:");
                                celulares.get(i).setAlmacenamiento(scan.nextInt());
            
                                System.out.println("Introducir Resolucion de Camara:");
                                celulares.get(i).setResolucionCamara(scan.next());
                            }
                            capturaDeObjetosCel = true;
                            break;
                        
                        case 2:
                            if(capturaDeObjetosCel == true){
                                //Imprimir Objetos
                                for(int i=0; i<3; i++){
                                    System.out.printf("\n\nCAMARA #%d",i+1);
                                    System.out.printf("\nModelo: %s", celulares.get(i).getModelo());
                                    System.out.printf("\nColor: %s", celulares.get(i).getColor());
                                    System.out.printf("\nTam: %s", celulares.get(i).getTam());
                                    System.out.printf("\nAlmacenamiento: %d", celulares.get(i).getAlmacenamiento());
                                    System.out.printf("\nResolucion de Camara: %s", celulares.get(i).getResolucionCamara());
                                }
                            }else{

                                System.out.println("\n!-----------------------------------------------!");
                                System.out.println("Debe capturar objetos primero antes de imprimir.");
                                System.out.println("!-----------------------------------------------!\n");
                                break;
                            }
                            break;

                        default:
                            System.out.println("Entrada Invalida.");

                    }
                    break;

                case 5: 
                    System.out.println("\n\nClase \"Automovil\"");

                    printSubMenu();
                    userChoiceSubMenu = scan.nextInt();

                    switch(userChoiceSubMenu){
                        case 1:

                            //Capturar Atributos
                            for(int i=0; i<3; i++){

                                System.out.printf("\nINTRODUCIR DATOS PARA AUTOMOVIL #%d\n",i+1);
                                System.out.printf("Introducir Modelo:");
                                automoviles.get(i).setModelo(scan.next());
            
                                System.out.printf("Introducir Color:");
                                automoviles.get(i).setColor(scan.next());
            
                                System.out.printf("Introducir Tam de Auto:");
                                automoviles.get(i).setTam(scan.next());
            
                                System.out.printf("Introducir year de creacion:");
                                automoviles.get(i).setYearDeCreacion(scan.nextInt());
            
                                System.out.printf("Introducir Cantidad de Puertas:");
                                automoviles.get(i).setNumeroDePuertas(scan.nextInt());
                            }
                            capturaDeObjetosAuto = true;
                            break;

                        case 2:
                            if(capturaDeObjetosAuto == true){

                                //Imprimir Objetos
                                for(int i=0; i<3; i++){
                                    System.out.printf("\n\nAUTOMOVIL #%d",i+1);
                                    System.out.printf("\nModelo: %s", automoviles.get(i).getModelo());
                                    System.out.printf("\nColor: %s", automoviles.get(i).getColor());
                                    System.out.printf("\nTam: %s", automoviles.get(i).getTam());
                                    System.out.printf("\nYear de Creacion: %d", automoviles.get(i).getYearDeCreacion());
                                    System.out.printf("\nCantidad de Puertas: %d", automoviles.get(i).getNumeroDePuertas());
                                }
                            }else{

                                System.out.println("\n!-----------------------------------------------!");
                                System.out.println("Debe capturar objetos primero antes de imprimir.");
                                System.out.println("!-----------------------------------------------!\n");
                                break;
                            }
                            break;

                        default:
                            System.out.println("Entrada Invalida.");
                            break;

                    }
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

    //funcion para imprimir el menu principal
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

    //funcion para imprimir el submenu
    static void printSubMenu(){
        System.out.printf("\nEscoge una opcion.");
        System.out.printf("\n1) Capturar atributos");
        System.out.printf("\n2) Imprimir Objetos");
        System.out.printf("\nIntroducir numero: ");
    }   
}