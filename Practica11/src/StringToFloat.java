public class StringToFloat {
    //metodo para convertir de String a Float
    public static float convertirStringToFloat(String string){
        //try catch por si el numero no es posible convertir a float
        try{
            //convertir string a float y regresarlo
            float number = Float.parseFloat(string);
            return number;
        }
        //si no es posible convertir, regresar el stacktrace del error
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        return 0;
    }
}
