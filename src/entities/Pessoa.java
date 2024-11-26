package entities;

public abstract class Pessoa {
    private Double renda;
    private String nome;

    public Pessoa(){

    }

    public Pessoa(String nome, Double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public Pessoa(Double renda, String nome) {
        this.renda = renda;
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double tax();



}
