import java.util.ArrayList;

public class Equipo{ 

    private final int CANT_JUGADORES = 10;
    String nombre;
    String division;
    String nombreDeEntrenador;
    String torneosConParticipacion;
    int torneosGanados;
    int torneosPerdidos;

    private String divisiones[] = {1,2,3};
    private String entrenadores = {"Eren", "Armin", "Levi", "Erwin"};

    public Jugador[] jugadores = new Jugador();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }

    public String getNombreDeEntrenador() {
        return nombreDeEntrenador;
    }
    public void setNombreDeEntrenador(String nombreDeEntrenador) {
        this.nombreDeEntrenador = nombreDeEntrenador;
    }

    public String getTorneosConParticipacion() {
        return torneosConParticipacion;
    }
    public void setTorneosConParticipacion(String torneosConParticipacion) {
        this.torneosConParticipacion = torneosConParticipacion;
    }

    public int getTorneosPerdidos() {
        return torneosPerdidos;
    }
    public void setTorneosPerdidos(int torneosPerdidos) {
        this.torneosPerdidos = torneosPerdidos;
    }
    
}