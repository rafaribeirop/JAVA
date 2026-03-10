package operadores;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int b;
        int e;
        int p;

        System.out.println("POTÊNCIAÇÃO");
        System.out.println("Seu número de base: ");
        b = entrada.nextInt();
        System.out.println("Seu expoente: ");
        e = entrada.nextInt();
        System.out.println(b + "^"+ e);
        p = (int) Math.pow(b, e);
        System.out.println(p);
        entrada.close();

    }
}
