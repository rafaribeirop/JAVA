package xi_desafios.rpg.inventario.itensconsumiveis;

import xi_desafios.rpg.bonecos.Personagem;

public abstract class Pocoes extends ItensConsumiveis {

    public Pocoes(String nome, String descricao, int quantidade) {
        super(nome, descricao, quantidade);

    }


    @Override
    public abstract void usar(Personagem personagem);
}
