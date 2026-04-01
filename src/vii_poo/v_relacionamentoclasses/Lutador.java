package vii_poo.v_relacionamentoclasses;


public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade;
    private double altura, peso;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void status(){
        System.out.println("Nome: " + this.getNome() + " peso " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura()+ "m");
        System.out.println("Peso: " + this.getPeso()+  "kg");
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();

    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso < 52.2){
            this.categoria = "INVÁLIDO";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9){
            this.categoria = "Médio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
