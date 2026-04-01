package vii_polimorfismo.sobreposicao;

import vii_polimorfismo.sobreposicao.especies.mamiferos.Cachorro;
import vii_polimorfismo.sobreposicao.especies.mamiferos.Canguru;
import vii_polimorfismo.sobreposicao.especies.mamiferos.Mamifero;

public class CriandoAnimais {
    public static void main(String[] args) {
        /*SOBREPOSIÇÃO
        * - mesma assinatura em  classes diferentes
        */
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        c.locomover();
        ca.locomover();
    }
}
