package iii_condicionais;
import java.util.Scanner;
public class Voto {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("Qual sua idade? ");
        idade = in.nextInt();
        System.out.println("Sua idade é " + idade);

        if (idade < 16) {
            System.out.println("Você não vota !");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Voto opcional! ");
            } else {
                System.out.println("Voto obrigatório!");
            }
        }
        in.close();
        
    }
}
