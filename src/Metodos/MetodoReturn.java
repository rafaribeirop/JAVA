package metodos;

public class MetodoReturn {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        int sm = soma(6,7);
        System.out.println(sm);

        int sub = Teste.subtracao(10, 4);
        System.out.println(sub);
    }
}
