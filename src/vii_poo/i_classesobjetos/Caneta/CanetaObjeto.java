package i_classesobjetos.Caneta;
import java.util.Scanner;

public class CanetaObjeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //CANETA 1
        Caneta c1 = new Caneta();
        c1.modelo = "Caneta Simples";
        c1.cor = "Azul";
        c1.ponta = 0.7;
        c1.tinta = 100;
        // CANETA 2
        Caneta c2 = new Caneta();
        c2.modelo = "Caneta 4 cores";
        c2.cor = "Preto, Azul, Vermelho, Verde";
        c2.ponta = 1.0;
        c2.tinta = 100;
        //Métodos
        int resp[] = new int[3];
        Caneta canetaEscolhida;
        System.out.println("Escolha sua caneta");
        c1.status();
        c2.status();
        System.out.println("[1] para: " + c1.modelo);
        System.out.println("[2] para: " + c2.modelo);
        resp[1] = entrada.nextInt();

        if (resp[1] == 1){
            canetaEscolhida = c1;
        } else {
            canetaEscolhida = c2;
        } 
        
        boolean opcaoValida = true;
        
        System.out.println("Deseja: ");
        System.out.println("[1] para DESTAMPAR");
        System.out.println("[2] para TAMPAR");
        resp[2] = entrada.nextInt();

        if (resp[2] == 1){
            canetaEscolhida.destampar();
        } else if (resp[2] == 2){
            canetaEscolhida.tampar();
        } else {
            System.out.println(" x INVÁLIDO x");
            opcaoValida = false;
        }

        if (opcaoValida){
        System.out.println("Teste sua caneta aqui: ");
        canetaEscolhida.rabiscar();
        }

        entrada.close();

    }
   
} 
