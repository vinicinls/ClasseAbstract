package entities;

public class PessoaJuridica extends Pessoa{

    private int numerosFuncionarios;

    public PessoaJuridica(){

    }

    public PessoaJuridica(Double renda, String nome, int numerosFuncionarios) {
        super(renda, nome);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public int getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(int numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    @Override
    public Double tax(){
        if (numerosFuncionarios > 10){
            return getRenda() * 0.14;
        }
        else {
           return getRenda() * 0.16;
        }
    }

}
