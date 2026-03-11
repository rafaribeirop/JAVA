package iii_condicionais;
import java.util.Scanner;
public class Pernas {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int pernas;
        String tipo;

        System.out.println("Quantas pernas: ");
        pernas = ent.nextInt();

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
                break;
        }

        System.out.println("Isso é um(a) "+ tipo);
        ent.close();
    }
}
