import java.util.Scanner;
/**
 * @author Darwin Alexis Ojeda Tamayo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int suma = 0;
        System.out.print("Ingrese un numero positivo o uno negativo para terminar: ");
        numero = sc.nextInt();

        while (numero >= 0) {
            cantidad = cantidad + 1;
            suma = suma + numero;
            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
        sc.close();
    }
}