package xi_desafios;

import java.util.Scanner;

public class ExercicioRepita {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0, par = 0, impar = 0, acima100 = 0, con = 0;
        int media;

        do{ 
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero != 0){
                con++;
                 // par ou impar
                if (numero % 2 == 0){
                    par++;
                } else {
                    impar++;
                }
                //qntidade de numeros acima de 100
                if (numero >= 100){ 
                    acima100++;
                }
                //soma dos números
                soma += numero;                
            }
            
        } while(numero != 0);
        //media
        if (con != 0){
            media = soma / con;
        } else {
            media = 0;
        }
        System.out.println("Número de digitos: "+ con);
        System.out.println("Soma dos números: "+ soma);
        System.out.println("Número de pares: "+ par);
        System.out.println("Número de impares:"+ impar);
        System.out.println("Média dos valores: "+ media);
        System.out.println("Números acima de 100: "+ acima100);

        entrada.close();
    }
}
