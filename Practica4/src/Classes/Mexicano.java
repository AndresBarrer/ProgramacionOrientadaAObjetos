package Classes;
import java.util.Scanner;

public class Mexicano {
    //informacion sobre nombre
    String nombre, apellido1, apellido2;
    String CURP, RFC;

    //informacion sobre fecha de nacimiento
    String year, mes, dia;

    //genero
    char genero;


    Scanner scan = new Scanner(System.in);

    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase();
    }

    public String getPrimerApellido(){
        return this.apellido1;
    }
    public void setPrimerApellido(String apellido){
        this.apellido1 = apellido.toUpperCase();
    }

    public String getSegundoApellido(){
        return this.apellido2;
    }
    public void setSegundoApellido(String apellido){
        this.apellido2 = apellido.toUpperCase();
    }

    public String getFechaDia(){
        return this.dia;
    }
    public void setFechaDia(String dia){
        this.dia = dia;
    }

    public String getFechaMes(){
        return this.mes;
    }
    public void setFechaMes(String mes){
        this.mes = mes;
    }

    public String getFechaYear(){
        return this.year;
    }
    public void setFechaYear(String year){
        this.year = year.substring(2,4);
    }

    public char getPrimerVocal(){
        for(int i=0; i<this.apellido1.length(); i++) {
            if(this.apellido1.charAt(i) == 'A'|| this.apellido1.charAt(i) == 'E'|| this.apellido1.charAt(i) == 'I' || this.apellido1.charAt(i) == 'O' || this.apellido1.charAt(i) == 'U') {
               return this.apellido1.charAt(i);
            }
        }
        return 0;
    }
    
    public void makeCURP(String nombre, String apellido1, String apellido2){
        System.out.printf("\nCURP: " + this.apellido1.charAt(0) + this.getPrimerVocal() + this.apellido2.charAt(0) +
                            this.nombre.charAt(0) + this.year + this.mes + this.dia);
    }
}
