package classesobjetos.doacao;
import java.util.Scanner;
public class DoacaoObj {
    
    public static void main(String[] args) {
        DoacaoC detalhes = new DoacaoC();
        Scanner entrada = new Scanner(System.in);
        String resp;

        System.out.println("Deseja doar sangue? ");
        resp = entrada.next();
        if (resp.equalsIgnoreCase ("S")){
            System.out.println("Obrigado por ajudar");
            detalhes.doar(entrada);
        } else if (resp.equalsIgnoreCase ("N")) {
            System.out.println("Obrigado mesmo assim");
        } else {
            System.out.println("Inválido");
        }
    }   
}
