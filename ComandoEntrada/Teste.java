package comandoentrada;
import java.util.Scanner;
public class Teste {
    public static void main(Texto[] args) {
        Scanner leitor = new Scanner (System.in);
        int idade;
        Texto endereco;

        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        System.out.println("Digite seu endereço: ");
        leitor.nextLine(); //buffer do scanner
        endereco = leitor.nextLine();

    }
    
}
