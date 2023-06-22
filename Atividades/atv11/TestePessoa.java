// Nome: Marco Antonio Nitsche - Turma: 2° TADS

package atv11;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marco Antonio");
        pessoa.setIdade(21);
        pessoa.setAltura(1.78);
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}