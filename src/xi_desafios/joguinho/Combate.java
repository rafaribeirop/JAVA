package xi_desafios.joguinho;

public class Combate {
    //Atributos
    private int vida;
    private int vidaBoss;
    private int dano;
    private int danoRecebido;
    private String loot;

    // Método construtor
    public Combate(int vida, int vidaBoss) {
        this.vida = vida;
        this.vidaBoss = vidaBoss;
    }

    //Mostrar a vida do seu personagem e do boss
    public void exibirHud(int vida,int vidaBoss){
        System.out.println("-----------------------------");
        System.out.println("| Sua vida: "+ vida + " | Boss: "+ vidaBoss + " |");
        System.out.println("-----------------------------");
    }

    // Gera um número aleatorio e um loot correspondente
    public String sortearLoot(){
        String loot;

        int sorteio = 1 +(int) (Math.random()*3);

        if (sorteio == 1) {
            loot = "Espada";
        } else if (sorteio == 2) {
            loot = "Poção de cura";
        } else if (sorteio == 3) {
            loot = "Moedas de ouro";
        } else{
            loot = "Nada";
        }

        return loot;
    }

    //Calcular dano do personagem
    public int calcularDano(){
        int danoBase = 50;
        int chanceEsquiva = 1 + (int)(Math.random()*10);
        int chanceCritico = 1 + (int)(Math.random()*30);
        int danoTotal;

        if (chanceEsquiva <= 10){
        //chance de esquiva do inimigo
            System.out.println("O inimigo esquivou");
            danoTotal = danoBase * 0;
            System.out.println(danoTotal + " de dano");
        } else if (chanceCritico <= 30) {
        //Chance de ataque crítico
            System.out.println("Seu personagem esquivou!");
            danoTotal = (int) (danoBase * 1.5);
            System.out.println(danoTotal + " de dano");
        } else {
        //Dano base
            danoTotal = danoBase;
            System.out.println(danoTotal + " de dano");
        }

       return danoTotal;
    }

    // Calcular dano recebido
    public int calcularDanoRecebido(){

        int danoBase = 30;
        int chanceEsquiva = 1 + (int)(Math.random()*10);
        int chanceCritico = 1 + (int)(Math.random()*30);
        int danoTotal;

        if (chanceEsquiva <= 10){
        //Chance do seu personagem esquivar
            System.out.println("Seu personagem esquivou!");
            danoTotal = danoBase * 0;
        } else if (chanceCritico <= 30) {
        //Chance do inimigo dar ataque crítico
            System.out.println("Seu personagem esquivou!");
            danoTotal = (int) (danoBase * 1.5);
            System.out.println("Você recebeu" + danoTotal + " de dano");
        } else {
            danoTotal = danoBase;
            System.out.println("Você "+danoTotal + " de dano");
        }
        return danoTotal;
    }


    // Getters e setters
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVidaBoss() {
        return vidaBoss;
    }
    public void setVidaBoss(int vidaBoss) {
        this.vidaBoss = vidaBoss;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getDanoRecebido() {
        return danoRecebido;
    }
    public void setDanoRecebido(int danoRecebido) {
        this.danoRecebido = danoRecebido;
    }
    public String getLoot() {
        return loot;
    }
    public void setLoot(String loot) {
        this.loot = loot;
    }

}
