import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Associado extends Pessoa {
    private static int countAssociado = 0;
    private int idassociado;
    private int dependentes;
    private String dadosPagamento;
    private List<Atividade> listaAtividades;
    private List<Integer> atividadesInscritas;
    
    public Associado(String nome, String endereco, String telefone, String email, String login, String senha, int dependentes, String dadosPagamento) {
        super(nome, endereco, telefone, email, login, senha);
        this.idassociado = ++countAssociado;
        this.dependentes = dependentes;
        this.dadosPagamento = dadosPagamento;
        this.atividadesInscritas = new ArrayList<>();
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

    public List<Integer> getAtividadesInscritas() {
        return atividadesInscritas;
    }

    public void inscreverEmAtividade(int idAtividade) {
        atividadesInscritas.add(idAtividade);
    }

    public void menuAssociado(List<Atividade> listaAtividades, Scanner scanner) {
        boolean sair = false;
    
        while (!sair) {
            System.out.println("\n##### MENU INICIAL - ASSOCIADO #####");
            System.out.println("1 - Visualizar atividades cadastradas");
            System.out.println("2 - Visualizar numero de faltas");
            System.out.println("3 - Configurar notificacoes");
            System.out.println("4 - Voltar ao menu anterior");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    Atividade.visualizarAtividadesCadastradas(listaAtividades, false);
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}