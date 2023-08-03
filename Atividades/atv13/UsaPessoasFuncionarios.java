public class UsaPessoasFuncionarios {
    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica("Roberto Carlos Nitsche", "111.111.111-11");
        System.out.println("Pessoa fisica:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("RG: " + pf.getRg());
        System.out.println();

        PessoaJuridica pj = new PessoaJuridica("Tecinco Tecnologia", "22.222.222/2222-22");
        System.out.println("Pessoa juridica:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println();

        Funcionario f = new Funcionario("Marco Antonio Nitsche", "333.333.333-33", "4444444444");
        System.out.println("Funcionario:");
        System.out.println("Nome: " + f.getNome());
        System.out.println("CNPJ: " + f.getRg());
        System.out.println("Cartao: " + f.getCartao());

        // Executar primeiro o comando: javac UsaPessoasFuncionarios.java

        // E depois o comando: java UsaPessoasFuncionarios.java, com todos os arquivos na mesma pasta
    }
}