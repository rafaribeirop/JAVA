package Operadores;
import java.util.Scanner;
public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int rq;
        double res;

        System.out.println("~ Raiz quadrada ~");
        System.out.println("Quer ver a raiz quadrada de qual número? ");
        rq = entrada.nextInt();
        res = Math.sqrt(rq);
        System.out.println("A raiz quadrada de "+ rq + " é: "+ res);


        entrada.close();


        
    }
}
