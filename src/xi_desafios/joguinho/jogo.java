package xi_desafios.joguinho;
import java.util.Scanner;
public class jogo {
    public static void main(String[] args) {

        Combate jogo = new Combate(150,250);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Batalha com boss");
        jogo.exibirHud(jogo.getVida(), jogo.getVidaBoss());

        boolean vivo = true ;
        boolean vivoBoss = true;

        do {
            if (jogo.getVida() > 0 || jogo.getVidaBoss() > 0){
                if (vivo){
                    System.out.println("Digite qualquer número para atacar");
                    int interacao = scanner.nextInt();
                    int dano = jogo.calcularDano();
                    jogo.setVidaBoss(jogo.getVidaBoss() - dano);
                    jogo.exibirHud(jogo.getVida(), jogo.getVidaBoss());
                    if (jogo.getVida() < 0){
                        vivo = false;
                        jogo.setVidaBoss(0);
                    }
                }
                if(vivoBoss){
                    System.out.println("Ataque do boss");
                    int danoRecebido = jogo.calcularDanoRecebido();
                    jogo.setVida(jogo.getVida() - danoRecebido);
                    jogo.exibirHud(jogo.getVida(), jogo.getVidaBoss());
                    if (jogo.getVidaBoss() < 0){
                        vivoBoss = false;
                        jogo.setVidaBoss(0);
                    }
                }
            }

        } while (vivo || vivoBoss);

    }
}

