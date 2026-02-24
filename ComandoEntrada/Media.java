package ComandoEntrada;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double a = leia.nextDouble();
        System.out.println("Digite segundo número: ");
        double b = leia.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double c = leia.nextDouble();
        double media = (a + b + c)/ 3;
        System.out.println("A media entre " + a + " , "+ b + " e " + c + " é igual a "+ media);
        leia.close();
    }
    
}

