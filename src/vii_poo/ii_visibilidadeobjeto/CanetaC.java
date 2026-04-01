package ii_visibilidadeobjeto;

public class CanetaC {
    public String modelo;
    public String cor;
    private double ponta;
    protected int tinta;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo); //.this é o nome do objeto que chamou este método
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Carga: " + this.tinta);
        System.out.println();
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("x ERROR x");
            System.out.println("Não é possível rabiscar com a caneta tampada.");
        } else {
            System.out.println("- RABISCO -");
        }

    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}

    

