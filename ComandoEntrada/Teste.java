package ComandoEntrada;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int idade;
        String endereco;

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Digite seu endereço: ");
        leitor.nextLine(); //buffer do scanner
        endereco = leitor.nextLine();

        System.out.println(idade + endereco);
        leitor.close();
    }
    
}
