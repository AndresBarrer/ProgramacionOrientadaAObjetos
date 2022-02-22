package Practica2.Classes;

public class Audifonos {

    
    private String color; 
    private String modelo;
    private String tam;
    private String portabilidad;
    private String tipoDeEntrada;

    //si el objeto es creado sin valores, se guardan de esta manera
    public Audifonos(){
        this.color = "";
        this.modelo = "";
        this.tam = "";
        this.portabilidad = "";
        this.tipoDeEntrada = "";
    }

    //si el objeto es creado con valores, se les asigna del argumento
    public Audifonos(String color, String modelo, String tam, String portabilidad, String tipoDeEntrada){
        this.color = color;
        this.modelo = modelo;
        this.tam = tam;
        this.portabilidad = portabilidad;
        this.tipoDeEntrada = tipoDeEntrada;
    }

    /*
    getXxxxx = devolver el valor
    setXxxxx = establecer valores
    */
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTam(){
        return tam;
    }
    public void setTam(String tam){
        this.tam = tam;
    }

    public String getPortabilidad(){
        return portabilidad;
    }
    public void setPortabilidad(String portabilidad){
        this.portabilidad = portabilidad;
    }

    public String getTipoDeEntrada(){
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada){
        this.tipoDeEntrada = tipoDeEntrada;
    }
    
}
