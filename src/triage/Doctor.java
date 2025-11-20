package triage;
public class Doctor {

    private String nombreDoc;
    private String especialidad;
    private String cedula;
    private int turnoDoci;
    private int turnoDocf;

    public Doctor(String nombreDoc,String especialidad,String cedula,int turnoDoci,int turnoDocf){
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.nombreDoc = nombreDoc;
        this.turnoDoci = turnoDoci;
        this.turnoDocf = turnoDocf;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTurnoDoci() {
        return turnoDoci;
    }

    public void setTurnoDoci(int turnoDoci) {
        this.turnoDoci = turnoDoci;
    }

    public int getTurnoDocf() {
        return turnoDocf;
    }

    public void setTurnoDocf(int turnoDocf) {
        this.turnoDocf = turnoDocf;
    }

    public String imprimirDoctor(){
        return String.format("El doctor %s, con la especialidad %s y cedula %s inicia su turno de %d a %d"
                ,this.nombreDoc,this.especialidad,this.cedula,this.turnoDoci,this.turnoDocf);
    }

    public void metodoRiesgoso(){
        try{
            Integer.parseInt("texto invalido");
        } catch (Exception e){
        }
    }
}