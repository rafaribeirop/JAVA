package Vetores;
import java.util.Scanner;
public class MesesDoAno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
        int dias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i;
        int ano;

        System.out.println("Em que ano estamos? ");
        ano = entrada.nextInt();

        if (ano % 100 == 0 && ano % 400 == 0){
            dias[1]++;
            System.out.println("Bissexto");
           
        } else if (ano % 100 != 0 && ano % 4 == 0){
            dias[1]++;
            System.out.println("Bissexto");
        }

        // Estrutura generica - funciona para todos os vetores
        for(i=0; i<mes.length;i++){
            System.out.println(mes[i]+ " - "+ dias[i]);
            }

        entrada.close();
        }

    }

 