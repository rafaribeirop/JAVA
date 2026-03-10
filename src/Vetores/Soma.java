package vetores;

public class Soma {
    public static void main(String[] args) {
        int n[] = {4,6,2,1,9};
        int soma = 0;
        int c;

        for (c = 0; c< n.length;c++){
        soma += n[c];
        System.out.println(soma);
        }
    }
}
