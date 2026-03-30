package vii_poo.v_relacionamentoclasses;
import java.util.Random;
public class Luta {
    Random rand = new Random();
    //Tipo abstrato de dados
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        // Lutadores diferentes de mesma categoria
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            aprovada = true;
           this.desafiante = l1;
           this.desafiado = l2;
        } else {
            aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        if(aprovada) {
            this.desafiante.apresentar();
            System.out.println("------");
            this.desafiado.apresentar();
            int vencedor = rand.nextInt(2);
            System.out.println("========== Resultado da luta ==========");
                switch (vencedor) {
                case 0:
                    System.out.println("EMPATE");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiante.getNome() + " é o vencedor");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiado.getNome() + " é o vencedor");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                }
            System.out.println("=======================================");
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
