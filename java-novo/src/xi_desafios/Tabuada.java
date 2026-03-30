package xi_desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int i;

        System.out.println("Quer ver a tabuada de qual número: ");
        numero = entrada.nextInt();
        System.out.println("------");

        for(i = 1; i <= 10; i++){
            System.out.println(numero + "x"+ i + "= "+ i * numero);
        }
        entrada.close();
    }
}
