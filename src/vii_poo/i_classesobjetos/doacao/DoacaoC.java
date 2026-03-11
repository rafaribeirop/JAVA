package vii_poo.i_classesobjetos.doacao;

import java.util.Scanner;

public class DoacaoC {

    private void menuTipo0(){
       System.out.println("Sobre qual tipo sanguíneio voce deseja saber:  ");
        System.out.println("[A+] [A-]");
        System.out.println("[B+] [B-]");
        System.out.println("[AB+] [AB-]");
        System.out.println("[O+] [O-]");  
    }

    private void menuTipo1(){
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

    public void compatibilidade(Scanner a){
        menuTipo0();
        String tipo = a.next();
        switch (tipo.toUpperCase()){
            case "A+":
                System.out.println("Recebe de: ");
                System.out.println("A+  A-  O+  O- ");
                System.out.println("Doa para: ");
                System.out.println("A+  AB+");
                break;
            case "A-":
                System.out.println("Recebe de: ");
                System.out.println("A-  O-");
                System.out.println("Doa para: ");
                System.out.println("A+  A-  AB+  AB-");
                break;
            case "B+":
                System.out.println("Recebe de: ");
                System.out.println("B+  B-  O+  O-");
                System.out.println("Doa para: ");
                System.out.println("B+  AB+");
                break;
            case "B-":
                System.out.println("Recebe de: ");
                System.out.println("B-  O-");
                System.out.println("Doa para: ");
                System.out.println("B+  B-  AB+  AB-");
                break;
            case "AB+":
                System.out.println("Recebe de: ");
                System.out.println("A+  A-  B+  B-  AB+  AB-  O+  O-");
                System.out.println("Doa para: ");
                System.out.println("AB+");
                break;
            case "AB-":
                System.out.println("Recebe de: ");
                System.out.println("A-  B-  AB-  O-");
                System.out.println("Doa para: ");
                System.out.println("AB+  AB-");
                break;
            case "O+":
                System.out.println("Recebe de: ");
                System.out.println("O+  O-");
                System.out.println("Doa para: ");
                System.out.println("A+  B+  AB+  O+");
                break;
            case "O-":
                System.out.println("Recebe de: ");
                System.out.println("O-");
                System.out.println("Doa para: ");
                System.out.println("A+  A-  B+  B-  AB+  AB-  O+  O-");
                break;
            default:
                System.out.println("Inválido");
                return;
        }
        
    }

    public void doar(Scanner x){
        menuTipo1();
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
