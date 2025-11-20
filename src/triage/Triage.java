package triage;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Triage {
    private Paciente paciente;
    private SalaEmergencias salaEmergencias;
    private Enfermedad enfermedad;
    private  Doctor doctor;
    Scanner sc = new Scanner(System.in);
    public Triage(SalaEmergencias salaEmergencias, Doctor doctor){
        this.paciente = null;
        this.enfermedad = null;
        this.salaEmergencias = salaEmergencias;
        this.doctor = doctor;
   }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public SalaEmergencias getSalaEmergencias() {
        return salaEmergencias;
    }

    public void setSalaEmergencias(SalaEmergencias salaEmergencias) {
        this.salaEmergencias = salaEmergencias;
    }

    public Enfermedad getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void Triage1(){
    sc.useLocale(Locale.ENGLISH);


        do {
            this.paciente.getNombre();
            System.out.println("Ingrese el nombre del paciente: ");
            String nombre = sc.nextLine();
            try {
                Integer.parseInt(nombre);
                System.out.println("Se ingreso un numero en lugar de un nombre. ");
            }catch (NumberFormatException e){
                this.paciente.setNombre(nombre);
            }
        }while (this.paciente.getNombre().isEmpty());

        do {
            System.out.println("Ingrese la cédula del paciente: ");
            try {
                int cedula = sc.nextInt();
                sc.nextLine();
                this.paciente.setCedula(cedula);
            } catch (InputMismatchException e) {
                System.out.println("Se ingresó una letra en lugar de una cédula o numero invalido.");
                sc.nextLine();
            }
        } while (this.paciente.getCedula() == 0);

        do {
            System.out.println("Ingrese la edad del paciente:");
            try {
                int edad = sc.nextInt();
                sc.nextLine();
                paciente.setEdad(edad);
            } catch (InputMismatchException e) {
                System.out.println("Se ingresó una letra en lugar de una cédula.");
                sc.nextLine();
            }
        } while (this.paciente.getEdad()==0);


      do {
          this.paciente.getEstadoPaciente();
           System.out.println("Ingrese en una escala del 1 al 10 el estado del paciente: ");
           try{
               int estado = sc.nextInt();
               this.paciente.setEstadoPaciente(estado);
           } catch (InputMismatchException e){
               System.out.println("ERROR. Se ingreso una letra. ");
               sc.nextLine();
           }
       } while(this.paciente.getEstadoPaciente() == 0);

       do {
           this.paciente.getHoraIngreso();
          System.out.println("Ingrese la hora de llegada del paciente en enteros (Formato 24h): ");
          try {
              double hora = sc.nextDouble();
              sc.nextLine();
              this.paciente.setHoraIngreso(hora);
          } catch (InputMismatchException e) {
              System.out.println("Se ingresó una letra en lugar de una hora.");
              sc.nextLine();
          }
      }while (this.paciente.getHoraIngreso() == 0);

      do {
          this.enfermedad.getTipoEnfermedad();
          System.out.println("Ingrese el tipo de enfermedad/problema del paciente: ");
          String tipoEnfermedad = sc.nextLine();
          try {
              Integer.parseInt(tipoEnfermedad);
              System.out.println("ERROR. No se puede ingresar numeros. ");
          }catch (NumberFormatException e){
              this.enfermedad.setTipoEnfermedad(tipoEnfermedad);
          }
      }while (this.enfermedad.getTipoEnfermedad().isEmpty());

      do {
          this.enfermedad.getFormaContagio();
          System.out.println("Ingrese como se infecto/adquirio la enfermedad/problema:");
          String formaContagio = sc.nextLine();
          try {
              Integer.parseInt(formaContagio);
              System.out.println("ERROR. No se puede ingresar numeros. ");
          }catch (NumberFormatException e){
              this.enfermedad.setFormaContagio(formaContagio);
          }
      }while (this.enfermedad.getFormaContagio().isEmpty());

        if (this.paciente.getEstadoPaciente() > 0 && this.paciente.getEstadoPaciente()< 2){
            this.getPaciente().getColorEstado();
            System.out.println("Paciente Color AZUL \nSin Urgencia. \n");
            String estado = "AZUL";
            this.paciente.setColorEstado(estado);
        } else if (this.paciente.getEstadoPaciente() >=2 && this.paciente.getEstadoPaciente() < 4) {
            System.out.println("Paciente Color VERDE \nPude esperar 2 horas. \n");
            String estado = "VERDE";
            this.paciente.setColorEstado(estado);
        } else if (this.paciente.getEstadoPaciente() >= 4 && this.paciente.getEstadoPaciente() < 6) {
            System.out.println("Paciente Color AMARILLO \nPuede esperar maximo una hora. \n");
            String estado = "AMARILLO";
            this.paciente.setColorEstado(estado);
        } else if (this.paciente.getEstadoPaciente() >= 6 && this.paciente.getEstadoPaciente() < 8) {
            System.out.println("Paciente Color NARANJA \nAtender en 10 mins maximo 15 mins. \n");
            String estado = "NARANJA";
            this.paciente.setColorEstado(estado);
        }else  if (this.paciente.getEstadoPaciente() >= 8 && this.paciente.getEstadoPaciente() <= 10){
            System.out.println("Paciente Color ROJO \nAtender inmediatamente. \n ");
            String estado = "ROJO";
            this.paciente.setColorEstado(estado);
        }
    }
    public String imprimirTriage1(){
        return String.format("Se asignado: %s, Al %s, %s. Urgencia del paciente : %s",this.doctor.imprimirDoctor(),
                this.paciente.imprimirPaciente(), this.enfermedad.imprimirEnfermedad(), this.paciente.getColorEstado());
    }

    public void metodoLargoYConfuso(){
        if(this.paciente != null){
            String nombre = this.paciente.getNombre();
            int edad = this.paciente.getEdad();
            int cedula = this.paciente.getCedula();
            double hora = this.paciente.getHoraIngreso();
            int estado = this.paciente.getEstadoPaciente();
            String color = this.paciente.getColorEstado();
            System.out.println(nombre);
            System.out.println(edad);
            System.out.println(cedula);
            System.out.println(hora);
            System.out.println(estado);
            System.out.println(color);
        }
    }
}
