package xi_desafios.rpg.inventario;
import xi_desafios.rpg.inventario.itensconsumiveis.ItensConsumiveis;

import java.util.ArrayList;
public class Inventario {

    private ArrayList<ItensConsumiveis> inventario;
    private int limiteCapacidade;


    public Inventario(int limiteCapacidade) {
        this.inventario = new ArrayList();
        this.limiteCapacidade = limiteCapacidade;
    }

    public void addItens(ItensConsumiveis item) {
        inventario.add(item);
    }

    public void removerItens(ItensConsumiveis item) {
        inventario.remove(item);
    }

}

