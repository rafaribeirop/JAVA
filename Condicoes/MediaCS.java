package Condicoes;
import java.util.Scanner;
public class MediaCS {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.println("Sua 1o nota: "); 
        nota1 = entrada.nextDouble();
        System.out.println("Sua 2o nota: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Sua media foi de: "+ media);
        if (media >= 9){
            System.out.println("Parabéns! Você foi excelente!");
        }
        entrada.close();
    }
}
