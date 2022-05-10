import Robots.Robot;

public class MagnumOpus extends Robot{
    public MagnumOpus(){
        //The super keyword refers to superclass (parent) objects.
        //It is used to call superclass methods, and to access the superclass constructor.
        super(100, "Magnum Opus", 5);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-25);
    }

    @Override
    public int accion(String accionRealizada){
        setUltimaAccion(accionRealizada);
        
        //codigo especial
        return 1000; 
    }
}