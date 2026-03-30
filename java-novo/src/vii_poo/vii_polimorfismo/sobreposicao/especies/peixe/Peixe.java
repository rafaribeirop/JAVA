package vii_polimorfismo.sobreposicao.especies.peixe;

import vii_polimorfismo.sobreposicao.especies.base.Animal;

public class Peixe extends Animal {
    //Atribuições
    private String corEscama;
    //Métodos
    public void soltarBolha(){
        System.out.println("Bolha soltando");
    }
    //Implementos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    //Getter e setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
