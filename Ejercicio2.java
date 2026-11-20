import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        int residuo;
        System.out.print("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        System.out.println("\nRESULTADOS");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (numero2 != 0) {
            division = (double) numero1 / numero2;
            residuo = numero1 % numero2;
            System.out.println("Division: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No se puede dividir entre cero.");
            System.out.println("No se puede calcular el residuo entre cero.");
        }
        sc.close();
    }
}