package Desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int i;

        System.out.println("Quer ver a tabuada de qual número: ");
        numero = entrada.nextInt();
        System.out.println("------");

        for(i = numero; i <= 10; i++){
            System.out.println(i * numero);
        }
        entrada.close();
    }
}
