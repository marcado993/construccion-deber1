package triage;
public class SalaEmergencias {
    private Doctor doctor;
    private Enfermero enfermero;
    private Paciente paciente;
    private Enfermedad enfermedad;

    public SalaEmergencias(Doctor doctor, Enfermero enfermero, Paciente paciente, Enfermedad enfermedad) {
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.paciente = paciente;
        this.enfermedad = enfermedad;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enfermero getEnfermero() {
        return this.enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        }

    public Enfermedad getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Doctor obtenerDoctor(){
        return this.doctor;
    }
}
