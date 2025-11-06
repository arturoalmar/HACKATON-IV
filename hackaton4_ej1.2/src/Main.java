import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] bloques = datosBloques();
        System.out.println("Los pisos minimos son, respectivamente: ");
        for(int i=0;i< bloques.length;i++){
            int pisos = conteoPisos(bloques[i]);
            System.out.println(pisos);
        }

    }
    public static int[] datosBloques(){
        Scanner sc = new Scanner(System.in);
        int bloques[] = new int[1000];
        int validnum=0;//cuenta los numeros validos
        System.out.println("Escribe numeros(max 1000) de bloques para conocer la altura minima en la que se utilizarian todos para construir una piramide(pon 0 para salir): ");
        for(int i=0;i<1000;i++){
            int num=sc.nextInt();
            if (num==0){
                break;
            } else if (num >=2000000) {
                System.out.println("Introduce un numero menor que 2.000.000");
                i--;
                continue;
            }
            bloques[validnum]=num;
            validnum++;
        }
        int bloquesFinales[]=new int[validnum];
        for(int i=0; i<validnum;i++){
            bloquesFinales[i]=bloques[i];
        }

        return bloquesFinales;
    }
    public static int conteoPisos(int bloques){
        int total=0;
        int pisos=0;
        for(int lado=1;total<bloques;lado+=2){
            total+=lado*lado;
            pisos++;
        }
        return pisos;
    }
}