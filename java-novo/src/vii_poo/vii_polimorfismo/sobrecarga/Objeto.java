package vii_polimorfismo.sobrecarga;

import vii_polimorfismo.sobrecarga.classes.Cachorro;

public class Objeto {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Comida");
        c.reagir(19,30);
        c.reagir(true);
        c.reagir(3,8.0);
    }
}
