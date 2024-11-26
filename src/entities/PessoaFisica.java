package entities;

public class PessoaFisica extends Pessoa{

    private double gastosSaude;

    public PessoaFisica(){

    }

    public PessoaFisica(Double renda, String nome, double gastosSaude) {
        super(renda, nome);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double tax(){
       if (getRenda() < 20000.0){
           return getRenda() * 0.15 - gastosSaude * 0.5;
       }else {
           return getRenda() * 0.25 - gastosSaude * 0.5;
       }
    }

}
