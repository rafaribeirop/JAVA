package xi_desafios.rpg.inventario.itensconsumiveis;

import xi_desafios.rpg.bonecos.Personagem;

public class PocaoDefesa extends Pocoes {

    private int quantidadeDefesa;

    public PocaoDefesa(String nome, String descricao, int quantidade, int quantidadeDefesa) {
        super(nome, descricao, quantidade);
        this.quantidadeDefesa = quantidadeDefesa;
    }

    @Override
    public void usar(Personagem personagem) {
        if (personagem.getDefesa() < personagem.getDefesaMaxima()){
            int novaDefesa = personagem.getDefesa() +  this.quantidadeDefesa;
            personagem.setDefesa(novaDefesa);
            if (novaDefesa > personagem.getDefesaMaxima()){
                novaDefesa = personagem.getDefesaMaxima();
            }
        }
    }
}
