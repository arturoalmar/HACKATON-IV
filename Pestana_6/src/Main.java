import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder cadena = new StringBuilder();
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingresa un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                suma += numero;
                cadena.append(numero).append(" + "); // agrega "número + "
            }

        } while (numero != 0);

        // Quitar el último " + " si la cadena no está vacía
        if (cadena.length() > 0) {
            cadena.delete(cadena.length() - 3, cadena.length());
        }

        System.out.println("Tu suma: " + cadena + " = " + suma);
    }
}
