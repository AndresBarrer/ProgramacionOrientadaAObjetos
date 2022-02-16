package Practica2.Classes;

public class Celular {
    private String modelo; 
    private String color;
    private String tam;
    private int almacenamiento;
    private String resolucionCamara;

    public Celular(){
        this.modelo = "";
        this.color = "";
        this.tam = "";
        this.almacenamiento = 0;
        this.resolucionCamara = "";
    }

    public Celular(String modelo, String color, String tam, int almacenamiento, String resolucionCamara){
        this.modelo = modelo;
        this.color = color;
        this.tam = tam;
        this.almacenamiento = almacenamiento;
        this.resolucionCamara = resolucionCamara;
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

    public int getAlmacenamiento(){
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public String getResolucionCamara(){
        return resolucionCamara;
    }
    public void setResolucionCamara(String resolucionCamara){
        this.resolucionCamara = resolucionCamara;
    }
    
}
