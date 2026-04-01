package vii_poo.vi_heranca.pt2;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){

    }
    @Override
    public void pagarMensalidade(){
        System.out.println("70% de bolsa adicionada");
        System.out.println("Mensalidade paga com sucesso");
    }
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
