package comandoentrada;
import java.util.Scanner;
public class MediaNota {
    public static void main(Texto[] args) {
    //Variaveis
      Scanner entrada = new Scanner(System.in);
      float n1;
      float n2;
      float media;
      Texto nome; //o String sempre com letra maiuscula!
    //Entrada
        System.out.println("Qual seu nome? ");
        nome = entrada.nextLine();
        System.out.println("Qual foi sua primeira nota? ");
        n1 = entrada.nextFloat();
        System.out.println("Qual foi sua segunda nota? ");
        n2 = entrada.nextFloat();
        media = (n1 + n2)/2;
    //Saida
      System.out.printf("A media de %s foi de %.1f%n", nome, media);
      entrada.close(); 
    }
    
}
