package vii_poo.i_classesobjetos.doacao;
import java.util.Scanner;
public class DoacaoObj {
    
    public static void main(String[] args) {
        DoacaoC detalhes = new DoacaoC();
        Scanner entrada = new Scanner(System.in);
        String respDoar;
        String resp;

        System.out.println("Doação de sangue");
        System.out.println("Deseja saber sobre os tipos sanguineos? [S/N]");
        resp = entrada.next();
        if (resp.equalsIgnoreCase ("S")){
            detalhes.compatibilidade(entrada);
        } else if (resp.equalsIgnoreCase("N")){
            System.out.println("...");
        } else {
            System.out.println("Inválido");
        }
        System.out.println("Deseja doar sangue? [S/N]");
        respDoar = entrada.next();
        if (respDoar.equalsIgnoreCase ("S")){
            System.out.println("Obrigado por ajudar");
            detalhes.doar(entrada);
        } else if (respDoar.equalsIgnoreCase ("N")) {
            System.out.println("Obrigado mesmo assim");
        } else {
            System.out.println("Inválido");
        }
    }   
}
