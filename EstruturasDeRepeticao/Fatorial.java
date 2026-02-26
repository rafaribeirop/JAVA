package EstruturasDeRepeticao;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int contador = 1;
        int valor;
        int fatorial = 1;

        System.out.println("Deseja ver o fatorial de qual número? ");
        valor = t.nextInt();
        
       while (contador <= valor){
            fatorial *= contador;
            contador++;
       }
        System.out.print("O fatorial de "+ valor + "! = " + fatorial);
        t.close();
    }
}
