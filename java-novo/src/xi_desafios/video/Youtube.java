package xi_desafios.video;

public class Youtube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("JAVA");
        v[1] = new Video("CSS");
        v[2] = new Video("HTML5");
        Inscrito i[] = new Inscrito[2];
        i[0] = new Inscrito("Rafa", 18, "rafa@gmail.com");
        i[1] = new Inscrito("Biel", 25, "biel@gmail.com");

        Visualizacao vizu[] = new Visualizacao[3];
        vizu[0] = new Visualizacao(i[0], v[0]);
        vizu[0].avaliar(8);
        vizu[0].curtir();
        System.out.println(vizu[0].toString());

    }
}
