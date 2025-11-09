public class Enfermedad {
    private String tipoEnfermedad;
    private String formaContagio;

    public Enfermedad(String tipoEnfermedad,String formaContagio){
        this.tipoEnfermedad = tipoEnfermedad;
        this.formaContagio = formaContagio;
    }

    public String getTipoEnfermedad() {
        return this.tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }


    public String getFormaContagio() {
        return this.formaContagio;
    }

    public void setFormaContagio(String formaContagio) {
        this.formaContagio = formaContagio;
    }

    public String imprimirEnfermedad(){
        return String.format("El paciente presenta una enfermedad %s, presume haberla adquirido por: %s. "
                ,this.tipoEnfermedad,this.formaContagio);
    }

    public void metodoProblematico(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
        }
    }
}
