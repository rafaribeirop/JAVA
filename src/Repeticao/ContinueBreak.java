package repeticao;

public class ContinueBreak {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10){
            contador++;
            if (contador == 3 || contador == 6 ){
                continue; // Volta pro while
            }
            if (contador == 8) {
                break;   // Sai do while
            }
            System.out.println(contador);
        }
    }
}
