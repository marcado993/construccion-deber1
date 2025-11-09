public class Helper {

    public static String estadoGlobal = "OK";

    public static int metodoConfuso(int parametroNoUsado){
        int resultado = 0;
        for(int i = 0; i < 3; i++){
            resultado += 42;
        }
        return resultado;
    }
}
