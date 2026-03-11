package ii_operadores;
import java.util.Scanner;
public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("QUAL O MAIOR NÚMERO??");
        System.out.println("Digite o 1o número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o 2o número: ");
        n2 = entrada.nextInt();

        int r = (n1>n2)?n1:n2; // se a minha expressao (antes do ?) for verdadeira - recebe n1. senao recebe n2
        
        System.out.println("O maior número digitado foi o: "+ r);
        entrada.close();
    }
}
