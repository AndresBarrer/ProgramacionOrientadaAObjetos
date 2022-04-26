import java.util.HashMap;
import java.util.Map;

public class Torneo {
    private String nombre, region;
    private int partidosJugados, partidosPendientes, numeroParticipantes;
    private Map<Integer, Equipo> equipos;

    public Torneo(String nombre, String region, int numeroEquiposParticipantes, int partidosJugados, int partidosPendientes){
        this.equipos = new HashMap<>();

        this.setNombre(nombre);
        this.setRegion(region);
        this.setNumeroEquiposParticipantes(numeroEquiposParticipantes);
        this.setPartidosJugados(partidosJugados);   
        this.setPartidosPendientes(partidosPendientes);
       

        this.agregarEquipos();
        }

    private void agregarEquipos(){
        for(int i=0; i<this.getNumeroEquiposParticipantes(); i++){
            System.out.println("------Ingreso de informacion sobre Equipo------");
            Equipo equipo = new Equipo(
                
            CapturaDeEntradas.capturarString("Nombre de equipo"),
            CapturaDeEntradas.capturarString("Division"),
            CapturaDeEntradas.capturarString("Entrenador"),
            CapturaDeEntradas.capturarEntero("Torneos participados"),
            CapturaDeEntradas.capturarEntero("Torneos ganados"),
            CapturaDeEntradas.capturarEntero("Torneos perdidos"),
            CapturaDeEntradas.capturarEntero("Cantidad de jugadores en equipo"),
            i);

            this.equipos.put(i, equipo);
        }
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }
    private void setRegion(String region) {
        this.region = region;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }
    private void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }
    private void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public int getNumeroEquiposParticipantes() {
        return numeroParticipantes;
    }
    private void setNumeroEquiposParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getNumeroJugadores(int equipo){
        return this.equipos.get(equipo).getJugadoresRegistrados();
    }

    public String getNombreJugador(int equipo, int jugador){
        return this.equipos.get(equipo).getNombreJugador(jugador);
    }

    public int getNumeroUniforme(int equipo, int jugador){
        return this.equipos.get(equipo).getNumeroUniforme(jugador);
    }
   
    public String getNombreEquipo(int equipo){
        return this.equipos.get(equipo).getNombre();
    }

    public int getPuntosAnotados(int equipo){
        return this.equipos.get(equipo).puntosAnotados();
    }

    public String getDivision(int equipo){
        return this.equipos.get(equipo).getDivision();
    }

    public int getPuntosEquipos(int equipo){
        return this.equipos.get(equipo).puntosAnotados();
    }
}
