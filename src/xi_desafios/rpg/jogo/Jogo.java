package xi_desafios.rpg.jogo;

import xi_desafios.rpg.bonecos.*;
import xi_desafios.rpg.inventario.armas.Alcance;
import xi_desafios.rpg.inventario.armas.ArcoEFlecha;
import xi_desafios.rpg.inventario.armas.Espada;
import xi_desafios.rpg.inventario.itensconsumiveis.PocaoCura;
import xi_desafios.rpg.inventario.itensconsumiveis.PocaoDefesa;

public class Jogo {
   public static void main(String[] args) {
       // Criando objetos
        Personagem personagem = new Personagem("Audrin", 100, true, 100,
                20, 20, 0,  1, TipoPersonagem.Guerreiro);
        Inimigo goblin = new Inimigo("Goblin", 65, true,65,5,
                5, 0, 1, TipoInimigo.GOBLIN, false, VelocidadeInimigo.LENTO);
       Espada espada = new Espada("Espada", Alcance.CURTO_ALCANCE);
       ArcoEFlecha arcoEFlecha = new ArcoEFlecha("Arco e Flecha", Alcance.LONGO_ALCANCE);
       PocaoCura pocaoCura = new PocaoCura("Poção de cura", "Recuperar 30 de vida", 1,
               30);
       PocaoDefesa pocaoDefesa = new PocaoDefesa("Poção de defesa", "Restaura sua defesa",
               1,10);

    }
}
