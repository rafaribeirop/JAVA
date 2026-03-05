package Basico;
import java.util.Scanner;

public class Saldo {
    public static void main(Texto[] args) {
       Scanner leitor = new Scanner(System.in); 
       double salario, gastos, saldo;

       System.out.print("Digite seu salário: R$");
       salario = leitor.nextDouble();
       System.out.print("Valor de seus gastos: R$");
       gastos = leitor.nextDouble();
       saldo = salario - gastos;

       System.out.printf("Seu saldo é de: R$%.2f", saldo);

       leitor.close();



    }
}
