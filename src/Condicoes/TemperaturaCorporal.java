package condicoes;
import java.util.Scanner;
public class TemperaturaCorporal {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        double temp;
        boolean grave;

        System.out.println("Digite a sua temperatura: ");
        temp = t.nextDouble();
        grave = false;

        if (temp < 13 || temp > 50){
            System.out.println("x INVÁLIDO x ");
        } else if (temp <= 28){
            System.out.println("Você está com HIPOTERMIA GRAVE.");
            grave = true;
        } else if (temp <= 36){ 
            System.out.println("Você está com HIPOTERMIA");
        } else if (temp <= 37.2) {
            System.out.println("Você está com a temperatura NORMAL.");
        } else if (temp <= 37.7) {
            System.out.println("Você está FEBRIL.");
        } else if (temp < 39){
            System.out.println("Você está com FEBRE.");
        } else if (temp <= 40){
            System.out.println("Você está com FEBRE ALTA/PIREXIA.");
        } else {
            System.out.println("Você está com HIPERPIREXIA.");
            grave = true;
        }

        if (grave){
            System.out.println("! Procure ajuda médica IMEDIATAMENTE !");
        }
        
       t.close(); 
    }  
} 