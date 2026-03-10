package visibilidadeObjeto.Caneta;

public class CanetaObjeto {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Comum";
        c1.cor = "Roxa";
        //c1.ponta = 0.7;
        c1.tinta = 90;
        //c1.tampada;
        c1.tampar();
        c1.status();
        

    }
   
} 
