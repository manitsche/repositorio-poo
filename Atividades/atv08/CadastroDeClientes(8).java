// Aluno: Marco Antonio Nitsche - Turma: 2° TADS

public class CadastroDeClientes {
    public static void main(String [] args) {
        
        Cliente c1 = new Cliente();

        c1.codigo = 1;
        c1.nome = "Marco Antonio Nitsche";
        c1.dataNascimento = "23/02/2002";
        c1.endereco = "Rua Sibipiruna";
        c1.cidade = "Cascavel";
        c1.cep = "85807-210";
        c1.estado = "PR";
        c1.email = "marcao@teste.com";
        c1.cartaoCredito = "11111111111";

        System.out.println("Código do cliente: " + c1.codigo);
        System.out.println("Nome: " + c1.nome);
        System.out.println("Data de Nascimento: " + c1.dataNascimento);
        System.out.println("Endereço: " + c1.endereco);
        System.out.println("Cidade: " + c1.cidade);
        System.out.println("Estado: " + c1.estado);
        System.out.println("CEP: " + c1.cep);
        System.out.println("E-mail: " + c1.email);
        System.out.println("Número do Cartão de Crédito: " + c1.cartaoCredito);
    }
}