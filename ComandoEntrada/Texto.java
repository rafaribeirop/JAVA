package ComandoEntrada;
import java.util.Scanner;
public class Texto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, palavra;

        System.out.println("Digite seu nome completo: ");
        nome = entrada.nextLine();
        nome = nome.trim();
        nome = nome.toUpperCase();
        System.out.println("Digite uma palavra: ");
        palavra = entrada.next();
        palavra = palavra.toLowerCase();
        System.out.println("Digite seu texto: ");

        System.out.println(nome);
        System.out.println(palavra);
        entrada.close();
    }
}
