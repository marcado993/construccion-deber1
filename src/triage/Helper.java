package triage;
public class Helper {

    private Helper() {
        // Prevent instantiation
    }

    // Constant names should be in upper case with underscores per conventions
    public static final String ESTADO_GLOBAL = "OK";

    public static int metodoConfuso(){
        int resultado = 0;
        for(int i = 0; i < 3; i++){
            resultado += 42;
        }
        return resultado;
    }
}
