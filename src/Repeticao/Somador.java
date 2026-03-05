package Repeticao;

import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int s = 0;
        String  resp;

       do { System.out.println("Digite um número");
            n = entrada.nextInt();
            s += n;
            System.out.println("Deseja continuar? [S/N]");
            resp = entrada.next();
       } while (resp.equals("S"));

       System.out.println("Sua soma foi: "+ s);
       entrada.close();
    }
}       
