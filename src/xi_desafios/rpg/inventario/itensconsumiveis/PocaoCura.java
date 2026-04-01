package xi_desafios.rpg.inventario.itensconsumiveis;

import xi_desafios.rpg.bonecos.Personagem;

public class PocaoCura extends Pocoes{
    private final int quantidadeCura;

    public PocaoCura(String nome, String descricao, int quantidade,
                    int quantidadecura) {
        super(nome, descricao, quantidade);
        this.quantidadeCura = quantidadecura;
    }

    @Override
    public void usar(Personagem personagem) {
        //Só pode curar se a vida atual for menor que a vida máxima
        if (personagem.getVida() < personagem.getVidaMaxima()) {
           int novaVida = personagem.getVida() +  this.quantidadeCura;
           personagem.setVida(novaVida);
           //Se a vida + cura for maior que a vida máxima
           if (novaVida > personagem.getVidaMaxima()) {
               novaVida = personagem.getVidaMaxima();
           }
        }
    }
}
