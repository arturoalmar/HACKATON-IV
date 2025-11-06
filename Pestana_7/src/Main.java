import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que verbo quieres conjugar?");
        String verbo = sc.nextLine();
        String terminacion = verbo.substring(verbo.length() - 2);
        StringBuilder cadena = new StringBuilder();
        cadena = new StringBuilder(verbo);


        if (terminacion.equals("ar")) {
            System.out.println("¿En que tiempo verbal lo quieres?");
            System.out.println("A para el Presente, P para el Preterito Perfecto Simple y F para el Futuro.");
            String FV = sc.nextLine();
            String terminacionFV = FV.substring(FV.length() - 1);
            if (terminacionFV.equals("A")) {
                System.out.println("Verbo de primera conjugación (-ar) en presente");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "o");
                System.out.println("Tú " + cadena + "as");
                System.out.println("Él " + cadena + "a");
                System.out.println("Nosotros " + cadena + "amos");
                System.out.println("Vosotros " + cadena + "aís");
                System.out.println("Ellos " + cadena + "an");
            } else if (terminacionFV.equals("P")) {
                System.out.println("Verbo de primera conjugación (-ar) en pasado");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "é");
                System.out.println("Tú " + cadena + "aste");
                System.out.println("Él " + cadena + "ó");
                System.out.println("Nosotros " + cadena + "amos");
                System.out.println("Vosotros " + cadena + "ásteis");
                System.out.println("Ellos " + cadena + "aron");
            } else if (terminacionFV.equals("F")) {
                System.out.println("Verbo de primera conjugación (-ar) en futuro");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "aré");
                System.out.println("Tú " + cadena + "arás");
                System.out.println("Él " + cadena + "ará");
                System.out.println("Nosotros " + cadena + "aremos");
                System.out.println("Vosotros " + cadena + "aréis");
                System.out.println("Ellos " + cadena + "arán");
            }

        } else if (terminacion.equals("er")) {
            System.out.println("¿En que tiempo verbal lo quieres?");
            System.out.println("A para el Presente, P para el Preterito Perfecto Simple y F para el Futuro.");
            String FV = sc.nextLine();
            String terminacionFV = FV.substring(FV.length() - 1);
            if (terminacionFV.equals("A")) {
                System.out.println("Verbo de primera conjugación (-er) en presente");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "o");
                System.out.println("Tú " + cadena + "es");
                System.out.println("Él " + cadena + "e");
                System.out.println("Nosotros " + cadena + "emos");
                System.out.println("Vosotros " + cadena + "éís");
                System.out.println("Ellos " + cadena + "en");
            } else if (terminacionFV.equals("P")) {
                System.out.println("Verbo de primera conjugación (-er) en pasado");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "í");
                System.out.println("Tú " + cadena + "iste");
                System.out.println("Él " + cadena + "ió");
                System.out.println("Nosotros " + cadena + "imos");
                System.out.println("Vosotros " + cadena + "ísteis");
                System.out.println("Ellos " + cadena + "ieron");
            } else if (terminacionFV.equals("F")) {
                System.out.println("Verbo de primera conjugación (-er) en futuro");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "eré");
                System.out.println("Tú " + cadena + "erás");
                System.out.println("Él " + cadena + "erá");
                System.out.println("Nosotros " + cadena + "eremos");
                System.out.println("Vosotros " + cadena + "eréis");
                System.out.println("Ellos " + cadena + "erán");
            }

        } else if (terminacion.equals("ir")) {
            System.out.println("¿En que tiempo verbal lo quieres?");
            System.out.println("A para el Presente, P para el Preterito Perfecto Simple y F para el Futuro.");
            String FV = sc.nextLine();
            String terminacionFV = FV.substring(FV.length() - 1);
            if (terminacionFV.equals("A")) {
                System.out.println("Verbo de primera conjugación (-ir) en presente");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "o");
                System.out.println("Tú " + cadena + "es");
                System.out.println("Él " + cadena + "e");
                System.out.println("Nosotros " + cadena + "imos");
                System.out.println("Vosotros " + cadena + "ís");
                System.out.println("Ellos " + cadena + "en");
            } else if (terminacionFV.equals("P")) {
                System.out.println("Verbo de primera conjugación (-ir) en pasado");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "í");
                System.out.println("Tú " + cadena + "iste");
                System.out.println("Él " + cadena + "ió");
                System.out.println("Nosotros " + cadena + "imos");
                System.out.println("Vosotros " + cadena + "ísteis");
                System.out.println("Ellos " + cadena + "ieron");
            } else if (terminacionFV.equals("F")) {
                System.out.println("Verbo de primera conjugación (-ir) en futuro");
                cadena.delete(cadena.length() - 2, cadena.length());
                System.out.println("Yo " + cadena + "iré");
                System.out.println("Tú " + cadena + "irás");
                System.out.println("Él " + cadena + "irá");
                System.out.println("Nosotros " + cadena + "iremos");
                System.out.println("Vosotros " + cadena + "iréis");
                System.out.println("Ellos " + cadena + "irán");
            } else {
                System.out.println("Tu forma verbal no es valida");
            }

        } else {
            System.out.println("Tu verbo no termina en ninguna de las tres formas");
        }

    }
}
