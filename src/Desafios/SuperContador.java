package desafios;

import java.util.Scanner;

public class SuperContador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c;
        int r;
        String resp;
        do {
            System.out.println("=======================");
            System.out.println("|         MENU        |");
            System.out.println("=======================");
            System.out.println("| [1] Contar de 1 a 10|");
            System.out.println("| [2] Contar de 10 a 0|");
            System.out.println("| [3] Sair            |");
            System.out.println("=======================");
            r = entrada.nextInt();
            System.out.println();
        
            if(r==1){
                for(c = 1; c <= 10; c++) {
                    System.out.println(c);
                }
            } else if (r==2) {
                for(c=10;c>=1;c--){
                    System.out.println(c);
                }
            } else if (r==3){
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("DIGITO INVÁLIDO");
            }

            System.out.println("Deseja continuar? [S/N]");
            resp = entrada.next();

        } while (resp.equals("S") && (r!= 3));

        entrada.close();

    }
    
}
