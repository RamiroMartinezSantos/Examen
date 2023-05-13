import java.util.ArrayList;
import java.util.Scanner;

public class IngresarAlumno {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Alumno> alumnos;
    public IngresarAlumno(){alumnos = new ArrayList<>();}

    public void ingresarAlumno(ArrayList<Alumno> alumnos){

        System.out.println("INGRESE EL NOMBRE DEUSUARIO");
        String nombreUsuario = scanner.nextLine();


        System.out.println("INGRESE EL NOMBRE");
        String nombre = scanner.nextLine();


        System.out.println("INGRESE EL APELLIDO");
        String apellido = scanner.nextLine();

        System.out.println("INGRESE LA EDAD");
        Double edad = scanner.nextDouble();


        System.out.println("INGRESE LA DIRECCION");
        String direccion = scanner.nextLine();


        System.out.println("INGRESE EL TELEFONO");
        Double telefono = scanner.nextDouble();


        System.out.println("INGRESE EL CORREO");
        String correo = scanner.nextLine();


        System.out.println("INGRESE EL SEMESTRE");
        String semestre = scanner.nextLine();


        System.out.println("INGRESE LA MATRICULA");
        String matricula = scanner.nextLine();


        System.out.println("INGRESE LA CARRERA");
        String carrera= scanner.nextLine();


        int libros = 0;
        Double multa = 0.0;

        scanner.nextLine();
        alumnos.add(new Alumno(nombreUsuario,nombre,apellido,edad,direccion,telefono,correo,semestre,matricula,carrera,libros,multa));
    }
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
