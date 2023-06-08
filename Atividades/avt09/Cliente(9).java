// Aluno: Marco Antonio Nitsche - Turma: 2° TADS

public class Cliente {
    public int codigo;
    public String nome;
    public String dataNascimento;
    public String endereco;
    public String cidade;
    public String estado;
    public String cep;
    public String email;
    public String cartaoCredito;

    public void exibirInfoCliente() {
        System.out.println("Código do cliente: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("E-mail: " + email);
        System.out.println("Número do Cartão de Crédito: " + cartaoCredito);
    }
}