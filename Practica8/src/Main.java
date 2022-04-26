//Barrera Rodriguez Andres 
//Grupo 541

public class Main {
    public static void main(String[] args) {

        Torneo t = new Torneo(
            
        CapturaDeEntradas.capturarString("Nombre del torneo"),
        CapturaDeEntradas.capturarString("Region"),
        CapturaDeEntradas.capturarEntero("Cantidad de equipos participantes"),
        CapturaDeEntradas.capturarEntero("Cantidad de partidos jugados"),
        CapturaDeEntradas.capturarEntero("Cantidad de partidos por jugar"));
        
        System.out.println("\n------Informacion sobre el torneo------");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Region: " + t.getRegion());
        System.out.println("Numero de equipos participantes: " + t.getNumeroEquiposParticipantes());
        System.out.println("Partidos jugados: " + t.getPartidosJugados());
        System.out.println("Partidos pendientes: " + t.getPartidosPendientes());
        
        System.out.println("\n------Informacion sobre los equipos------");
        for(int i=0; i<t.getNumeroEquiposParticipantes(); i++){
            System.out.println("Equipo: " + t.getNombreEquipo(i));
            System.out.println("Division: " + t.getDivision(i));
            System.out.println("Puntos anotados: " + t.getPuntosEquipos(i));
            System.out.println("Cantidad de jugadores: " + t.getNumeroJugadores(i));
            System.out.println("Jugadores:\n");

            for(int j=0; j<t.getNumeroEquiposParticipantes(); j++){
                System.out.println("Nombre: " + t.getNombreJugador(i, j));
                System.out.println("Numero: "+ t.getNumeroUniforme(i, j));
            }
        }
    }    
}