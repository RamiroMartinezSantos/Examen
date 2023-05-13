import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class HacerPrestamo {
    Scanner scanner = new Scanner(System.in);
    public void PrestamoProfesor(ArrayList<Libro> libros,ArrayList<Profesor> profesors){

        if(libros.isEmpty()){
            System.out.println("NO EXISTEN ALIMENTOS INGRESADOS");
        } else {

            System.out.println("--LISTA DE LIBROS--");
            for (Libro libro : libros) {
                System.out.println("NOMBRE DEL LIBRO" + libro.nombre);
                System.out.println("CODIGO DEL LIBRO" + libro.codigo);
                System.out.println("TITULO DEL LIBRO" + libro.titulo);
                System.out.println("AUTOR DEL LIBRO" + libro.autor);
                System.out.println("EJEMPLARES DISPONIBLES" + libro.ejemplares);
                System.out.println("\n");
            }

            String usuario;
            System.out.println("INGRESA TU NOMBRE DE USUARIO");
            usuario = scanner.nextLine();

            for (Profesor profesor : profesors){
                if(profesor.nombreUsuario == usuario){
                    System.out.println("--INGRESE EL LIBRO QUE DESEA PEDIR PRESTADO--");
                    String nombre = scanner.nextLine();
                    for (Libro libro : libros) {
                        if(libro.ejemplares == 0 ){
                            System.out.println("EL LIBRO NO ESTA DISPONIBLE");
                            break;
                        }else {
                            if (Objects.equals(libro.nombre, nombre)) {
                                libro.ejemplares --;
                                profesor.libros++;
                                break;
                            }
                        }
                    }
                    System.out.println("DISFRUTA DE TU LIBRO");
                }else{
                    System.out.println("EL USUARIO QUE INGRESASTE ES INCORRECTO");
                    break;
                }
            }
        }
    }
    public void PrestamoAlumnos(ArrayList<Libro> libros,ArrayList<Alumno> alumnos){

        if(libros.isEmpty()){
            System.out.println("NO EXISTEN ALIMENTOS INGRESADOS");
        } else {
            System.out.println("--LISTA DE LIBROS--");
            for (Libro libro : libros) {
                System.out.println("NOMBRE DEL LIBRO" + libro.nombre);
                System.out.println("CODIGO DEL LIBRO" + libro.codigo);
                System.out.println("TITULO DEL LIBRO" + libro.titulo);
                System.out.println("AUTOR DEL LIBRO" + libro.autor);
                System.out.println("EJEMPLARES DISPONIBLES" + libro.ejemplares);
                System.out.println("\n");
            }

            String usuario;
            System.out.println("INGRESA TU NOMBRE DE USUARIO");
            usuario = scanner.nextLine();

            for (Alumno alumno : alumnos){
                if(alumno.nombreUsuario == usuario) {
                    System.out.println("--INGRESE EL LIBRO QUE DESEA PEDIR PRESTADO--");
                    String nombre = scanner.nextLine();

                    for (Libro libro : libros) {
                        if(libro.ejemplares == 0 ){
                            System.out.println("EL LIBRO NO ESTA DISPONIBLE");
                            break;
                        }else {
                            if (Objects.equals(libro.nombre, nombre)) {
                                libro.ejemplares --;
                                alumno.libros++;
                                break;
                            }
                        }
                    }
                    System.out.println("DISFRUTA DE TU LIBRO");
                }else{
                System.out.println("EL USUARIO QUE INGRESASTE ES INCORRECTO");
                break;
                }
            }
        }
    }
}
