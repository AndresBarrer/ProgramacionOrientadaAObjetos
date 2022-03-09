package Classes;
import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;


public class Mexicano{
    //informacion sobre nombre
    String nombre, apellido1, apellido2;
    String CURP, RFC;

    //informacion sobre fecha de nacimiento
    String year, mes, dia;

    //genero, entidad
    String genero, entidad;
    
    boolean isKeyPresent;
    
    Scanner scan = new Scanner(System.in);
    
    //entidad
    //Map<String, String> entidades = new HashMap<>();
    static HashMap<String, String> entidades;
    static{
    entidades.put("AGUASCALIENTES", "AS");
    entidades.put("BAJA CALIFORNIA SUR", "BS");
    entidades.put("COAHUILA", "CL");
    entidades.put("CHIAPAS", "CS");
    entidades.put("DISTRITO FEDERAL", "DF");
    entidades.put("GUANAJUATO", "GT");
    entidades.put("HIDALGO", "HG");
    entidades.put("MEXICO", "MC");
    entidades.put("MORELOS", "MS");
    entidades.put("NUEVO LEON", "NL");
    entidades.put("PUEBLA", "PL");
    entidades.put("QUINTANA ROO", "QR");
    entidades.put("SINALOA", "SL");
    entidades.put("TABASCO", "TC");
    entidades.put("TLAXCALA","TL");
    entidades.put("YUCATAN","YN");
    entidades.put("EXTRANJERO","NE");
    entidades.put("BAJA CALIFORNIA","BC");
    entidades.put("CAMPECHE","CC");
    entidades.put("COLIMA","CM");
    entidades.put("CHIHUAHUA","CH");
    entidades.put("DURANGO","DG");
    entidades.put("GUERRERO","GR");
    entidades.put("JALISCO","JC");
    entidades.put("MICHOACAN","MN");
    entidades.put("NAYARIT","NT");
    entidades.put("OAXACA","OC");
    entidades.put("QUERETARO","QT");
    entidades.put("SAN LUIS POTOSI","SP");
    entidades.put("SONORA","SR");
    entidades.put("TAMAULIPAS","TS");
    entidades.put("VERACRUZ","VZ");
    entidades.put("ZACATECAS","ZS");
    }

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
            if(this.apellido1.charAt(i) == 'A'|| this.apellido1.charAt(i) == 'E'|| 
                this.apellido1.charAt(i) == 'I' || this.apellido1.charAt(i) == 'O' || 
                this.apellido1.charAt(i) == 'U') {

                    return this.apellido1.charAt(i);
            }
        }
        return 0;
    }

    
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero.toUpperCase();
    }
    
    //entidad de nacimiento 
    public String getEntidad(){
        return this.entidad;
    }
    public void setEntidad(String entidad){
        this.entidad = entidad.toUpperCase();
    }

    isKeyPresent = entidades.containsKey(this.entidad);
    if(isKeyPresent){
        for (String key : entidades.keySet()) {
            this.entidad = entidades.get(key);
        }
    }else{
        System.out.println("Entidad no valida.");
    }

    //siguente consonante del primer apellido
    public char getConsonantePrimerApellido(){
        for(int i=0; i<this.apellido1.length(); i++) {
            if(this.apellido1.charAt(i) != 'A'|| this.apellido1.charAt(i) != 'E'|| 
                this.apellido1.charAt(i) != 'I' || this.apellido1.charAt(i) != 'O' || 
                this.apellido1.charAt(i) != 'U') {

                    return this.apellido1.charAt(i);
            }
        }
    }

    //siguente consonante del segundo apellido

    
    //siguente consonante del primer nombre


    //homoclave
    //String nombre, String apellido1, String apellido2
    public void makeCURP(String apellido1, String apellido2, String nombre, String year, String mes, String dia, String genero, String entidad){
        System.out.printf("\nCURP: " + this.apellido1.charAt(0) + this.getPrimerVocal() + this.apellido2.charAt(0) + this.nombre.charAt(0) + this.year + this.mes + this.dia);
    }
    
}