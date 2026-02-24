package ComandoEntrada;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println ("Digite o primeiro número: ");
        int a = numero.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = numero.nextInt();
        int soma = a + b;
        System.out.println("A soma é: " + soma);
        numero.close();
    }
}
