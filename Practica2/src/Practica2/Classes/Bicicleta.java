package Practica2.Classes;

public class Bicicleta {
    private String modelo; 
    private String color;
    private int tamDeLlantas;
    private String tipo;
    private String material;

    //si el objeto es creado sin valores, se guardan de esta manera
    public Bicicleta(){
        this.modelo = "";
        this.color = "";
        this.tamDeLlantas = 0;
        this.tipo = "";
        this.material = "";
    }

    //si el objeto es creado con valores, se les asigna del argumento
    public Bicicleta(String modelo, String color, int tamDeLlantas, String tipo, String material){
        this.modelo = modelo;
        this.color = color;
        this.tamDeLlantas = tamDeLlantas;
        this.tipo = tipo;
        this.material = material;
    }

    /*
    getXxxxx = devolver el valor
    setXxxxx = establecer valores
    */
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getTamDeLlantas(){
        return tamDeLlantas;
    }
    public void setTamDeLlantas(int tamDeLlantas){
        this.tamDeLlantas = tamDeLlantas;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
}
