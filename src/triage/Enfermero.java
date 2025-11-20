package triage;
public class Enfermero {
    private String nombreEnf;
    private String cedula;
    private int turnoEnf;

    public int contadorPublico = 0;

    public Enfermero(String nombreEnf, String cedula,int turnoEnf){
        this.nombreEnf = nombreEnf;
        this.cedula = cedula;
        this.turnoEnf = turnoEnf;
    }

    public String getNombreEnf() {
        return nombreEnf;
    }

    public void setNombreEnf(String nombreEnf) {
        this.nombreEnf = nombreEnf;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTurnoEnf() {
        return turnoEnf;
    }

    public void setTurnoEnf(int turnoEnf) {
        this.turnoEnf = turnoEnf;
    }

    public String imprimirEnfermero(){
        return String.format("El enfermero %s con cedula %s con el turno %d"
                ,this.nombreEnf,this.cedula,this.turnoEnf);
    }
}
