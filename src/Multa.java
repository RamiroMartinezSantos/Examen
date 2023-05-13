import java.util.ArrayList;
import java.util.Scanner;

public class Multa {
    Scanner scanner = new Scanner(System.in);
    public void mult(ArrayList<Profesor> profesors,ArrayList<Alumno> alumnos) {
        int usuario;
        System.out.println("QUE USUARIOS DESEA VER ?");
        System.out.println("[1] Profesor");
        System.out.println("[2] Alumno");
        System.out.println("[3] Regresar");
        usuario = scanner.nextInt();
        if (usuario == 1) {
            for (Profesor profesor : profesors) {
                System.out.println("NOMBRE DEL USUARIO " + profesor.nombreUsuario);
                System.out.println("\n");
            }
            System.out.println("INGRESE EL NOMBRE DE LA CUENTA QUE DESEA VER");
            String cuenta = scanner.nextLine();
            for (Profesor profesor : profesors) {
                if (profesor.nombreUsuario == cuenta) {
                    int dias = scanner.nextInt();
                    profesor.multa = (dias * 10.0);
                    break;
                }
            }
        } else if (usuario == 2) {
            for (Alumno alumno : alumnos) {
                System.out.println("NOMBRE DEL USUARIO " + alumno.nombreUsuario);
                System.out.println("\n");
            }
            System.out.println("INGRESE EL NOMBRE DE LA CUENTA QUE DESEA VER");
            String cuenta = scanner.nextLine();
            for (Alumno alumno : alumnos) {
                if (alumno.nombreUsuario == cuenta) {
                    System.out.println(" CUANTOS DIAS DE RETRASO TIENE ?");
                    int dias = scanner.nextInt();
                    alumno.multa = (dias * 10.0);
                    break;
                }
            }
        } else if (usuario == 3) {
            System.out.println("REGRESANDO AL MENU");
        } else {
            System.out.println("COMANDO NO RECONOCIDO");
        }
    }
}
