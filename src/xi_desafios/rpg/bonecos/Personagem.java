package xi_desafios.rpg.bonecos;

import xi_desafios.rpg.inventario.Inventario;
import xi_desafios.rpg.inventario.armas.Armas;
import xi_desafios.rpg.inventario.itensconsumiveis.ItensConsumiveis;

public class Personagem extends Bonecos{

    private Inventario inventario;
    private TipoPersonagem tipo;
    private Armas armaEquipada;


    public Personagem(String nome, int vida, boolean vivo, int vidaMaxima, int defesa, int defesaMaxima,
                      int magia, int nivel, TipoPersonagem tipo){
        super(nome, vida, vivo, vidaMaxima, defesa, defesaMaxima, magia, nivel);
        this.tipo = tipo;
    }

    public void atacar(Inimigo inimigo) {
       armaEquipada.ataque(this, inimigo);
    }

    public void usarItem(ItensConsumiveis item){
        item.usar(this);
    }

    public void equiparArma(Armas arma){
        this.armaEquipada = arma;
    }

    public void ganharExperiencia(){

    }

    //Getters e setters
    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }


    //Metodos Implemenatdos
    @Override
    public void ReceberDano(int dano) {

    }

    @Override
    public void subirNivel(int experiencia) {

    }

    @Override
    public void calcularDano(int dano, int vida) {

    }
}
