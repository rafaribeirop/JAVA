package ii_operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int a, b, c;
        boolean r1, r2, r3, r4;

        a = 2;
        b = 4;
        c = 5; 

        // .E. OS DOIS VERDADEIROS 
        r1 = (a < b && b < c); 
        System.out.println(r1);

        // .OU. PELO MENOS UM DOS DOIS VERDADEIROS 
        r2 = (a > c || b < c); 
        System.out.println(r2);

        // .XOU. UM OU OUTRO 
        r3 = (a > b ^ b < c);
        System.out.println(r3);

        // .NÃO. O CONTRÁRIO
        r4 = !(a < b);
        System.out.println(r4);
    }
    
}
