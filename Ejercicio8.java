import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;
        System.out.print("Ingrese la contrasena: ");
        contrasena = sc.nextLine();
        while (!contrasena.equals("java2026")) {
            System.out.print("Contrasena incorrecta. Intente nuevamente: ");
            contrasena = sc.nextLine();
        }
        System.out.println("Acceso concedido.");
        sc.close();
    }
}