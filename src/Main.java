import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        MenuUsuario menuUsuario = new MenuUsuario();
        MenuBiblioteca menuBiblioteca = new MenuBiblioteca();
        int op = 0;
        while(op != 3){
            System.out.println("A QUE MENU DESEA INGRESAR?...");
            System.out.println("[1] Menu de Usuarios");
            System.out.println("[2] Menu de Biblioteca");
            System.out.println("[3] Salir");
            op = scanner.nextInt();
            if(op == 1){
                menuUsuario.menu();
            } else if (op == 2) {
                menuBiblioteca.menu();
            } else if (op == 3) {
                System.out.println("SALIENDO");
            }else{
                System.out.println("OPCION NO RECONOCIDA");
            }
        }

    }
}
