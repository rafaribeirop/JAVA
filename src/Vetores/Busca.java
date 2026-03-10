package vetores;
import java.util.Arrays;

public class Busca {
    public static void main(String[] args) {
        int n[] = {3,7,1,2,5};
        int p = Arrays.binarySearch(n, 1);
        Arrays.sort(n);

        System.out.println("O valor 1 está na posição "+ p);

        for(int valor: n){
            System.out.println(valor);    
        }

    }
}
