package v_arrays;

import java.util.Arrays;

public class Preencher {
    public static void main(String[] args) {

        int v[] = new int [100];
        Arrays.fill(v, 1);

        for(int valor: v){
            System.out.print(valor + " ");

        }
    }
    
}
