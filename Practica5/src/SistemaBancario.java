import java.util.ArrayList;
import java.util.Scanner;
import Classes.Banco;
import Classes.Cuenta;

public class SistemaBancario{
    public static void main(String[] args){

        int nip, numeroCuenta;

        Scanner scan = new Scanner(System.in);

        //create arrays to store bank accounts
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>(); 

        String nombre, direccion;
        float saldo;
        boolean exit = false;
        int count=0;

        while(!exit){

            printMenu();
            switch(scan.nextInt()){

            case 1:
                //registrar cuenta e imprimir numero de cuenta
                System.out.printf("\nIntroducir nombre: ");
                nombre = scan.next();
                scan.nextLine();

                System.out.printf("\nIntroducir direccion: ");
                direccion = scan.next();
                scan.nextLine();

                System.out.printf("\nIntroducir saldo: ");
                saldo = scan.nextFloat();

                System.out.printf("\nIntroducir nip (ej: 2342): ");
                nip = scan.nextInt();

                Banco banco = new Banco();
                cuentas.add(banco.registrarCuenta(nombre, direccion, saldo, nip));

                System.out.printf("Numero de cuenta: %d", cuentas.get(count).getNumeroCuenta()); 
                count++;

                break;



            case 2:
                //buscar numero de cuenta y desplegar informacion sobre esa cuenta
                boolean cuentaExiste = false;
                int cuentaNIP = 0;
                int cuentaIndice = 0;
                int usuarioNIP = 0;
            
                System.out.println("Introducir numero de cuenta: ");
                numeroCuenta = scan.nextInt();

                //usar el tam del array para buscar el numero de cuenta del usuario deseado
                for(int i=0; i<cuentas.size(); i++){

                    //checar el numero de cuenta ingresado con el existente de cada usuario
                    if(((cuentas.get(i).getNumeroCuenta() == numeroCuenta))){
                        cuentaExiste = true;
                        cuentaIndice = i;
                        cuentaNIP = cuentas.get(i).getNip();

                        //si la cuenta existe, entonces entrar a este menu
                        if(cuentaExiste){

                            //si la cuenta existe, pedir nip 
                            System.out.println("Introducir nip: ");
                            usuarioNIP = scan.nextInt();
        
                            //si el nip ingresado es el mismo que el guardado, entra a menu 
                            if(cuentaNIP == usuarioNIP){
                                
                                boolean exitOpcionesDeCuenta = false;
                                float deposito = 0, nuevoSaldo = 0, retiro = 0;

                                //while loop para seguir dentro de las opciones de cuenta
                                while(!exitOpcionesDeCuenta){
                                    
                                    //imprimir menu de opciones de cuenta y preguntar a donde quiere ir
                                    printOpcionesDeCuenta();
                                    int opcionDeCuenta = scan.nextInt();

                                    switch(opcionDeCuenta){

                                        
                                        case 1:
                                            //desplegar saldo
                                            System.out.printf("\nSaldo: %.2f", cuentas.get(cuentaIndice).getSaldo());
                                            break;


                                        case 2:
                                            //hacer un deposito
                                            System.out.println("\nCuanto vas a depositar: ");
                                            deposito = scan.nextFloat();
                                            nuevoSaldo = cuentas.get(cuentaIndice).getSaldo() + deposito;
                                            cuentas.get(cuentaIndice).setSaldo(nuevoSaldo);
                                            break;

                                        case 3:
                                            //hacer un retiro
                                            System.out.println("\nCuanto quieres retirar?: ");
                                            retiro = scan.nextFloat();

                                            //verificacion que hay suficiente dinero en la cuenta
                                            if(retiro <= cuentas.get(cuentaIndice).getSaldo()){
                                                nuevoSaldo = cuentas.get(cuentaIndice).getSaldo() - retiro;
                                                cuentas.get(cuentaIndice).setSaldo(nuevoSaldo);
                                            }else{
                                                System.out.println("No tienes suficiente dinero!\n");
                                            }
                                            break;
                                        
                                        case 4: 
                                            //salir del menu
                                            exitOpcionesDeCuenta = true;
                                            break;

                                        default:
                                            System.out.println("\nEntrada invalida!");
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    
                }
                //si la cuenta no fue encontrada, entonces informar que la cuenta no existe
                if(!cuentaExiste){
                    System.out.println("Esa cuenta no existe!");
                }
                break;

            case 3:
                //salir del menu principal
                System.out.println("Bye!");
                exit=true;
                break;

            default:
                //break condition
                break;
            }
        }
        scan.close();
    }

    //menu principal
    static void printMenu(){
        System.out.printf("\n\n----------MENU------------");
        System.out.printf("\n1) Crear una cuenta");
        System.out.printf("\n2) Acceder a una cuenta");
        System.out.printf("\n3) Salir");
        System.out.printf("\n\nEscoger una opcion:");
    }

    //menu de opciones de cuenta
    static void printOpcionesDeCuenta(){
        System.out.printf("\n-----OPCIONES DE CUENTA-----");
        System.out.printf("\n1) Consultar saldo");
        System.out.printf("\n2) Hacer un deposito");
        System.out.printf("\n3) Hacer un retiro");
        System.out.printf("\n4) Salir");
        System.out.printf("\nEscoger una opcion: ");
    }
}
