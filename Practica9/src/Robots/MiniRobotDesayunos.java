package Robots;
public class MiniRobotDesayunos extends Robot implements MiniRobots {
    
    public MiniRobotDesayunos(){
        super(100, "Robot para los desayunos", 1);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setUltimaAccion(accionRealizada);
        //Accion que el robot tiene que hacer
        return 2; 
    }

    @Override
    public int especialidad(){
        //1 para desayunos
        return 1;
    }
}