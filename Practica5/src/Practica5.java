import java.util.Scanner;
import Classes.Banco;
/*
Crear un programa que simule operaciones bancarias.

Una clase Cuenta se compone de: nombre del titular de la cuenta, el saldo que tiene esta cuenta y un PIN que se utiliza para acceder al saldo de la cuenta. 
Crear un menú en el que el usuario pueda crear una cuenta o acceder a una ya existente.
Al crear una cuenta se ingresará la información necesaria por parte del usuario para realizar el primer depósito. 
Para una cuenta ya existente, primero debe pedirle al usuario su PIN y luego dejar que retire o deposite como mejor le parezca.
Recuerda validar las transacciones para que tu banco no pierda ninguno de sus recursos.
Realiza el diagrama UML para las clases de banco y cuenta.
*/
public class Practica5 extends Banco{
    public static void main(String[] args){

        /*Crear un menú en el que el usuario pueda crear una cuenta 
        o acceder a una ya existente. */
        Banco banco = new Banco();

        int opcion;
        printMenu();
        Scanner scan = new Scanner(System.in);

        opcion = scan.nextInt();
        switch(opcion){
            case 1:
                //banco.registrarCuenta(); this doesnt work, but this is basically what I need to do
                break;

            case 2:
                //banco.AccederSaldo(nip, numeroCuenta, fechaVencimiento) havent checked this yet
                break;

            default:
                //break condition
                break;
        }

        scan.close();
    }

    static void printMenu(){
        System.out.printf("\n----------MENU------------");
        System.out.printf("\n1) Crear una cuenta");
        System.out.printf("\n2) Acceder a una cuenta");
        System.out.printf("\n\nEscoger una opcion:");
    }
}
