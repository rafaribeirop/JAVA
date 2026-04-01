package vii_poo.vii_polimorfismo.sobreposicao.especies.base;

public abstract class Animal {
    //Atributos
    private double peso;
    private int idade;
    private int membros;

    //Métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //Getters e setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
