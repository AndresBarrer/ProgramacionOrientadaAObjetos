package Classes;
/*
Crea una clase Cuenta, que tendrá diferentes atributos que, por la naturaleza 
de esta información deberán permanecer todos privados y solo ser accesibles para la clase Banco.
*/

public class Cuenta{
    private int nip;
    private int numeroCuenta;
    private float saldo;
    private String nombreCliente;
    private String direccion;

    //getters y setters para cada tipo de informacion respectivo
    public int getNip(){
        return this.nip;
    }
    public void setNip(int nip){
        this.nip = nip;
    }

    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public String getNombreCliente(){
        return this.nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}
