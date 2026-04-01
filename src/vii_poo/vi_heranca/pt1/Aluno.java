package vi_heranca.pt1;

public class Aluno extends Pessoa {
    private int numeroMatricula;
    private String curso;

    void status(){
        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("Idade do aluno: " + this.getIdade());
        System.out.println("Sexo do aluno: " + this.getSexo());
        System.out.println("Matricula do aluno: " + this.getNumeroMatricula());
        System.out.println("Curso do aluno: " + this.getCurso());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //Getters e setters
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

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
