package vii_poo.i_classesobjetos.Garrafa;

public class Garrafa {
    int ml;
    boolean cheia;
    boolean tampada;
    boolean rotulo;
    String material;
    String bebida;

    void status(){
        System.out.println("O material da garrafa é "+ this.material);
        System.out.println("A bebida que está na garrafa é: " + this.bebida);
        System.out.println("Ela está com rotulo? " + this.rotulo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Tem quantos ml? " + this.ml);
    }

    void esvaziar(){
        System.out.println("...Esvaziando...");
        System.out.println("A garrafa está vazia");
        cheia = false;
    
    }

    void encher(){
        System.out.println("...Enchendo...");
        System.out.println("A garrafa está cheia");
        cheia = true;

    }
}
