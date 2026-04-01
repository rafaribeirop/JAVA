package xi_desafios;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio;
        double pi = 3.14159;
        System.out.println(" -- Calcular área do círculo -- ");
        System.out.println("Digite o raio do círculo: ");
        raio = entrada.nextDouble();
        double area = pi*(raio*raio);
        System.out.printf("A= %.2f", area);
        entrada.close();
    }

}
