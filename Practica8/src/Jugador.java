public class Jugador {
    int numeroDeUniforme;
    String nombre;
    int puntosAnotados;
    String posicion;
    float estatura;

    public Jugador(){
        
    }
    /* getters y setters*/
    public int getNumeroDeUniforme() {
        return numeroDeUniforme;
    }
    public void setNumeroDeUniforme(int numeroDeUniforme) {
        this.numeroDeUniforme = numeroDeUniforme;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }
    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public float getEstatura() {
        return estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
}
