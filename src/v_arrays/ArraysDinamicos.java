package v_arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraysDinamicos {
    public static void main(String[] args) {

        //ArrayList<Tipo> = new ArrayList<Tipo>();
        ArrayList<String> nomes = new ArrayList<String>();
        // Adicionar .add();
        nomes.add("Rafa");   // indice 0
        nomes.add("Goku");   // indice 1
        nomes.add("Naruto"); // indice 2
        nomes.add("Sasuke"); // indice 3

        // Tamanho do ArrayList .size();
        for(String mostrar : nomes){ // for each
            // Mostrar .get(indice)
            System.out.println(mostrar);
        }
        System.out.println("---");

        //Remover parâmetro .remove(indice || nome do parâmetro)
        nomes.remove(3);
        for(String mostrar : nomes){
            System.out.println(mostrar);
        }

        //Limpar um Array list .clear();
        nomes.clear();
        System.out.println("Array limpo: " +  nomes.size());

        //Tipo inteiro
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(40);
        numeros.add(2);
        numeros.add(100);
        numeros.add(0);
        numeros.add(1);
        //Ordenar o vetor
        Collections.sort(numeros); //Tbm funciona com String

        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
