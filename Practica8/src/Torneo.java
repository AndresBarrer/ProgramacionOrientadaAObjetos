public class Torneo {
    String nombre;
    String region;
    int numeroDeEquipos;
    int partidosJugados;
    int partidosPendientes;

    /*getters y setters*/

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumeroDeEquipos() {
        return numeroDeEquipos;
    }
    public void setNumeroDeEquipos(int numeroDeEquipos) {
        this.numeroDeEquipos = numeroDeEquipos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }
    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }
    
}
