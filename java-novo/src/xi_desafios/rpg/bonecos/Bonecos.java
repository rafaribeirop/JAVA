package xi_desafios.rpg.bonecos;

public abstract class Bonecos {

    protected String nome;
    protected int vida;
    protected boolean vivo;
    protected int vidaMaxima;
    protected int defesa;
    protected int defesaMaxima;
    protected int magia;
    protected int experiencia;
    protected int nivel;

    public Bonecos(String nome, int vida, boolean vivo, int vidaMaxima, int defesa, int defesaMaxima,
                   int magia, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.vivo = vivo;
        this.vidaMaxima = vidaMaxima;
        this.defesa = defesa;
        this.defesaMaxima = defesaMaxima;
        this.magia = magia;
        this.nivel = nivel;
    }

    //Metodos Implemenatdos

    public abstract void ReceberDano(int dano);

    public abstract void subirNivel(int experiencia);

    public abstract void calcularDano(int dano, int vida);


    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesaMaxima() {
        return defesaMaxima;
    }

    public void setDefesaMaxima(int defesaMaxima) {
        this.defesaMaxima = defesaMaxima;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
