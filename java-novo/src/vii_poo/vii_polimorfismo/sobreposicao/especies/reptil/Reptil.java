package vii_polimorfismo.sobreposicao.especies.reptil;

import vii_polimorfismo.sobreposicao.especies.base.Animal;

public class Reptil extends Animal {
    //Atribuição
    private String corEscama;

    //Método
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    //Implementos
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    //Getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
