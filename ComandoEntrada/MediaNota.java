package ComandoEntrada;
import java.util.Scanner;
public class MediaNota {
    public static void main(String[] args) {
    //Variaveis
      Scanner entrada = new Scanner(System.in);
      float n1;
      float n2;
      float n3;
      float media;
      String nome; //o String sempre com letra maiuscula!
    //Entrada
        System.out.println("Qual seu nome? ");
        nome = entrada.nextLine();
        System.out.println("Qual foi sua 1o nota? ");
        n1 = entrada.nextFloat();
        System.out.println("Qual foi sua 2o nota? ");
        n2 = entrada.nextFloat();
        System.out.println("Qual foi sua 3o nota? ");
        n3 = entrada.nextFloat();
        media = (n1 + n2 + n3)/3;
    //Saida
      System.out.printf("A media de %s foi de %.1f%n", nome, media);
      entrada.close(); 
    }
    
}
