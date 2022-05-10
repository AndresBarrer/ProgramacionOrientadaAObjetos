package Robots;

public class MiniRobotCenas extends Robot implements MiniRobots{

    public MiniRobotCenas(){
        super(100, "Robot para cenas", 3);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setUltimaAccion(accionRealizada);
        //La accion que el robot tiene que hacer
        return 2;
    }
    
    @Override
    public int especialidad(){    
        //3 para cenas
        return 3;
    }
}
   