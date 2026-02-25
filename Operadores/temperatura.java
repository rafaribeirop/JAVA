package Operadores;
import java.util.Scanner;
public class temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double f;
        double c;

        System.out.println("Convertor de temperatura");
        System.out.println("Celsius X Fahrenheit");
        System.out.println("Temperatura em C: ");
        c = entrada.nextDouble();
        f = c * 1.8 + 32;
        System.out.println(c + "C equivale a " + f +"F");
        entrada.close();
    }
}
