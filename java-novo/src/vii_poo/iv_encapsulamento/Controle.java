package iv_encapsulamento;

public class Controle implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menu;

    // Construtor
    public Controle(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    //Getters e Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

     public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
     public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    // Métodos Abstratos (implementados de Controlador)
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
       this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        this.setMenu(true);
        System.out.println("==== MENU ====");
        System.out.println("Está ligado?: " + this.isLigado());
        System.out.println("Está tocando?: "+this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 1; i <= getVolume(); i+= 10){
            System.out.print(" | ");
        }
    }
       
    @Override
    public void fecharMenu() {
        this.setMenu(false);
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            setVolume(getVolume() + 5);
        }
     
    }

    @Override
    public void menosVolume() {
       if (this.isLigado()) {
           this.setVolume(getVolume() - 5);
       }
    }


    @Override
    public void ligarMudo() {
       if (this.isLigado() && getVolume()>0) {
           this.setVolume(0);
       }
    }

    @Override
    public void desligarMudo() {
       if (this.isLigado() && getVolume() == 0){
        this.setVolume(50);
       }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            setTocando(true);
        }
      
    }

    @Override
    public void pause() {
       if (this.isLigado() && this.isTocando()) {
           setTocando(false);
       }
    }
}
