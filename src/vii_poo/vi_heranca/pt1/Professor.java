package vii_poo.vi_heranca.pt1;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " +  this.getSexo());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Especialidade: " + this.getEspecialidade());
    }
    // Getters e setters
    void receberAumento(double salario){
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
