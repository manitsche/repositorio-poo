import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notificacao {
    private static int countNotificacao = 0;
    private int idNotificacao;
    private String mensagem;
    private static List<Notificacao> notificacoes = new ArrayList<>();

    public Notificacao(String mensagem) {
        this.idNotificacao = ++countNotificacao;
        this.mensagem = mensagem;
    }

    public int getIdnotificacao() {
        return idNotificacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static void adicionarNotificacao(String mensagem) {
        Notificacao novaNotificacao = new Notificacao(mensagem);
        notificacoes.add(novaNotificacao);
    }
    
    public static void removerNotificacao(int id) {
        System.out.println("\n##### NOTIFICACOES #####");
        for (Notificacao notificacao : notificacoes) {
            System.out.println("ID: " + notificacao.getIdnotificacao());
            System.out.println("Mensagem: " + notificacao.getMensagem());
            System.out.println("--------------------------");
        }
    
        Notificacao notificacaoParaRemover = null;
    
        for (Notificacao notificacao : notificacoes) {
            if (notificacao.getIdnotificacao() == id) {
                notificacaoParaRemover = notificacao;
                break;
            }
        }
    
        if (notificacaoParaRemover != null) {
            notificacoes.remove(notificacaoParaRemover);
            System.out.println("Notificacao removida com sucesso!");
        }
    }    

    public static void visualizarNotificacoes(int tipoUsuario, boolean mostrarId) {
        if (notificacoes.isEmpty()) {
            System.out.println("\n##### NOTIFICACOES #####");
            System.out.println("Nenhuma notificacao para ser exibida");
        } else {
            System.out.println("##### NOTIFICACOES #####");
            for (Notificacao notificacao : notificacoes) {
                if (tipoUsuario == 1) {
                    System.out.println("Mensagem: " + notificacao.getMensagem());
                    System.out.println("--------------------------");
                } else {
                    if (mostrarId) {
                        System.out.println("ID da notificacao: " + notificacao.getIdnotificacao());
                    }
                    System.out.println("Mensagem: " + notificacao.getMensagem());
                    System.out.println("--------------------------");
                }
            }
        }
    }

    public static void configurarNotificacoes(Scanner scanner) {
        while (true) {
            System.out.println("\n##### CONFIGURAR NOTIFICACOES #####");
            System.out.println("1 - Adicionar notificacao");
            System.out.println("2 - Remover notificacao");
            System.out.println("3 - Voltar ao menu anterior");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a notificacao:");
                    String notificacao = scanner.nextLine();
                    adicionarNotificacao(notificacao);
                    System.out.println("Notificacao adicionada com sucesso!");
                    break;
                case 2:
                    visualizarNotificacoes(2, true);
                    if (!notificacoes.isEmpty()) {
                        System.out.print("Digite o ID da notificacao que deseja remover: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        removerNotificacao(id);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}