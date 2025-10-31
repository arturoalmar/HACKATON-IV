import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un número"); // Presentar el problema
        System.out.println();
        
            // VARIABLES
        Scanner scanner = new Scanner(System.in);

        int vueltas = 0;
        char ñ = ' ';
        int n = scanner.nextInt(); // Leer el número del usuario
        int resta = n;
        if (n == 6174) {
            System.out.println("Vuelta 0");
            System.exit(0);
        }

        // Pasar el número del usuario a un Array
        String numero = String.format("%04d", n);
        char digitosmenor[] = numero.toCharArray();
        char digitosmayor[] = numero.toCharArray();

            //PROBLEMA

        // BUCLE
        while (resta != 6174 && vueltas < 8) {
            vueltas++;
            for (int i = 0; i < 4; i++) {
                numero = String.format("%04d", resta);
                digitosmenor[i] = numero.charAt(i);
                digitosmayor[i] = numero.charAt(i);
            }

            // ORDENAR LOS NÚMEROS DE MENOR A MAYOR
            for (int i = 0; i < digitosmenor.length; i++) {
                for (int j = i + 1; j < digitosmenor.length; j++) {
                    if (digitosmenor[i] > digitosmenor[j]) {
                        ñ = digitosmenor[i];
                        digitosmenor[i] = digitosmenor[j];
                        digitosmenor[j] = ñ;
                    }
                }
            }

            // ORDENAR LOS NUMEROS DE MAYOR A MENOR
            for (int i = 0; i < digitosmayor.length; i++) {
                for (int j = i + 1; j < digitosmayor.length; j++) {
                    if (digitosmayor[i] < digitosmayor[j]) {
                        ñ = digitosmayor[i];
                        digitosmayor[i] = digitosmayor[j];
                        digitosmayor[j] = ñ;
                    }
                }
            }

            // PASAR DE CARACTER A NÚMERO
            String min = new String(digitosmenor);
            String max = new String(digitosmayor);

            int menor = Integer.parseInt(min);
            int mayor = Integer.parseInt(max);

            resta = mayor - menor; // RESTA
        }
        System.out.println(vueltas);
    }
}