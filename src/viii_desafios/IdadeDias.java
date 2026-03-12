package viii_desafios;
import java.util.Scanner;
public class IdadeDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os dias: ");
        int idadeDias = entrada.nextInt();

        int anos = idadeDias / 365;  
        int resto = idadeDias % 365;
        int meses = resto / 30;
        int dias = resto % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");    
        entrada.close();
    }
}
