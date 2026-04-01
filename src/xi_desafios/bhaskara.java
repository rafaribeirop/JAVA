package xi_desafios;
import java.util.Scanner;
public class bhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-- Bhaskara --");
        System.out.println("Equação: ax^2 + bx + c = 0 ");
        System.out.println("Digite o valor de a: ");

        int a = entrada.nextInt();
        if (a==0){
            System.out.println("INVÁLIDO");
        } else {
            System.out.println("Digite o valor de b: ");
            int b = entrada.nextInt();
            System.out.println("Digite o valor de c: ");
            int c = entrada.nextInt();
            System.out.println(a+"x^2 + "+b+"x + "+c +"= 0");
            int delta = (int) (Math.pow(b, 2)) - (4 * a * c);
            if (delta < 0){
                System.out.println("Inválido");
                System.out.println("O delta não pode ser negativo");
            } else{
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("-- Resultado -- ");
                System.out.println("x1= " +  x1 + " x2= " + x2);
            }
        }
        entrada.close();
    }
}
