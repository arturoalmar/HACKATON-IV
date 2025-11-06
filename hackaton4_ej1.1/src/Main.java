import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de pruebas a realizar: ");
        Scanner sc=new Scanner(System.in);
        int numero_pruebas=sc.nextInt();
        int A;
        int B;
        int C;
        int[] soluciones= new int[numero_pruebas];
        for(int i=0; i<numero_pruebas;){
            do{
                System.out.println("Introduce 3 numeros(A,B,C) de forma que -10.000<=A<B<C<=10.000 sin incluir el 0: ");
                A= sc.nextInt();
                B= sc.nextInt();
                C= sc.nextInt();
            }while (!(-10000<=A && A<B && B<C && C<= 10000 && A!=0 && B!=0 && C !=0));
            System.out.println("Los numeros son correctos");
            int distanciaAB = Math.abs(A-B);
            int distanciaBC = Math.abs(B-C);
            if(A<0&&B>0){
                distanciaAB--;
            }
            if(B<0&&C>0){
                distanciaBC--;
            }
            if(distanciaAB<distanciaBC){
                soluciones[i]=A;
            } else if (distanciaAB>distanciaBC) {
                soluciones[i]=C;
            } else if (distanciaAB==distanciaBC) {
                soluciones[i]=0;
            }
            i++;

        }
        System.out.println("Los numeros mas cercanos al numero B son: ");
        for(int i=0; i<numero_pruebas;i++){
            if(soluciones[i]==0){
                System.out.println("EMPATE");
            }else{
                System.out.println(soluciones[i]);
            }
        }
    }
}