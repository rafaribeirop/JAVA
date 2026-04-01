package xi_desafios.video;

public class Video implements AcoesVideo {

    private String titulo;
    int avaliacoes;
    private int like;
    private int views;
    private boolean reproduzindo;

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacoes=" + avaliacoes +
                ", like=" + like +
                ", views=" + views +
                ", reproduzindo=" + reproduzindo +
                '}';
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 1;
        this.like = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println("Seu vídeo está sendo reproduzido");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
         System.out.println("Seu vídeo está pausado");
    }

    @Override
    public void like() {
        this.like++;
        System.out.println("Número de curtidas: " + like);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        int nova;
        nova = (this.avaliacoes + avaliacoes) / this.views;
        this.avaliacoes = nova;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
