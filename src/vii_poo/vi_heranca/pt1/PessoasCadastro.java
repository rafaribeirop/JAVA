package vii_poo.vi_heranca.pt1;

public class PessoasCadastro {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        a1.setNome("Rafa");
        a1.setIdade(18);
        a1.setSexo("Fem");
        a1.setCurso("Ciência da Computação");
        a1.setNumeroMatricula(123456);
        System.out.println(a1.toString());



    }
}
