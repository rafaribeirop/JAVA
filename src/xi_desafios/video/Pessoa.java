package xi_desafios.video;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected int experiencia;

    public abstract void ganharExperiencia();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", experiencia=" + experiencia +
                '}';
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
