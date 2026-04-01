package xi_desafios.video;

public class Inscrito extends Pessoa{

    private String email;
    private int totAssistido;

    public Inscrito(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        this.totAssistido++;
        System.out.println("Assistido");
    }

    @Override
    public String toString() {
        return "Inscrito{" + super.toString() +
                "\nemail='" + email + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public void ganharExperiencia() {
        this.setExperiencia(this.getExperiencia()+1);
        System.out.println("N de experiencias: " + this.getExperiencia());
    }
}
