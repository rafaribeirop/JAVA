package repeticao;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int contador;
        int valor;
        int fatorial = 1;

        System.out.println("Deseja ver o fatorial de qual número? ");
        valor = t.nextInt();
        contador = valor;

       while (contador >= 1){
            fatorial *= contador;
           if (contador == 1){
            System.out.print(contador);
           } else {
            System.out.print(contador+" * ");
           }
            contador--;
       }
        System.out.println();
        System.out.print("O fatorial de "+ valor + "! = " + fatorial);

        t.close();
    }
}
