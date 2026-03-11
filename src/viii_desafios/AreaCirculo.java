package viii_desafios;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio;
        double pi = 3.14159;

        raio = entrada.nextDouble();
        double area = pi*(raio*raio);
        System.out.printf("A=%.4f\n", area);
        entrada.close();


    }

}
