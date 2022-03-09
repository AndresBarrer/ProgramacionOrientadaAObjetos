package Classes;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;



public class Mexicano{
    //informacion sobre nombre
    String nombre, apellido1, apellido2;
    String CURP, RFC;

    //informacion sobre fecha de nacimiento
    String year, mes, dia;

    //genero, entidad
    String genero, entidad;
    
    boolean checkIsKeyPresent;
    
    Scanner scan = new Scanner(System.in);
    
    //entidad
    //Map<String, String> entidades = new HashMap<>();
    HashMap<String, String> entidades = new HashMap<String, String>(){{
    put("AGUASCALIENTES", "AS");
    put("BAJA CALIFORNIA SUR", "BS");
    put("COAHUILA", "CL");
    put("CHIAPAS", "CS");
    put("DISTRITO FEDERAL", "DF");
    put("GUANAJUATO", "GT");
    put("HIDALGO", "HG");
    put("MEXICO", "MC");
    put("MORELOS", "MS");
    put("NUEVO LEON", "NL");
    put("PUEBLA", "PL");
    put("QUINTANA ROO", "QR");
    put("SINALOA", "SL");
    put("TABASCO", "TC");
    put("TLAXCALA","TL");
    put("YUCATAN","YN");
    put("EXTRANJERO","NE");
    put("BAJA CALIFORNIA","BC");
    put("CAMPECHE","CC");
    put("COLIMA","CM");
    put("CHIHUAHUA","CH");
    put("DURANGO","DG");
    put("GUERRERO","GR");
    put("JALISCO","JC");
    put("MICHOACAN","MN");
    put("NAYARIT","NT");
    put("OAXACA","OC");
    put("QUERETARO","QT");
    put("SAN LUIS POTOSI","SP");
    put("SONORA","SR");
    put("TAMAULIPAS","TS");
    put("VERACRUZ","VZ");
    put("ZACATECAS","ZS");
    }};

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

        //if the key is present, the continue inside condition
        if(isKeyPresent(entidad)){

            //for each key in the entire key set of the dictionary
            for (String key : entidades.keySet()){
                
                //compares key string to the entered entidad string
                if(key.equals(this.entidad)) {

                    //assigns the found key value
                    this.entidad = entidades.get(key.toUpperCase());
                }
            }
        }else{
            System.out.println("Entidad no valida.");
        }
    }

    public boolean isKeyPresent(String entidad){
        checkIsKeyPresent = entidades.containsKey(entidad.toUpperCase());
        return checkIsKeyPresent;
    }    
    
    //siguente consonante del primer apellido
    public char getConsonantePrimerApellido(){
        for(int i=1; i<this.apellido1.length(); i++) {
            if(this.apellido1.charAt(i) != 'A' && this.apellido1.charAt(i) !='E'&& 
                this.apellido1.charAt(i) != 'I' && this.apellido1.charAt(i) != 'O' && 
                this.apellido1.charAt(i) != 'U') {
                    System.out.println(this.apellido1.charAt(i) != 'A');
                    return this.apellido1.charAt(i);
            }
        }
        return 0;
    }

    //siguente consonante del segundo apellido
    public char getConsonanteSegundoApellido(){
        for(int i=1; i<this.apellido2.length(); i++) {
            if(this.apellido2.charAt(i) != 'A' && this.apellido2.charAt(i) !='E'&& 
                this.apellido2.charAt(i) != 'I' && this.apellido2.charAt(i) != 'O' && 
                this.apellido2.charAt(i) != 'U') {
                    System.out.println(this.apellido2.charAt(i) != 'A');
                    return this.apellido2.charAt(i);
            }
        }
        return 0;
    }
    
    //siguente consonante del primer nombre
    public char getConsonantePrimerNombre(){
        for(int i=1; i<this.nombre.length(); i++) {
            if(this.nombre.charAt(i) != 'A' && this.nombre.charAt(i) !='E'&& 
                this.nombre.charAt(i) != 'I' && this.nombre.charAt(i) != 'O' && 
                this.nombre.charAt(i) != 'U') {
                    System.out.println(this.nombre.charAt(i) != 'A');
                    return this.nombre.charAt(i);
            }
        }
        return 0;
    }

    //homoclave
    //String nombre, String apellido1, String apellido2
    Random Random = new Random();
    char randomizedChar1 = (char) (Random.nextInt(43) + '0');
    char randomizedChar2 = (char) (Random.nextInt(43) + '0');
    public void makeCURP(String apellido1, String apellido2, String nombre, String year, String mes, String dia, String genero, String entidad){
        System.out.printf("\nCURP: " + this.apellido1.charAt(0) + 
                            this.getPrimerVocal() + this.apellido2.charAt(0) + 
                            this.nombre.charAt(0) + this.year + this.mes + this.dia +
                            this.genero + this.entidad + this.getConsonantePrimerApellido() + 
                            this.getConsonanteSegundoApellido() + this.getConsonantePrimerNombre() +
                            randomizedChar1 + randomizedChar2);
    }
}
    
