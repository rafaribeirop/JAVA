package xi_desafios;
import java.util.Scanner;
public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resp;   
        String escolha[] = {"", "Pedra", "Papel", "Tesoura"};
        int maquina, ptMaquina = 0;
        int usuario, ptUsuario = 0;

        do {
        System.out.println("==========================");
        System.out.println("| Pedra, Papel e Tesoura |");
        System.out.println("==========================");
        System.out.println("| [1] Pedra              |");
        System.out.println("| [2] Papel              |");
        System.out.println("| [3] Tesoura            |");
        System.out.println("==========================");
        System.out.println("         Pontuação        ");
        System.out.println("Computador: " + ptMaquina);
        System.out.println("Você: "+ ptUsuario);
        maquina = 1+ (int)(Math.random()*3);
        System.out.println("Sua vez: ");
        usuario = entrada.nextInt();

      
        if(maquina == usuario){
            System.out.println("Empate");
            System.out.println("Vocês escolheram "+ escolha[usuario]);
        } else if( usuario == 1 && maquina == 3 || usuario == 2 && maquina == 1 ||
            usuario == 3 && maquina == 2) {
            System.out.println("Você GANHOU!");
            System.out.println("Você escolheu " + escolha[usuario] + " - Máquina escolheu " + escolha[maquina]);
            ptUsuario++;
        } else {
            System.out.println("Você PERDEU!");
            System.out.println("Você escolheu "+ escolha[maquina] + " - Máquina escolheu "+ escolha[usuario]);
            ptMaquina++;
        }
        System.out.println("Deseja jogar novamente? [S/N]");
        resp = entrada.next();

        } while(resp.equalsIgnoreCase("S"));

        entrada.close();
    }
}
