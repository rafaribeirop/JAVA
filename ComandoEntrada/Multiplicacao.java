package ComandoEntrada;
import java.util.Scanner;
public class Multiplicacao {
    public static void main(Texto[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double a = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        double b = entrada.nextDouble();
        double produto = a * b;
        System.out.println("O produto é: " + produto);
        entrada.close();

    }
    
}
