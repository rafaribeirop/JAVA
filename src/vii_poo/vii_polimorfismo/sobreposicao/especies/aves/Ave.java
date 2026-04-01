package vii_poo.vii_polimorfismo.sobreposicao.especies.aves;

import vii_poo.vii_polimorfismo.sobreposicao.especies.base.Animal;

public class Ave extends Animal {
    //Atributo
    private String corPena;
    //Método
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    //Implemento
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    //Getter e setter

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
