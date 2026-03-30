package i_basico;
import java.util.Scanner;
public class Subtracao {
    public static void main(Texto[] args) {
        Scanner entrada = new Scanner (System.in);
        int a;
        int b;
        int sub; 

        System.out.println("Digite um número: ");
        a = entrada.nextInt();
        System.out.println("Digite outro número: ");
        b = entrada.nextInt();
        sub = a - b;

        System.out.println("O resultado é: " + sub);
       entrada.close(); 
    }
}
