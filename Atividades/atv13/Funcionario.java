public class Funcionario extends PessoaFisica {

    private String cartao;

    public Funcionario(String nome, String rg, String cartao) {
        super(nome, rg);
        this.cartao = cartao;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}