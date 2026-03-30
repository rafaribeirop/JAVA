package xi_desafios.calculadora;

public class Menu {

    public void menuInicial(){
        System.out.println("=== Calculadora ===");
        System.out.println("Escolha sua operação: ");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Divisão");
        System.out.println("[4] Multiplicação");
       // System.out.println("[5] Outras operações");
       // AINDA NÃO ESTÁ PRONTO
        System.out.println("[0] Sair");
    }

    public void menuOutrasOperacoes(){
        System.out.println("=== Outras Operações ===");
        System.out.println("[1] Raiz Quadrada");
        System.out.println("[2] Raiz Cúbica");
        System.out.println("[3] Potênciação");
        System.out.println("[4] Bhaskara");
        System.out.println("[0] Voltar");
    }

}
