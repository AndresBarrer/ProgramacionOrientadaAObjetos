import Robots.MiniRobotCenas;
import Robots.MiniRobotComidas;
import Robots.MiniRobotCuchillos;
import Robots.MiniRobotDesayunos;
import Robots.MiniRobotServido;
import Robots.Robot;

public class Cocina{

    public Robot[] Bots = new Robot[6];
    public String[] listaDeAcciones;
    public int accionActual, accionCorrecta, comidaActual, botActual;
    public int[] acciones;
    public boolean salida;
    
    public Cocina(){

        //crera 6 robots
        Bots[0] = new MiniRobotCuchillos();
        Bots[1] = new MiniRobotDesayunos();
        Bots[2] = new MiniRobotComidas();
        Bots[3] = new MiniRobotCenas();
        Bots[4] = new MiniRobotServido();
        Bots[5] = new MagnumOpus();

        setAccionCorrecta(1);
        setAccionActual(0);
        setComidaActual(0);
        
        botActual = 0;
        salida = true;
        acciones = new int[3]; //3 posibles acciones

        //crear lista para poder desplegar acciones
        listaDeAcciones = new String[3];
        listaDeAcciones[0] = "Corto ingredientes";
        listaDeAcciones[1] = "Cocino comida";
        listaDeAcciones[2] = "Sirvio comida";
    }

    public void Cocinando(){

        //imprimir el menu 
        comidaActual = desplegarMenu();

        //imprimir informacion actual sobre los bots
        infoBots();
        

        System.out.println("Empezaremos a cocinar. \nRecordar que el orden de pasos es importante!\n");
        System.out.println("1)Cortar los ingredientes");
        System.out.println("2)Cocinar la comida");
        System.out.println("3)Servir la comida");
        
        do{
            accionActual = CapturaDeEntradas.capturarEntero("Selecciona el paso");
            botActual = CapturaDeEntradas.capturarEntero("Selecciona el robot que quieres que realice la tarea");
            acciones[accionCorrecta-1] = Bots[botActual].accion(listaDeAcciones[accionActual-1]);
            
            Bots[botActual].restarBateria();
            
            if (accionCorrecta == 2){

                switch (botActual){ 
                    
                    case 1 -> salida = revisarComida(1);
                    case 2 -> salida = revisarComida(2);
                    case 3 -> salida = revisarComida(3);
                    case 5 -> salida = true; 
                    default -> salida = false; //LOS OTROS BOTS NO TIENEN LA CAPACIDAD DE COCINAR
                }

                if(!salida){
                    System.out.println("El robot que seleccionaste no pudo cocinar lo que pediste.");
                }
            }
            if(botActual!=5){

                if(!revisarAccion()){
                    salida = false;
                    System.out.println("El robot que seleccionaste no pudo cocinar lo que pediste.");
                }
                if(!revisarOrden()){
                    salida = false;
                    System.out.println("Realizaste alguna accion en el orden incorrecto");
                    }
            }

        accionCorrecta++;

        }while(salida && accionCorrecta<=3);
        
        if(salida){
            System.out.println("¡Hurra! El plato estaba delicioso");
        }
    }


    //getters y setters
    private void setAccionCorrecta(int accionCorrecta){
        this.accionCorrecta = accionCorrecta;
    }
    
    private void setAccionActual(int accionActual){
        this.accionActual = accionActual;
    }

    private void setComidaActual(int comidaActual){
        this.comidaActual = comidaActual;
    }

    public boolean revisarAccion(){
        return accionCorrecta == acciones[accionCorrecta-1];
    }

    public boolean revisarOrden(){
        return accionActual == accionCorrecta;
    }

    public boolean revisarComida(int revision){
        return revision == comidaActual;
    }

    public int desplegarMenu(){
        System.out.println("Bienvenido!");
        System.out.println("Lista de opciones:");
        System.out.println("1)Desayuno\n2)Comida\n3)Cena\n");
        return CapturaDeEntradas.capturarEntero("Selecciona una opcion");
    }

    public void infoBots(){
        System.out.println("\nEstos son los Bots disponibles por el momento");

        for(int i=0; i<6; i++){
            Bots[i].imprimeBot();
        }
    }
    
    
}
   