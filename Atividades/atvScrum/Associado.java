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
    private int qtdFaltas;
    private List<Associado> associadosInscritos;
    
    public Associado(String nome, String endereco, String telefone, String email, String login, String senha, int dependentes, String dadosPagamento) {
        super(nome, endereco, telefone, email, login, senha);
        this.idassociado = ++countAssociado;
        this.dependentes = dependentes;
        this.dadosPagamento = dadosPagamento;
        this.atividadesInscritas = new ArrayList<>();
        this.qtdFaltas = 0;
        this.associadosInscritos = new ArrayList<>();
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

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void incrementarFalta() {
        qtdFaltas++;
    }

    public void visualizarFaltas() {
        System.out.println();
        System.out.println("##### MODULO DE VISUALIZACAO DE FALTAS #####");
        System.out.println("Numero de faltas: " + qtdFaltas);
    }
    
    public void listarAtividadesRegistradas(List<Atividade> listaAtividades) {
        System.out.println("\n##### ATIVIDADES REGISTRADAS #####");
        for (int idAtividade : atividadesInscritas) {
            for (Atividade atividade : listaAtividades) {
                if (atividade.getIdatividade() == idAtividade) {
                    System.out.println("ID da atividade: " + atividade.getIdatividade());
                    System.out.println("Nome: " + atividade.getNome());
                    System.out.println("--------------------------");
                }
            }
        }
    }

    public void registrarFalta(Atividade atividade) {
        if (atividade != null) {
            this.incrementarFalta();
            System.out.println("Falta registrada com sucesso para o associado na atividade");
        } else {
            System.out.println("Atividade nao encontrada.");
        }
    }    
    
    public void menuAssociado(List<Atividade> listaAtividades, Scanner scanner) {
        boolean sair = false;
    
        while (!sair) {
            System.out.println("\n##### MENU INICIAL - ASSOCIADO #####");
            System.out.println("1 - Visualizar atividades cadastradas");
            System.out.println("2 - Visualizar numero de faltas");
            System.out.println("3 - Voltar ao menu anterior");
            System.out.println();
            Notificacao.visualizarNotificacoes(1, false);
            System.out.println();
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n##### MODULO DE LISTAGEM DE ATIVIDADES #####");
                    Atividade.visualizarAtividadesCadastradas(listaAtividades, false);
                    break;
                case 2:
                    visualizarFaltas();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}