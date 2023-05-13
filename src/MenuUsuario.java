import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        IngresarUsuario ingresarUsuario = new IngresarUsuario();
        IngresarAlumno ingresarAlumno = new IngresarAlumno();
        HacerPrestamo hacerPrestamo = new HacerPrestamo();
        IngresarLibro ingresarLibro = new IngresarLibro();
        Devolver devolver = new Devolver();

        int op;
        do{
            System.out.println("--MENU DE USUARIO--");
            System.out.println("[1] Solicitar prestamo de libro");
            System.out.println("[2] Devolver libro");
            System.out.println("[3] Pagar multa por eceder el tiempo de entrega");
            System.out.println("[4] Salir");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1 -> {
                    int usuario;
                    System.out.println("PARA PEDIR UN LIBRO ES NECESARIO QUE TENGAS UN USUARIO");
                    System.out.println("TIENES UN USUARIO?");
                    System.out.println(" [1] SI");
                    System.out.println(" [2] NO");
                    int usu = scanner.nextInt();
                    if (usu == 1) {
                        System.out.println("QUE USUARIO ES?");
                        System.out.println("[1] Profesor");
                        System.out.println("[2] Alumno");
                        System.out.println("[3] Regresar");
                        usuario = scanner.nextInt();
                        if (usuario == 1) {
                            hacerPrestamo.PrestamoProfesor(ingresarLibro.getLibros(), ingresarUsuario.getProfesors());
                        } else if (usuario == 2) {
                            hacerPrestamo.PrestamoAlumnos(ingresarLibro.getLibros(), ingresarAlumno.getAlumnos());
                        } else if (usuario == 3) {
                            System.out.println("REGRESANDO AL MENU DE USUARIOS");
                        } else {
                            System.out.println("COMANDO NO RECONOCIDO");
                        }
                    } else if (usu == 2) {
                        System.out.println("QUE USUARIO LE GUSTARIA SER?");
                        System.out.println("[1] Profesor");
                        System.out.println("[2] Alumno");
                        System.out.println("[3] Regresar");
                        usuario = scanner.nextInt();
                        if (usuario == 1) {
                            ingresarUsuario.ingresarProfesor(new ArrayList<>());
                        } else if (usuario == 2) {
                            ingresarAlumno.ingresarAlumno(new ArrayList<>());
                        } else if (usuario == 3) {
                            System.out.println("REGRESANDO AL MENU DE USUARIOS");
                        } else {
                            System.out.println("COMANDO NO RECONOCIDO");
                        }
                    }
                }
                case 2 -> {
                    int usuario2;
                    System.out.println("QUE USUARIO ES?");
                    System.out.println("[1] Profesor");
                    System.out.println("[2] Alumno");
                    System.out.println("[3] Regresar");
                    usuario2 = scanner.nextInt();
                    if (usuario2 == 1) {
                        devolver.devolProf(ingresarLibro.getLibros(), ingresarUsuario.getProfesors());
                    } else if (usuario2 == 2) {
                        devolver.devolAlum(ingresarLibro.getLibros(), ingresarAlumno.getAlumnos());
                    } else if (usuario2 == 3) {
                        System.out.println("REGRESANDO AL MENU DE USUARIOS");
                    } else {
                        System.out.println("COMANDO NO RECONOCIDO");
                    }
                }
                default -> {
                }
            }

        }while(op != 4);

    }
}
