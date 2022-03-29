public class Bird {
    //caracteristicas comunes entre birds
    private String nombre, tam, color, velocidad, AbilidadEspecial;
    private int impulso;


    public Bird(){
        this.nombre = "";
        this.tam = "";
        this.color = "";
        this.velocidad = "";
        this.impulso = 0;    
        this.AbilidadEspecial = "";
    }

    public Bird(String nombre, String tam, String color, String velocidad, int impulso){
        this.nombre = nombre;
        this.tam = tam;
        this.color = color;
        this.velocidad = velocidad;
        this.impulso = impulso;    
    }
    
    /*
    getters y setters de cada atributo en comun
    */
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

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

    public String getAbilidadEspecial(){
        return this.AbilidadEspecial;
    }
    public void setAbilidadEspecial(String AbilidadEspecial){
        this.AbilidadEspecial = AbilidadEspecial;
    }

    public static String Atacar(Bird[] birds, int indice){
        return "El pajaro " + birds[indice].getNombre() + " ataco y " + birds[indice].getAbilidadEspecial() +"\n";
    }
}
