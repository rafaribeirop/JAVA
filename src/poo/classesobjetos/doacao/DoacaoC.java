package classesobjetos.doacao;

import java.util.Scanner;

public class DoacaoC {

    private void menuTipo(){
       System.out.println("Qual seu tipo sanguineo? ");
        System.out.println("[A]");
        System.out.println("[B]");
        System.out.println("[AB]");
        System.out.println("[O]");  
    }

    private void menuRh(){
        System.out.println("Qual seu fator RH");
        System.out.println("[+]");
        System.out.println("[-]");
    }

    public void doar(Scanner x){
        menuTipo();
        String tipo = x.next();
        switch (tipo.toUpperCase()) {
            case "A":
            case "B": 
            case "AB":
            case "O":
            break;
            default:
                System.out.println("INVALIDO"); 
                return;    
        }
        menuRh();
        String rh = x.next();
        switch (rh) {
            case "+":
            case "-":
                break;
            default:
                System.out.println("INVÁLIDO");
                return;
        }
        System.out.println("Doação de sangue " + tipo.toUpperCase() + rh +" Recebida ");
    
    }
}
