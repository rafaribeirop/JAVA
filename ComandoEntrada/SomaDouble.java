package comandoentrada;
import java.util.Scanner; 
public class SomaDouble {
    public static void main(Texto[] args){
    Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número");
        double a = numero.nextDouble();
        System.out.println("Digite outro número: ");
        double b = numero.nextDouble();
        double soma = a + b;
        System.out.println("A soma é: " + soma);
    numero.close();
    }
    

    
}