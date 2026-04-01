package iii_condicionais;
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = t.nextInt();
        if (numero % 2 == 0){
            System.out.println("Seu número é PAR. ");
        } else {
            System.out.println("Seu número é IMPAR");
        }
        t.close();
    }
}
