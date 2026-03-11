package viii_desafios;
import java.util.Scanner;

public class CalculoIMC {
    static double imc(double a, double b){

        double c = a /(b * b);
        return c;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        double altura, peso;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite seu peso: (kg)");
        peso = entrada.nextDouble();
        System.out.println("Digite sua altura: (m)");
        altura = entrada.nextDouble();

        double imc = imc(peso, altura);

        String classificacao;
        if (imc < 16){
            classificacao = "MUITO ABAIXO DO PESO";
        } else if(imc < 18.5){
          classificacao = "MAGREZA";
        } else if (imc < 25){
            classificacao = "NORMAL";
        } else if (imc < 30 ){
            classificacao = "SOBREPESO";
        } else if (imc < 35){
            classificacao = "OBESIDADE";
        } else if (imc < 40){
            classificacao = "OBESIDADE GRAVE";
        } else {
            classificacao = "OBESIDADE MÓRBIDA";
        }

        System.out.print(nome + " Seu IMC é: ");
        System.out.format("%.1f%n" , imc);
        System.out.println("Sua classificação é: "+ classificacao);

        entrada.close();        
    }
}
