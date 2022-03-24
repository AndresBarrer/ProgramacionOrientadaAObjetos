public class Bird {
    //caracteristicas comunes entre birds
    String name, tam, color, velocidad;
    int impulso;


    public Bird(){
        this.name = "";
        this.tam = "";
        this.color = "";
        this.velocidad = "";
        this.impulso = 0;    
    }

    public Bird(String name, String tam, String color, String velocidad, int impulso){
        this.name = name;
        this.tam = tam;
        this.color = color;
        this.velocidad = velocidad;
        this.impulso = impulso;    
    }
    
    /*
    getters y setters de cada atributo en comun
    */
    public String getTam(){
        return this.tam;
    }
    public void setTam(String tam){
        this.tam = tam;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getVelocidad(){
        return this.velocidad;
    }
    public void setVelocidad(String velocidad){
        this.velocidad = velocidad;
    }

    public int getImpulso(){
        return this.impulso;
    }
    public void setImpulso(int impulso){
        this.impulso = impulso;
    }
    
}
