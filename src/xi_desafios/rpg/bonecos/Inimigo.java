package xi_desafios.rpg.bonecos;

public class Inimigo extends Bonecos{
    //Tipo ENUM - GOBLIN, BESTA, DRAGAO
    private TipoInimigo  tipo;
    private boolean voando;
    private VelocidadeInimigo velocidade;

    //Construtor
    public Inimigo(String nome, int vida, boolean vivo, int vidaMaxima, int defesa, int defesaMaxima,
                   int magia, int nivel, TipoInimigo tipo, boolean voando, VelocidadeInimigo velocidade) {
        super(nome, vida, vivo, vidaMaxima, defesa, defesaMaxima, magia, nivel);
        this.tipo = tipo;
        this.voando = voando;
        this.velocidade = velocidade;
    }


    public void atacar(Personagem personagem) {

    }

    @Override
    public void ReceberDano(int dano) {

    }

    @Override
    public void subirNivel(int experiencia) {

    }

    @Override
    public void calcularDano(int dano, int vida) {

    }
}
