package triage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Simplified Paciente model that matches the older API used by the rest of the codebase
public class Paciente {
    private int cedula;
    private String nombre;
    private int edad;
    private int estadoPaciente; // 1-10 scale used by triage
    private String colorEstado;
    private double horaIngreso;
    private final List<String> notasInternas;

    public Paciente() {
        this(0, "", 0, 0, 0.0, "");
    }

    // Constructor compatible with AppTriage usage
    public Paciente(int cedula, String nombre, int edad, int estadoPaciente, double horaIngreso, String colorEstado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.estadoPaciente = estadoPaciente;
        this.horaIngreso = horaIngreso;
        this.colorEstado = colorEstado == null ? "" : colorEstado;
        this.notasInternas = new ArrayList<>();
    }

    // Getters and setters used by Triage and AppTriage
    public int getCedula() { return cedula; }
    public void setCedula(int cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public int getEstadoPaciente() { return estadoPaciente; }
    public void setEstadoPaciente(int estadoPaciente) { this.estadoPaciente = estadoPaciente; }

    public String getColorEstado() { return colorEstado; }
    public void setColorEstado(String colorEstado) { this.colorEstado = colorEstado; }

    public double getHoraIngreso() { return horaIngreso; }
    public void setHoraIngreso(double horaIngreso) { this.horaIngreso = horaIngreso; }

    public void agregarNotaInterna(String nota) {
        if (nota != null && !nota.trim().isEmpty()) {
            notasInternas.add(nota);
        }
    }

    public List<String> getNotasInternas() {
        return Collections.unmodifiableList(notasInternas);
    }

    // Helper used by printing calls in the project
    public String imprimirPaciente() {
        return String.format("Paciente %s con cédula %d, edad %d, horario %.2f",
                this.nombre == null ? "" : this.nombre, this.cedula, this.edad, this.horaIngreso);
    }
}

