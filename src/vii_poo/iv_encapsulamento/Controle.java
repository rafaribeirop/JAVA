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
        System.out.println(this.isLigado());
        System.out.println(this.isTocando());
        System.out.println(this.getVolume());
        for (int i = 0; i <= getVolume(); i+= 10){
            System.out.println(" | ");
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
       this.setVolume(getVolume() - 5);
    }

    @Override
    public void ligarMudo() {
       
    }

    @Override
    public void desligarMudo() {
       
    }

    @Override
    public void play() {
      
    }

    @Override
    public void pause() {
       
    }
}
