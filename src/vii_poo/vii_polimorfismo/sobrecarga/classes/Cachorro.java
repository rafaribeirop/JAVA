package vii_poo.vii_polimorfismo.sobrecarga.classes;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("au au au!");
    }
    /*SOBRECARGA
     *Assinaturas diferentes - mesma classe
     */
    public void reagir(String frase){
        if (frase.equals("Comida") || frase.equals("Cheguei")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int minuto){
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else  {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, double peso){
        if (idade <5){
            if (peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10){
                System.out.println("Ignorar");
            } else {
                System.out.println("Latir");
            }

        }
    }

}
