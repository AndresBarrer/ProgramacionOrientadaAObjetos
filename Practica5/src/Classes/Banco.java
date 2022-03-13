package Classes;
import java.util.Scanner;

/*Crea una clase Banco que permita registrar nuevas cuentas.*/
public class Banco{

    Cuenta cuenta = new Cuenta();
    Scanner scan =new Scanner(System.in);

    //String nombre, String direccion, float saldo
    public long registrarCuenta(){
        System.out.println("Introducir nombre: ");
        cuenta.setNombreCliente(scan.nextLine());
        cuenta.setDireccion(scan.nextLine());
        cuenta.setSaldo(scan.nextFloat());
        return 1; //MUST RETURN ACCOUNT NUMBER, GENERATE ACCOUNT NUMBER USING RANDOM
    }

    
    public float AccederSaldo(int nip, long numeroCuenta, int fechaVencimiento){
        if((cuenta.getNip() == nip) && 
            (cuenta.getNumeroCuenta() == numeroCuenta) && 
            (cuenta.getFechaVencimiento() == fechaVencimiento)){
                return cuenta.getSaldo();
        }else{
            return 0;
        }
    }
    

}
