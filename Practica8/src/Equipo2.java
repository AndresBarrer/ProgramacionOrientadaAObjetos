import java.util.ArrayList;

public class Equipo2 {

    String nombre, entrenador;
    int division, torneosConParticipacion, torneosGanados, torneosPerdidos; 
    List<String> jugadores = new ArrayList<>();

    public Equipo(nombre, division, entrenador){
        this.nombre = nombre;
        this.division = division;
        this.entrenador = entrenador;
        this.torneosGanados = 0;
        this.torneosPerdidos = 0;
        this.jugadores = jugadores;
    }

    public class agregarJugador(jugador){
        jugador.numeroUniforme = this.jugadores
    }
}