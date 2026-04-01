package vii_poo.vii_polimorfismo.sobreposicao.especies.mamiferos;

public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Enterrando Osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando Rabo");

    }

    @Override
    public void emitirSom(){
        System.out.println("Latir");
    }
}
