package xi_desafios.video;

public class Visualizacao {
    private Inscrito espectador;
    private Video filme;

    public Visualizacao(Inscrito espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar() {
        this.filme.setAvaliacoes(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacoes(nota);
    }

    public void avaliar(double porcentagem) {
        int tot = 0;
        if (porcentagem <= 20) {
            tot = 3;
        } else if (porcentagem <= 50) {
            tot = 5;
        } else if (porcentagem <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacoes(tot);
    }
    public void curtir(){
       this.filme.like();
    }
    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Inscrito getEspectador() {
        return espectador;
    }

    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }
}
