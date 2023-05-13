import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Devolver {
    Scanner scanner = new Scanner(System.in);

    public void devolProf(ArrayList<Libro> libros, ArrayList<Profesor> profesors) {
        if (libros.isEmpty()) {
            System.out.println("NO EXISTEN ALIMENTOS INGRESADOS");
        } else {
            System.out.println("--MENU DE ALIMENTOS--");
            for (Libro libro : libros) {
                System.out.println("NOMBRE DEL LIBRO" + libro.nombre);
                System.out.println("CODIGO DEL LIBRO" + libro.codigo);
                System.out.println("TITULO DEL LIBRO" + libro.titulo);
                System.out.println("AUTOR DEL LIBRO" + libro.autor);
                System.out.println("EJEMPLARES DISPONIBLES" + libro.ejemplares);
                System.out.println("\n");
            }
            System.out.println("QUE LIBRO DESEA DEVOLVER?");
            String nombre = scanner.nextLine();

            for (Libro libro : libros) {
                if (Objects.equals(libro.nombre, nombre)) {
                    System.out.println("GRACIAS POR DEVOLVER EL LIBRO:" + libro.titulo);
                    libro.ejemplares ++;
                    for (Profesor profesor : profesors) {
                        profesor.libros--;
                    }
                    break;
                }else{
                    System.out.println("EL LIBRO NO FUE ENCONTRADO");
                }
            }
        }
    }
    public void devolAlum (ArrayList < Libro > libros, ArrayList < Alumno > alumnos){
        if (libros.isEmpty()) {
            System.out.println("NO EXISTEN ALIMENTOS INGRESADOS");
        } else {
            System.out.println("--MENU DE ALIMENTOS--");
            for (Libro libro : libros) {
                System.out.println("NOMBRE DEL LIBRO" + libro.nombre);
                System.out.println("CODIGO DEL LIBRO" + libro.codigo);
                System.out.println("TITULO DEL LIBRO" + libro.titulo);
                System.out.println("AUTOR DEL LIBRO" + libro.autor);
                System.out.println("EJEMPLARES DISPONIBLES" + libro.ejemplares);
                System.out.println("\n");
            }
            System.out.println("QUE LIBRO DESEA DEVOLVER?");
            String nombre = scanner.nextLine();

            for (Libro libro : libros) {
                if (Objects.equals(libro.nombre, nombre)) {
                    System.out.println("GRACIAS POR DEVOLVER EL LIBRO:" + libro.titulo);
                    libro.ejemplares ++;
                    for (Alumno alumno : alumnos) {
                        alumno.libros--;
                    }
                    break;
                }else{
                    System.out.println("EL LIBRO NO FUE ENCONTRADO");
                }
            }
        }
    }
}
