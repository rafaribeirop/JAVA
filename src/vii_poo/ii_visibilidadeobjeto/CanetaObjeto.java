package ii_visibilidadeobjeto;

public class CanetaObjeto {
    public static void main(String[] args) {
        CanetaC c1 = new CanetaC();
        c1.modelo = "Comum";
        c1.cor = "Roxa";
        //c1.ponta = 0.7;
        c1.tinta = 90;
        //c1.tampada;
        c1.tampar();
        c1.status();
        

    }
   
} 
