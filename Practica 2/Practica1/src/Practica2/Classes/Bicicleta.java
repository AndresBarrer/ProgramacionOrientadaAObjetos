package Practica2.Classes;

public class Bicicleta {
    private String modelo; 
    private String color;
    private String tamDeLlantas;
    private String tipo;
    private String material;

    public Bicicleta(){
        this.modelo = "";
        this.color = "";
        this.tamDeLlantas = "";
        this.tipo = "";
        this.material = "";
    }

    public Bicicleta(String modelo, String color, String tamDeLlantas, String tipo, String material){
        this.modelo = modelo;
        this.color = color;
        this.tamDeLlantas = tamDeLlantas;
        this.tipo = tipo;
        this.material = material;
    }

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

    public String getTamDeLlantas(){
        return tamDeLlantas;
    }
    public void setTamDeLlantas(String tamDeLlantas){
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
