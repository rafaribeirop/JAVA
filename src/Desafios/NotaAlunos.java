package Desafios;

import java.util.Scanner;

public class NotaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notas[] = new double [10];
        double maior = 0;
        int c;
        int posicaoMaiorNota = 0;
        double soma = 0;
        int acimaMedia = 0;
       

        for (c = 0; c < notas.length; c++){
            System.out.println("Digite a sua nota: ");
            notas[c] = entrada.nextInt();
            soma += notas[c];

            if (c==0){
                maior = notas[c];
            }

            if (notas[c] > maior){
                maior = notas[c];
                posicaoMaiorNota = c;
            }

            if (notas[c] > 6){
                acimaMedia++;
            }
        }

        double media = 0;
        media = soma/10;

        System.out.println("A média de todas as notas foi de: " + media);
        System.out.println(acimaMedia + " alunos estão acima da média");
        System.out.println("A maior nota foi "+ maior);
        System.out.println("A maior nota da turma foi digitada na posição: "+ posicaoMaiorNota);
        
        entrada.close();
    }
}
