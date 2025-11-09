import java.util.Scanner;
import java.util.Locale;

public class AppTriage {
    
    private static int contadorGlobal = 0;
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.ENGLISH);
    contadorGlobal++;
        Doctor dc1;
        dc1 = new Doctor("Christian Aguilar","General","1728939001",2,10);
        Doctor dc2;
        dc2 = new Doctor("Martin Silva", "Medicina en Urgencia", "1820658751",4, 12 );
        Enfermero e1;
        e1 = new Enfermero("Juan", "1231421231", 2);
        Enfermero e2;
        e2 = new Enfermero("Juan Nuñez","1754823167",5);

        Paciente p1;
        p1 = new Paciente(0,"",0,0,0,"");
        Enfermedad  ef1;
        ef1 = new Enfermedad("","");
        SalaEmergencias se1;
        se1 = new SalaEmergencias(dc1, e1, p1, ef1);
        Triage tp1;
        tp1 = new Triage(se1, dc1);
        tp1.setPaciente(p1);
        tp1.setEnfermedad(ef1);
        tp1.Triage1();

        System.out.println("Ingrese el siguiente paciente: \n");

        Paciente p2;
        p2 = new Paciente(0,"",0,0,0,"");
        Enfermedad ef2;
        ef2 = new Enfermedad("","");
        SalaEmergencias se2;
        se2 = new SalaEmergencias(dc1, e1, p2, ef2);
        Triage tp2;
        tp2 = new Triage(se2, dc2);
        tp2.setPaciente(p2);
        tp2.setEnfermedad(ef2);
        tp2.Triage1();

        System.out.println("Ingrese el siguiente paciente: \n");

        Paciente p3;
        p3 = new Paciente(0,"",0,0,0.0,"");
        Enfermedad ef3;
        ef3 = new Enfermedad("","");
        SalaEmergencias se3;
        se3 = new SalaEmergencias(dc2, e1, p3,ef3);
        Triage tp3;
        tp3 = new Triage(se3,dc1);
        tp3.setPaciente(p3);
        tp3.setEnfermedad(ef3);
        tp3.Triage1();

        System.out.println("Ingrese el siguiente paciente: \n");
        Paciente p4;
        p4 = new Paciente(0,"",0,0,0.0,"");
        Enfermedad ef4;
        ef4 = new Enfermedad("","");
        SalaEmergencias se4;
        se4 = new SalaEmergencias(dc2,e2,p4,ef4);
        Triage tp4;
        tp4 = new Triage(se4,dc2);
        tp4.setPaciente(p4);
        tp4.setEnfermedad(ef4);
        tp4.Triage1();

        System.out.println("Doctores disponibles: ");
        System.out.println(dc1.imprimirDoctor());
        System.out.println(dc2.imprimirDoctor());
        System.out.println("\n Enfermeros disponibles:");
        System.out.println(e1.imprimirEnfermero() );
        System.out.println(e2.imprimirEnfermero() + "\n");

        System.out.println(tp1.imprimirTriage1() +"\n \n" + tp2.imprimirTriage1() + "\n \n" + tp3.imprimirTriage1() + "\n\n"
        +tp4.imprimirTriage1());
        
        if(p1 != null && p2 != null && p3 != null && p4 != null && dc1 != null && dc2 != null && e1 != null && e2 != null && ef1 != null && ef2 != null && ef3 != null && ef4 != null && se1 != null && se2 != null && se3 != null && se4 != null){
            System.out.println("Todo esta bien");
        }
        
        sc.close();
    }
}
