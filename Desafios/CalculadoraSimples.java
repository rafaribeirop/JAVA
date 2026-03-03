package Desafios;

import java.util.Scanner;

public class CalculadoraSimples {
    static void mostrarMenu(){
        System.out.println("===============================");
        System.out.println("|     Calculadora Simples     |");
        System.out.println("===============================");
        System.out.println("| Qual operação deseja fazer? |");
        System.out.println("| [1] Para somar (+)          |");
        System.out.println("| [2] Para subtrair (-)       |");
        System.out.println("| [3] Para multiplicar (x)    |");
        System.out.println("| [4] Para dividir (/)        |");
        System.out.println("| [5] Para sair               |");
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        int resposta;
        String continuar;

        do {
            mostrarMenu();
            resposta = entrada.nextInt();
        
            if (resposta!= 5) {
                int n1, n2;

                System.out.println("Digite o 1o número: ");
                n1 = entrada.nextInt();
                System.out.println("Digite o 2o número: ");
                n2 = entrada.nextInt();

                double resultado;

                if (resposta == 1){  
                    resultado = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultado); 
                } else if (resposta == 2){
                    resultado = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultado); 
                } else if (resposta == 3){
                    resultado = n1 * n2;
                    System.out.println(n1 + " x " + n2 + " = " + resultado); 
                } else if (resposta == 4){
                    resultado = (double) n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado); 
                } 

            } else if (resposta == 5){
                    System.out.println("..Saindo...");
                    break;
            } else {
                System.out.println("Digito inválido");
            }

            System.out.println("Deseja calcular novamente? [S/N]");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));
        
        entrada.close();
 
    }
}
