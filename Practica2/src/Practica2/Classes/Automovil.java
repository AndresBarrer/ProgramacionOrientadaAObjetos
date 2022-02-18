package Practica2.Classes;

public class Automovil {
    private String modelo; 
    private String color;
    private String tam;
    private int yearDeCreacion;
    private int numeroDePuertas;

    public Automovil(){
        this.modelo = "";
        this.color = "";
        this.tam = "";
        this.yearDeCreacion = 0;
        this.numeroDePuertas = 0;
    }

    public Automovil(String modelo, String color, String tam, int yearDeCreacion, int numeroDePuertas){
        this.modelo = modelo;
        this.color = color;
        this.tam = tam;
        this.yearDeCreacion = yearDeCreacion;
        this.numeroDePuertas = numeroDePuertas;
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

    public String getTam(){
        return tam;
    }
    public void setTam(String tam){
        this.tam = tam;
    }

    public int getYearDeCreacion(){
        return yearDeCreacion;
    }
    public void setYearDeCreacion(int yearDeCreacion){
        this.yearDeCreacion = yearDeCreacion;
    }

    public int getNumeroDePuertas(){
        return numeroDePuertas;
    }
    public void setNumeroDePuertas(int numeroDePuertas){
        this.numeroDePuertas = numeroDePuertas;
    }
    
}
