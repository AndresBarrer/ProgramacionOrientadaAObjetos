package Robots;

public abstract class Robot {

    public float bateria;
    public String nombre, ultimaAccion;
    public int identificador;

    public Robot(float bateria, String nombre, int identificador){
        setBateria(bateria);
        setNombre(nombre);
        setIdentificador(identificador);
        setUltimaAccion("Aun no ha realizado ninguna accion");
    }
    
    public abstract void restarBateria(); //cada robot tendra un nivel diferente de bateria en que se gasta
    public abstract int accion(String x);

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }
    private float getBateria() {
        return this.bateria;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String getNombre() {
        return this.nombre;
    }

    public void setUltimaAccion(String ultimaAccion) {
        this.ultimaAccion = ultimaAccion;
    }
    private String getUltimaAccion() {
        return this.ultimaAccion;
    }

    private void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    private int getIdentificador() {
        return this.identificador;
    }
    
    public void imprimeBot(){
        System.out.println("Identificador: " + getIdentificador());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ultima accion realizada por el robot: " + getUltimaAccion());
        System.out.println("Bateria restante: " + getBateria());
        System.out.println("\n");
    }


}
