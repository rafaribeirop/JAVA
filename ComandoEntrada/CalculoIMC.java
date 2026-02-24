package ComandoEntrada;
import java.util.Scanner;
public class CalculoImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, peso, imc;

        System.out.print("Digite a sua altura em metros: ");
        altura = entrada.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble();
        imc = peso / (altura * altura);
        entrada.close();

        System.out.printf("Seu IMC é: %.1f" , imc);

    }
}
