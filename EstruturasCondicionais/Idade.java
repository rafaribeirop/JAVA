package EstruturasCondicionais;
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade;
        int nasc;

        System.out.println("Em que ano você nasceu? ");
        nasc = leia.nextInt();
        idade = (2026 - nasc);
        System.out.println("Sua idade é " + idade);
        if (idade >= 18){
            System.out.println("Você é maior de idade. ");
        } else {
            System.out.println("Voce é menor de idade.");
        }
        leia.close();
    }
}
