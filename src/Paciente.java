import java.util.ArrayList;

public class Paciente {

    private int estadoPaciente;
    private int cedula;
    private String nombre;
    private int edad;
    private  double horaIngreso;
    private String colorEstado;

    private ArrayList<String> notasInternas = new ArrayList<>();

    public Paciente(int cedula, String nombre, int edad, int estadoPaciente,double horaIngreso, String colorEstado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estadoPaciente = estadoPaciente;
        this.edad = edad;
        this.horaIngreso = horaIngreso;
        this.colorEstado = colorEstado;
    }

    public int getEstadoPaciente() {
        return this.estadoPaciente;
    }

    public void setEstadoPaciente(int estadoPaciente) {
        if ( estadoPaciente <= 10 && estadoPaciente >= 6 ){
            System.out.println("Estado del paciente critico.");
            this.estadoPaciente = estadoPaciente;
        }else if(estadoPaciente < 6 && estadoPaciente >= 0){
            System.out.println("Estado paciente leve.");
            this.estadoPaciente = estadoPaciente;
        } else if (estadoPaciente > 10 || estadoPaciente < 0) {
            System.out.println("Dato ingresado no valido");
            this.estadoPaciente = 0;
        }
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        if(cedula > 0) {
            this.cedula = cedula;
        }else{
            System.out.println("Cedula incorrecta");
            this.cedula = 0;
        }
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

        public void setEdad(int edad) {
            if(edad > 0 && edad < 120) {
                this.edad = edad;
            }else {
                this.edad = 0;
                System.out.println("Edad incorrecta");
            }
        }

    public double getHoraIngreso() {
        return this.horaIngreso;
    }

    public String getColorEstado() {
        return this.colorEstado;
    }

    public void setColorEstado(String colorEstado) {
        this.colorEstado = colorEstado;
    }

    public void setHoraIngreso(double horaIngreso) {
        if (horaIngreso >= 24.00 || horaIngreso < 0.0){
            System.out.println("Hora incorrecta.");
            this.horaIngreso = 0;
        } else {
            this.horaIngreso = horaIngreso;
        }
    }


    public String imprimirPaciente() {
        return String.format(" Paciente %s con cedula %d, tiene %d años, llego al hospital con heridas de gravedad clase %d " +
                        "a las %.2f horas"
                , this.nombre, this.cedula, this.edad, this.estadoPaciente, this.horaIngreso);
    }
}
