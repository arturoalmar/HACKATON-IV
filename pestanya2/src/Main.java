import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] valores = {1000000, 100000, 10000, 1000, 100, 10, 1};
        char[] simbolos = {'H', 'R', 'D', 'F', 'C', 'G', 'T'};
        System.out.print("Escribe un numero para pasarlo a Chupadesiertos: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int numero = sc.nextInt();
            if (numero == 0) break;
            StringBuilder salida = new StringBuilder();
            for (int i = 0; i < valores.length; i++) {
                int cantidad = numero / valores[i];

                for (int j = 0; j < cantidad; j++) {
                    salida.append(simbolos[i]);
                }
                numero = numero % valores[i];
            }
            System.out.println(salida.toString());
        }
    }
}