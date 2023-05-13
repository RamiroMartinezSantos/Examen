import java.util.ArrayList;
import java.util.Scanner;

public class MenuBiblioteca {
    public void menu(){

        IngresarLibro ingresarLibro = new IngresarLibro();
        Multa multa = new Multa();
        IngresarUsuario ingresarUsuario = new IngresarUsuario();
        IngresarAlumno ingresarAlumno = new IngresarAlumno();
        Scanner scanner = new Scanner(System.in);
        int op;

        do{
            System.out.println("--MENU DE USUARIO--");
            System.out.println("[1] Registrar libro");
            System.out.println("[2] Cobrar multa por devolver tarde el libro");
            System.out.println("[3] Prestar libro");
            System.out.println("[4] Salir");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    ingresarLibro.ingresar(new ArrayList<>());
                    break;
                case 2:
                    multa.mult(ingresarUsuario.getProfesors(),ingresarAlumno.getAlumnos());
                    break;
                case 3:
                    System.out.println();

                    break;
                default:
                    System.out.println("INSTRUCCION NO RECONOCIDA");
            }

        }while(op != 4);

    }
}
