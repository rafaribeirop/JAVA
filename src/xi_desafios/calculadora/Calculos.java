package xi_desafios.calculadora;
import java.util.ArrayList;
public class Calculos {

    private ArrayList<Double> numeros;

    public Calculos() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(double valor) {
        numeros.add(valor);
    }

    public void limpar(){
        numeros.clear();
    }

    public String mostrarConta(String operador){
        String conta = "";
        // String começa vazia para montar a expressão da conta
        for(int i = 0; i < numeros.size(); i++){
            double num = numeros.get(i);
            // Se o número não tiver parte decimal, converte para int para remover o .0
            if (num == (int) num) {
                conta += (int) num;
            } else {
                conta += num;
            }
            if (i < numeros.size()-1){
                conta += " " + operador + " ";
            }
        }
        return conta;
    }


    public double adicao() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (double valor : numeros) {
            soma += valor;
        }
        return soma;
    }

    public double subtracao() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double subtracao;
        // Subtração começa com o primeiro número digitado
        subtracao = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            subtracao -= numeros.get(i);
        }
        return subtracao;
    }

    public double multiplicacao() {
        if (numeros.isEmpty()) {
            return 0;
        }
        double multiplicacao = 1;
        for (double numero : numeros) {
            multiplicacao *= numero;
        }
         return multiplicacao;
    }

    public double divisao() {
        if (numeros.isEmpty()) {
           return 0;
        }
        //Começa com o primeiro número digitado
        double divisao = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                System.out.println("Não pode ser dividido por 0");
                return 0;
            }
            divisao /= numeros.get(i);
        }
        return divisao;
    }
}
