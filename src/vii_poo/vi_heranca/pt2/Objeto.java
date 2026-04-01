package vi_heranca.pt2;

public class Objeto {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Sonic");
        v1.setSexo("M");
        v1.setIdade(14);
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Amy");
        a1.setSexo("F");
        a1.setIdade(13);
        a1.setCurso("ADS");
        a1.setNumeroMatricula(11234);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Bob");
        b1.setSexo("M");
        b1.setIdade(14);
        b1.setCurso("CC");
        b1.setNumeroMatricula(7878);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
}
