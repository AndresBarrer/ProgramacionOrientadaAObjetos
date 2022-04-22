public class Main {
    public static void main(String[] args){

        //1 torneo, 5 equipos y 10 jugadores en cada equipo
        torneo = Torneo("American Athletic Tournament", "National");

        //nombre, division, entrenador
        Equipo1 = Equipo("Atlanta Hawks", 1, "Nate McMillan");
        Equipo2 = Equipo("Boston Celtics", 1, "Ime Udoka"); 
        Equipo3 = Equipo("Brooklyn Nets", 1, "Steve Nash");
        Equipo4 = Equipo("LA Clippers", 1, "Tyronn Lue");

        //numeroUniforme, nombre, estatura
        Jugador1 = Jugador(1, "Jeremy Lin", 2.29);
        Jugador2 = Jugador(2, "Shawn Bradley", 2.22);
        Jugador3 = Jugador(3, "Yao Ming", 2.23);
        Jugador4 = Jugador(4, "Chuck Nevitt", 2.25);
        Jugador5 = Jugador(5, "Pavel Podkolzin", 2.21);
        Jugador6 = Jugador(6, "Sim Bhullar", 2.19);
        Jugador7 = Jugador(7, "Mark Easton", 2.16);
        Jugador8 = Jugador(8, "Rik Smits", 2.22);
        Jugador9 = Jugador(9, "Ralph Sampson", 2.23);
        Jugador10 = Jugador(10, "Priest Lauderdale", 2.24);

        Jugador1.puntosAnotados = 2;
        Jugador2.puntosAnotados = 3;
        Jugador3.puntosAnotados = 10;
        Jugador4.puntosAnotados = 3;
        Jugador5.puntosAnotados = 5;
        Jugador6.puntosAnotados = 8;
        Jugador7.puntosAnotados = 9;
        Jugador8.puntosAnotados = 11;
        Jugador9.puntosAnotados = 2;
        Jugador10.puntosAnotados = 5;

        Equipo1.agregarJugador(Jugador1);
        Equipo2.agregarJugador(Jugador2);
        Equipo3.agregarJugador(Jugador3);
        Equipo4.agregarJugador(Jugador4);
        Equipo5.agregarJugador(Jugador5);
        Equipo6.agregarJugador(Jugador6);
        Equipo7.agregarJugador(Jugador7);
        Equipo8.agregarJugador(Jugador8);
        Equipo9.agregarJugador(Jugador9);
        Equipo10.agregarJugador(Jugador10);

        torneo.agregarEquipo(Equipo1);
        torneo.agregarEquipo(Equipo2);
        torneo.agregarEquipo(Equipo3);
        torneo.agregarEquipo(Equipo4);



        //make bank of names, 
    }
}
