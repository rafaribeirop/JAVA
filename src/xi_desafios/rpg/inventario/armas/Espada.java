package xi_desafios.rpg.inventario.armas;
import java.util.Random;

import xi_desafios.rpg.bonecos.Inimigo;
import xi_desafios.rpg.bonecos.Personagem;

public class Espada extends Armas{
    Random rand = new Random();

    public Espada(String nome, Alcance alcance) {
        super(nome, Alcance.CURTO_ALCANCE);
    }

    @Override
    public int calcularDano(Personagem personagem) {
        // Dano varia conforme o nível do personagem
        int dano = 15;

        if (personagem.getNivel() < 2){
            return dano;
        } else if (personagem.getNivel() < 5){
             return dano + 5;
        } else if (personagem.getNivel() <= 10){
             return dano + 10;
        } else {
             return dano + 20;
        }
    }

    @Override
    public void ataque(Personagem personagem, Inimigo inimigo){

        int danoFinal = calcularDano(personagem);
        int chanceCritico = rand.nextInt(100) + 1;

        // 20% de chance de ataque crítico
        if (chanceCritico <= 20){
            danoFinal *= 2;
            System.out.println("Crítico!");
        }
        inimigo.setVida(inimigo.getVida() - danoFinal);
    }
}
