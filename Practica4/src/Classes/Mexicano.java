package Classes;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class Mexicano{
    //informacion sobre nombre
    String nombre, apellido1, apellido2;
    String CURP, RFC;

    //informacion sobre fecha de registro y fecha de nacimiento
    String yearCURP, mesCURP, diaCURP;
    String yearRFC, mesRFC, diaRFC;

    //genero, entidad
    String genero, entidad, nacionalidad;
    
    boolean checkIsKeyPresent, residencia;
    
    Scanner scan = new Scanner(System.in);
    
    public Mexicano(){
        this.nombre="";
        this.apellido1="";
        this.apellido2="";
        this.yearCURP="";
        this.mesCURP="";
        this.diaCURP= "";
        this.yearRFC="";
        this.mesRFC="";
        this.diaRFC= "";
        this.genero = "";
        this.entidad = "";
    }

    public Mexicano(String nombre, String apellido1, String apellido2, String yearCurp, 
                    String mesCurp,String diaCurp, String yearRFC, String mesRFC, 
                    String diaRFC, String genero, String entidad, String nacionalidad, boolean residencia){
        this.nombre= nombre.toUpperCase();
        this.apellido1= apellido1.toUpperCase();
        this.apellido2= apellido2.toUpperCase();
        this.yearCURP= yearCurp;
        this.mesCURP= mesCurp;
        this.diaCURP= diaCurp;
        this.yearRFC= yearRFC;
        this.mesRFC= mesRFC;
        this.diaRFC= diaRFC;
        this.genero = genero.toUpperCase();
        setEntidad(entidad.toUpperCase());
        this.nacionalidad = nacionalidad.toUpperCase();
        this.residencia = residencia;
    }

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

    public String getFechaDiaCURP(){
        return this.diaCURP;
    }
    public void setFechaDiaCURP(String diaCURP){
        this.diaCURP = diaCURP;
    }

    public String getFechaMesCURP(){
        return this.mesCURP;
    }
    public void setFechaMesCURP(String mesCURP){
        this.mesCURP = mesCURP;
    }

    public String getFechaYearCURP(){
        return this.yearCURP.substring(2,4);
    }
    public void setFechaYearCURP(String yearCURP){
        this.yearCURP = yearCURP;
    }


    public String getFechaDiaRFC(){
        return this.diaRFC;
    }
    public void setFechaDiaRFC(String diaRFC){
        this.diaRFC = diaRFC;
    }

    public String getFechaMesRFC(){
        return this.mesRFC;
    }
    public void setFechaMesRFC(String mesRFC){
        this.mesRFC = mesRFC;
    }

    public String getFechaYearRFC(){
        return this.yearRFC.substring(2,4);
    }
    public void setFechaYearRFC(String yearRFC){
        this.yearRFC = yearRFC;
    }

    public char getPrimerVocalApellido1(){
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

    //entidad de nacimiento 
    public String getNacionalidad(){
        return this.nacionalidad.toUpperCase();
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
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
                    return this.nombre.charAt(i);
            }
        }
        return 0;
    }

    //homoclave
    //String nombre, String apellido1, String apellido2
    Random Random = new Random();
    char randomizedChar1 = (char) (Random.nextInt(26) + 'A');
    char randomizedChar2 = (char) (Random.nextInt(26) + 'A');
    char randomizedChar3 = (char) (Random.nextInt(26) + 'A');
    Calendar currentTimeNow = Calendar.getInstance();
    

    //String apellido1, String apellido2, String nombre, String yearCURP, String mesCURP, String diaCURP, String genero, String entidad
    public void makeCURP(){
        if(this.getNacionalidad().equalsIgnoreCase("MEXICANA")){
        System.out.printf("CURP: " + this.getPrimerApellido().charAt(0) + this.getPrimerVocalApellido1() + 
                                        this.getSegundoApellido().charAt(0) + this.getNombre().charAt(0) +
                                        this.getFechaYearCURP() + this.getFechaMesCURP() + this.getFechaDiaCURP() + 
                                        this.getGenero() + this.getEntidad() + this.getConsonantePrimerApellido() + 
                                        this.getConsonanteSegundoApellido() + this.getConsonantePrimerNombre() +
                                        randomizedChar1 + randomizedChar2 + "\n");
        }else{
            if(residencia == true){
                currentTimeNow.add(Calendar.HOUR, 4320);
                //asignar curp temporal por un periodo maximo de 180 dias naturales
                // y se asignara como estado el lugar donde se realizo el tramite
                Date nuevoTime = currentTimeNow.getTime();
                System.out.println("Curp temporal, se vence:" + nuevoTime);
                System.out.printf(this.getPrimerApellido().charAt(0) + this.getPrimerVocalApellido1() + 
                                this.getSegundoApellido().charAt(0) + this.getNombre().charAt(0) +
                                this.getFechaYearCURP() + this.getFechaMesCURP() + this.getFechaDiaCURP() + 
                                this.getGenero() + this.getEntidad() + this.getConsonantePrimerApellido() + 
                                this.getConsonanteSegundoApellido() + this.getConsonantePrimerNombre() +
                                randomizedChar1 + randomizedChar2 + "\n");
            }else{
                System.out.println("ERROR. NO SE PUDO GENERAR EL CURP.");
            }
        }
    }

    public void makeRFC(){
        System.out.printf("RFC: " + this.getPrimerApellido().charAt(0) + this.getPrimerVocalApellido1() + 
                                    this.getSegundoApellido().charAt(0) + this.getNombre().charAt(0) + 
                                    this.getFechaYearRFC() + this.getFechaMesRFC() + this.getFechaDiaRFC() + 
                                    randomizedChar3 + randomizedChar2 + randomizedChar1 + "\n");
    }
}