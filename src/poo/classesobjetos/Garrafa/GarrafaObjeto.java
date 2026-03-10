package classesobjetos.Garrafa;

public class GarrafaObjeto {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        g1.material = "Plástico";
        g1.ml = 200;
        g1.rotulo = true;
        g1.cheia = true;
        g1.bebida = "Água";
        g1.status();

        if (!g1.cheia){ 
            g1.encher();
        } else {
            g1.esvaziar();
        }

        
    }
  
}
