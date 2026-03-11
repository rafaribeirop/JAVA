package v_vetores;
import java.util.Arrays;

public class OrdenarValores {
    public static void main(String[] args) {
        int v [] = {8,0,9,5,2,5,4};
        Arrays.sort(v);

        // For Each - um for que funciona apenas para vetores!
        for(int valor: v){
            System.out.println(valor);
        }
    }
}
