package Robots;
public class MiniRobotServir extends Robot{
    public MiniRobotServir(){
        super(100, "Robot para servir platos", 4);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setUltimaAccion(accionRealizada);
        //Accion que el robot tiene que hacer
        return 3;
    }
}
   