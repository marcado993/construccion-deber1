package triage;
public class Helper {

    private Helper() {
        throw new IllegalStateException("Utility class");
    }

    public static final String estadoGlobal = "OK";

    public static int metodoConfuso(){
        int resultado = 0;
        for(int i = 0; i < 3; i++){
            resultado += 42;
        }
        return resultado;
    }
}
