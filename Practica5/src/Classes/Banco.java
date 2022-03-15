package Classes;
import java.util.Random;
//import java.util.Scanner;

/*Crea una clase Banco que permita registrar nuevas cuentas.*/
public class Banco extends Cuenta{

    //THIS IS WHERE THE PROBLEM IS D:
    Cuenta cuenta = new Cuenta();
    //Banco banco = new Banco();

    //Scanner scan = new Scanner(System.in);

    //String nombre, String direccion, float saldo
    public Cuenta registrarCuenta(String nombre, String direccion, float saldo, int nip){

        this.cuenta.setNombreCliente(nombre);
        this.cuenta.setDireccion(direccion);
        this.cuenta.setSaldo(saldo);
        this.cuenta.setNip(nip);
        
        //generar numero de cuenta
        Random r = new Random( System.currentTimeMillis());
        this.cuenta.setNumeroCuenta(10000 + r.nextInt(20000));
        return this.cuenta;
    }

    //might need to use an operator to compare
    public float AccederSaldo(int nip, int numeroCuenta){
        if((cuenta.getNip() == nip) && 
            (cuenta.getNumeroCuenta() == numeroCuenta)){
                return cuenta.getSaldo();
        }else{
            return 0;
        }
    }
    

}
