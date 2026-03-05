package classesobjetos;

public class CanetaObjeto {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //Atributo
        c1.modelo = "Caneta Simples 001";
        c1.cor = "Azul";
        c1.ponta = 0.7;
        c1.tinta = 100;
        c1.tampada = true;
        //Método
        System.out.println("- Informações sobre a caneta - ");
        c1.Status();
    

    }
   
}
