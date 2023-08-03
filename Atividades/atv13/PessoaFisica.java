public class PessoaFisica extends Pessoa {

    private String rg;

    public PessoaFisica(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }    

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}