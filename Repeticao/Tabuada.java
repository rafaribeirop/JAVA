package Repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador;

        System.out.println("Quer ver a tabuada de qual número: ");
        numero = entrada.nextInt();
        System.out.println("------");

        for(contador = numero; contador <= (numero*10); contador += numero){
            System.out.println(contador);
        }
        entrada.close();
    }
}
