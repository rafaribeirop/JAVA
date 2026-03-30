package xi_desafios.calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculos calculos = new Calculos();
        Menu menu = new Menu();
        int resp;

        do {
            menu.menuInicial();
            resp = sc.nextInt();
            
            double resultado;

            switch (resp) {
                case 1: //Adição
                    lerNumeros(sc, calculos);
                    resultado = calculos.adicao();
                    System.out.println(calculos.mostrarConta("+") + " = " +  resultado);
                    calculos.limpar();
                    break;

                case 2: //Subtração
                    lerNumeros(sc, calculos);
                    resultado = calculos.subtracao();
                    System.out.println(calculos.mostrarConta("-") + " = " +  resultado);
                    calculos.limpar();
                    break;

                case 3: // Divisão
                    lerNumeros(sc, calculos);
                    resultado = calculos.divisao();
                    System.out.println(calculos.mostrarConta("/") + " = " +  resultado);
                    calculos.limpar();
                    break;

                case 4: // Multiplicação
                    lerNumeros(sc, calculos);
                    resultado = calculos.multiplicacao();
                    System.out.println(calculos.mostrarConta("*") + " = " +  resultado);
                    calculos.limpar();
                    break;

                case 0:
                    System.out.println("..Saindo..");
            }
        }while (resp != 0);
    }
    //Lê números do usuário ate 0 ser digitado e adiciona a lista
    public static void lerNumeros(Scanner sc, Calculos calculos){
        double valores;
        do{
            System.out.println("Digite os números: (0 para PARAR)");
            valores = sc.nextDouble();
            if (valores != 0){
                calculos.adicionarNumero(valores);
            }
        }while (valores != 0);
    }
}
