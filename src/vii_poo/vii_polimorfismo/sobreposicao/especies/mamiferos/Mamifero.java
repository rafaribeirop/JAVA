package vii_polimorfismo.sobreposicao.especies.mamiferos;

import vii_polimorfismo.sobreposicao.especies.base.Animal;

public class Mamifero extends Animal {
    //Atribuição
    private String corPelo;

    //Implementos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    //Getter e setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
