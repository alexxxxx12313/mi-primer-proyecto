import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double mayor;
        double menor;
        System.out.print("Ingrese el numero 1: ");
        numero = sc.nextDouble();
        mayor = numero;
        menor = numero;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextDouble();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        sc.close();
    }
}