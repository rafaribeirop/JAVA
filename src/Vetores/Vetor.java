package vetores;

public class Vetor {
    public static void main(String[] args) {

       /* 1ª FORMA DE DECLARAR:

        *int n [] = new int[4];
        * n[0] = 3;
        * n[1] = 4
        * n[2] = 1
        * n[3] = 5
        */

        // 2ª FORMA DE DECLARAR

        int n [] = {3, 4, 1, 5}; // mesma coisa do de cima
        int i;

        for (i=0; i<4;i++){
            System.out.println(i + "-" + n[i]);
        }
        
    }
}
