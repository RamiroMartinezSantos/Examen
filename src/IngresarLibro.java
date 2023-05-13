import java.util.ArrayList;
import java.util.Scanner;

public class IngresarLibro {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Libro> libros;
    public IngresarLibro(){libros = new ArrayList<>();}
    public void ingresar(ArrayList<Libro> libros){

        System.out.println("INGRESE EL NOMBRE DEL LIBRO");
        String nombre = scanner.nextLine();


        System.out.println("INGRESE EL CODIGO DEL LIBRO");
        String codigo = scanner.nextLine();


        System.out.println("INGRESE EL TITULO DEL LIBRO");
        String titulo = scanner.nextLine();


        System.out.println("INGRESE EL AUTOR DEL LIBRO");
        String autor = scanner.nextLine();


        System.out.println("INGRESE EL NUMERO DE EJEMPLARES DISPONIBLES");
        int ejemplares = scanner.nextInt();



        scanner.nextLine();
        libros.add(new Libro(nombre,codigo,titulo,autor,ejemplares));
    }
    public ArrayList<Libro> getLibros() {
        return libros;
    }
}