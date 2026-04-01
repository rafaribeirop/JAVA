package xi_desafios.rpg.inventario.armas;

import xi_desafios.rpg.bonecos.Inimigo;
import xi_desafios.rpg.bonecos.Personagem;

import java.util.ArrayList;

public abstract class Armas {
    protected Alcance alcance;
    protected String nome;

    public Armas(String nome, Alcance alcance) {
        this.nome = nome;
        this.alcance = alcance;
    }

    public abstract void ataque(Personagem personagem, Inimigo inimigo);

    public abstract int calcularDano(Personagem personagem);
}
