public class Main {
    public static void main(String[] args){
        
        Torneo t = new Torneo();


        for(int i=0; i<5; i++){
            System.out.println("----Datos de Equipo #%d----",i+1);
            System.out.printf("Nombre: %s\n",);
            System.out.printf("Division: %i\n",);
        }

        System.out.println("----Datos de Jugadores----");
        for(int i=0; i<40; i++){
            //make an array to hold randomly generated players
        }
        

        
        System.out.println("----Datos del torneo----");
        System.out.printf("Nombre: %s\n", t.getNombre());
        System.out.printf("Region: %s\n", t.getRegion());
        System.out.printf("Num de Equipos Participantes: %d\n", t.getNumeroDeEquipos());
        System.out.printf("Num de Partidos Jugados: %d\n", t.getPartidosJugados());
        System.out.printf("Num de Partidos Pendientes: %d\n", t.getPartidosPendientes());
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");


    }
}
