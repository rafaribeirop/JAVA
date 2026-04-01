package vii_poo.vi_heranca.pt2;

public class Aluno extends Pessoa {
// Herança para diferença - tem atributos e métodos próprios além dos herdados

    private int numeroMatricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso");
    }
    // Getters e setters
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
