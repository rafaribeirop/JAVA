package Operadores;

public class Operacoes {
    public static void main(String[] args) {

    // Testando Operações

        System.out.println("Operadores Unários");
        int a = 6;
        int b = 2;
        int ab = a + ++b;
        System.out.println(a + "+" + b + "=" + ab);
        // atribuição
        System.out.println("Atribuição");
        int i = 1;
        int j = 3;
        int ij = i += j;
        System.out.println(ij);

        // classe math
            System.out.println("Raiz Quadrada");
            int rq = 64;
            int re = (int) Math.sqrt(rq);
            System.out.println("A raiz quadradade de " + rq + " é: " + re);

            System.out.println("Raiz Cúbica");
            int rc = 125;
            int res = (int) Math.cbrt(rc);
            System.out.println("A raiz cúbica de " + rc + " é: " + res);

            System.out.println("Potênciação");
            int n = 3;
            int e = 3;
            int p = (int) Math.pow(n, e);
            System.out.println(n + "^" + e + "=" + p);

            System.out.println("Valor absoluto");
            int neg = -16;
            int abs = Math.abs(neg);
            System.out.println("O valor absoluto de "+ neg + " é: " + abs);

            System.out.println("PI");
            double pi = Math.PI;
            System.out.printf("%.2f%n", pi);
            double piP = a * pi;
            System.out.printf(a +" * "+ pi +" é: %.2f%n", piP);
       

            // arredondamentos
                System.out.println("Valores arredondados");
    
                System.out.println("Floor");
                double z = Math.floor(9.9);
                System.out.println(z);

                System.out.println("Ceil");
                double y = Math.ceil(7.3);
                System.out.println(y);

                System.out.println("Round");
                double x = Math.round(5.6);
                System.out.println(x);


    





    }
    
}
