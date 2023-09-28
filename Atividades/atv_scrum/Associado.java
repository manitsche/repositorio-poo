public class Associado extends Pessoa {
    private static int countAssociado = 0;
    private int idassociado;
    private int dependentes;
    private String dadosPagamento;
    
    public Associado(String nome, String endereco, String telefone, String email, String login, String senha, int dependentes, String dadosPagamento) {
        super(nome, endereco, telefone, email, login, senha);
        this.idassociado = ++countAssociado;
        this.dependentes = dependentes;
        this.dadosPagamento = dadosPagamento;
    }

    public int getIdassociado() {
        return idassociado;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public String getDadosPagamento() {
        return dadosPagamento;
    }

    public void setDadosPagamento(String dadosPagamento) {
        this.dadosPagamento = dadosPagamento;
    }
}