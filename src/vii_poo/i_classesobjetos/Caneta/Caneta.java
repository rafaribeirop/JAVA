package i_classesobjetos.Caneta;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int tinta;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo); //.this é o nome do objeto que chamou este método
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Carga: " + this.tinta);
        System.out.println();
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("x ERROR x");
            System.out.println("Não é possível rabiscar com a caneta tampada.");
        } else {
            System.out.println("- RABISCO -");
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}

    

