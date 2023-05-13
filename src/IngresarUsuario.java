import java.util.ArrayList;
import java.util.Scanner;

public class IngresarUsuario {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Profesor> profesors;
    public IngresarUsuario(){profesors = new ArrayList<>();}
    public void ingresarProfesor(ArrayList<Profesor> profesors){

        System.out.println("INGRESE EL NOMBRE DE USUARIO");
        String nombreUsuario = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE EL NOMBRE");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO");
        String apellido = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE LA EDAD");
        Double edad = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("INGRESE LA DIRECCION");
        String direccion = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE EL TELEFONO");
        Double telefono = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("INGRESE EL CORREO");
        String correo = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE EL INSTITUTO");
        String instituto = scanner.nextLine();
        scanner.nextLine();

        System.out.println("INGRESE EL AREA DE ADSCRIPCION");
        String area_de_adscripcion = scanner.nextLine();
        scanner.nextLine();

        int libros = 0;
        Double multa = 0.0;


        scanner.nextLine();
        profesors.add(new Profesor(nombreUsuario,nombre,apellido,edad,direccion,telefono,correo,area_de_adscripcion,instituto,libros,multa));
    }
    public ArrayList<Profesor> getProfesors() {
        return profesors;
    }
}
