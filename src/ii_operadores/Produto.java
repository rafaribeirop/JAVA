package ii_operadores;
import java.util.Scanner;
public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( " - Multiplicação de dois números - ");
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int produto = numero1 * numero2;

        System.out.println("Resultado: " + numero1 + " x " + numero2 + " = " + produto);

    }
}
