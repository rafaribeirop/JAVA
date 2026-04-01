package vii_poo.iii_metodosespeciais;

public class Caneta {
    // proteger os dados da classe
    private String modelo; 
    private double ponta;
    private boolean tampada;
    private String cor;
   public Caneta(String m, String c, double p){  // metodo construtor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.getTampar();
    }
    public boolean getTampar(){
        return tampada = true;
    }

    public boolean getDestampar (){
        return tampada = false;
    }

    public String getModelo(){ //metodo get - consultar algum valor
        return this.modelo;
    }

    public void setModelo(String m){ //metodo set - adicionar ou definir valor
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }

    public void setPonta(double p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);

    }

    
}
