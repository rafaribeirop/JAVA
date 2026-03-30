package xi_desafios.rpg.inventario.itensconsumiveis;

import xi_desafios.rpg.bonecos.Personagem;

public abstract class ItensConsumiveis {

    protected String nome;
    protected String descricao;
    protected int quantidade;

    public ItensConsumiveis(String nome, String descricao, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public abstract void usar(Personagem personagem);

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
