import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private static int countFuncionario = 0;
    private static int countAtividade = 0;
    private int idfuncionario;
    private String cargo;
    private String salario;
    private boolean permissoesCompletas;
    private String resumo;
    private String historicoEmpregos;
    private String treinamentosConcluidos; 
    private String feedbacksRecebidos;
    private List<Atividade> listaAtividades;
    private List<String> associadosEmAtividades = new ArrayList<>();

    public Funcionario(String nome, String endereco, String telefone, String email, String login, String senha, String cargo, String salario) {
        super(nome, endereco, telefone, email, login, senha);
        this.idfuncionario = ++countFuncionario;
        this.cargo = cargo;
        this.salario = salario;
        this.resumo = "";
        this.historicoEmpregos = "";
        this.treinamentosConcluidos = "";
        this.feedbacksRecebidos = "";
        this.listaAtividades = new ArrayList<>();
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public boolean temPermissoesCompletas() {
        return permissoesCompletas;
    }

    public void setPermissoesCompletas(boolean permissoesCompletas) {
        this.permissoesCompletas = permissoesCompletas;
    }

    public String getResumo() {
        return resumo;
    }

    public String getHistoricoEmpregos() {
        return historicoEmpregos;
    }

    public void setHistoricoEmpregos(String historicoEmpregos) {
        this.historicoEmpregos = historicoEmpregos;
    }

    public String getTreinamentosConcluidos() {
        return treinamentosConcluidos;
    }

    public void setTreinamentosConcluidos(String treinamentosConcluidos) {
        this.treinamentosConcluidos = treinamentosConcluidos;
    }

    public String getFeedbacksRecebidos() {
        return feedbacksRecebidos;
    }

    public void setFeedbacksRecebidos(String feedbacksRecebidos) {
        this.feedbacksRecebidos = feedbacksRecebidos;
    }

    public void cadastrarAssociados(List<Associado> listaAssociados, Scanner scanner) {
        if (temPermissoesCompletas()) {
            int nextId = 1;
            if (!listaAssociados.isEmpty()) {
                nextId = listaAssociados.get(listaAssociados.size() - 1).getIdassociado() + 1;
            }
    
            System.out.println("\n##### MODULO DE CADASTRO DE ASSOCIADOS #####");
            System.out.print("Nome do associado: ");
            String nome = scanner.nextLine();
            System.out.print("Endereco do associado: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone do associado: ");
            String telefone = scanner.nextLine();
            System.out.print("E-mail do associado: ");
            String email = scanner.nextLine();
            System.out.print("Login do associado: ");
            String login = scanner.nextLine();
            System.out.print("Senha do associado: ");
            String senha = scanner.nextLine();
            System.out.print("Numero de dependentes: ");
            int dependentes = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Dados de pagamento: ");
            String dadosPagamento = scanner.nextLine();
    
            Associado novoAssociado = new Associado(nome, endereco, telefone, email, login, senha, dependentes, dadosPagamento);
            listaAssociados.add(novoAssociado);
            System.out.println("Associado cadastrado com sucesso!");
        }
    }    

    public void visualizarAssociados(List<Associado> listaAssociados) {
        System.out.println("\n##### MODULO DE LISTAGEM DE ASSOCIADOS #####");
        for (Associado associado : listaAssociados) {
            System.out.println("ID do associado: " + associado.getIdassociado());
            System.out.println("Nome: " + associado.getNome());
            System.out.println("Telefone: " + associado.getTelefone());
            System.out.println("Endereco: " + associado.getEndereco());
            System.out.println("E-mail: " + associado.getEmail());
            System.out.println("Login: " + associado.getLogin());
            System.out.println("Senha: " + associado.getSenha());
            System.out.println("Dependentes: " + associado.getDependentes());
            System.out.println("Dados de pagamento: " + associado.getDadosPagamento());
            System.out.println("--------------------------");
        }
    }

    public void atualizarDadosAssociados(List<Associado> listaAssociados, Scanner scanner) {
        if (this instanceof Funcionario) {
            System.out.println("\n##### MODULO DE ATUALIZACAO DE CADASTRO DE ASSOCIADOS #####");
            for (Associado associado : listaAssociados) {
                System.out.println("ID do associado: " + associado.getIdassociado());
                System.out.println("Nome: " + associado.getNome());
                System.out.println("Telefone: " + associado.getTelefone());
                System.out.println("Endereco: " + associado.getEndereco());
                System.out.println("E-mail: " + associado.getEmail());
                System.out.println("Login: " + associado.getLogin());
                System.out.println("Senha: " + associado.getSenha());
                System.out.println("Dependentes: " + associado.getDependentes());
                System.out.println("Dados de pagamento: " + associado.getDadosPagamento());
                System.out.println("--------------------------");
            }

            System.out.print("Informe o ID do cliente a ser atualizado: ");
            int idAssociado = scanner.nextInt();

            Associado associadoParaAtualizar = null;

            for (Associado associado : listaAssociados) {
                if (associado.getIdassociado() == idAssociado) {
                    associadoParaAtualizar = associado;
                    break;
                }
            }

            if (associadoParaAtualizar != null) {
                System.out.println("Escolha qual dado deseja atualizar:");
                System.out.println("1 - Nome");
                System.out.println("2 - Endereco");
                System.out.println("3 - Telefone");
                System.out.println("4 - E-mail");
                System.out.println("5 - Login");
                System.out.println("6 - Senha");
                System.out.println("7 - Numero de dependentes");
                System.out.println("8 - Dados de pagamento");
                System.out.println("9 - Voltar ao menu anterior");
                
                System.out.print("Escolha uma opcao: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Novo nome: ");
                        String novoNome = scanner.next();
                        associadoParaAtualizar.setNome(novoNome);
                        break;
                    case 2:
                        System.out.print("Novo endereço: ");
                        String novoEndereco = scanner.next();
                        associadoParaAtualizar.setEndereco(novoEndereco);
                        break;
                    case 3:
                        System.out.print("Novo telefone: ");
                        String novoTelefone = scanner.next();
                        associadoParaAtualizar.setTelefone(novoTelefone);
                        break;
                    case 4:
                        System.out.print("Novo e-mail: ");
                        String novoEmail = scanner.next();
                        associadoParaAtualizar.setEmail(novoEmail);
                        break;
                    case 5:
                        System.out.print("Novo login: ");
                        String novoLogin = scanner.next();
                        associadoParaAtualizar.setLogin(novoLogin);
                        break;
                    case 6:
                        System.out.print("Nova senha: ");
                        String novaSenha = scanner.next();
                        associadoParaAtualizar.setSenha(novaSenha);
                        break;
                    case 7:
                        System.out.print("Novo numero de dependentes: ");
                        int novoDependentes = scanner.nextInt();
                        associadoParaAtualizar.setDependentes(novoDependentes);
                        break;
                    case 8:
                        System.out.print("Novos dados de pagamento: ");
                        String novosDadosPagamento = scanner.next();
                        associadoParaAtualizar.setDadosPagamento(novosDadosPagamento);
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Opcao invalida. Escolha novamente.");
                }

                System.out.println("Dados do cliente atualizados com sucesso!");
            } else {
                System.out.println("Cliente não encontrado.");
            }
        } else {
            System.out.println("Acesso não autorizado.");
        }
    }

    public void criaResumoPessoal(Scanner scanner) {
        System.out.println("\n##### MODULO DE CRIACAO DE RESUMO PESSOAL #####");
        System.out.println("Insira o historico de empregos anteriores:");
        String historicoEmpregos = scanner.nextLine();
        this.setHistoricoEmpregos(historicoEmpregos);
        System.out.println("Insira os treinamentos concluidos:");
        String treinamentosConcluidos = scanner.nextLine();
        this.setTreinamentosConcluidos(treinamentosConcluidos);
        System.out.println("Insira os feedbacks recebidos:");
        String feedbacksRecebidos = scanner.nextLine();
        this.setFeedbacksRecebidos(feedbacksRecebidos);

        System.out.println("Resumo pessoal criado com sucesso!");
    }

    public boolean temResumo() {
        return !historicoEmpregos.isEmpty() || !treinamentosConcluidos.isEmpty() || !feedbacksRecebidos.isEmpty();
    }

    public void cadastrarAtividade(List<Atividade> listaAtividades, Scanner scanner) {
        if (temPermissoesCompletas()) {
            int nextId;
            if (!listaAtividades.isEmpty()) {
                nextId = listaAtividades.get(listaAtividades.size() - 1).getIdatividade() + 1;
            } else {
                nextId = 1;
            }
    
            System.out.println("\n##### MODULO DE CADASTRO DE ATIVIDADE #####");
            System.out.print("Nome da atividade: ");
            String nome = scanner.nextLine();
            System.out.print("Descricao da atividade: ");
            String descricao = scanner.nextLine();
            System.out.print("Faixa etaria indicada: ");
            String faixaEtaria = scanner.nextLine();
            System.out.print("Niveis de habilidade: ");
            String niveisHabilidade = scanner.nextLine();
            System.out.print("Turmas: ");
            String turmas = scanner.nextLine();
            System.out.print("Horarios (dias da semana e horario de inicio e termino): ");
            String horario = scanner.nextLine();
            System.out.print("Instrutores: ");
            String instrutores = scanner.nextLine();
    
            Atividade novaAtividade = new Atividade(nome, descricao, faixaEtaria, niveisHabilidade, turmas, horario, instrutores);
            listaAtividades.add(novaAtividade);
    
            System.out.println("Atividade cadastrada com sucesso!");
        }
    }

    public void cadastrarAssociadoEmAtividade(List<Associado> listaAssociados, List<Atividade> listaAtividades, Scanner scanner) {
        if (temPermissoesCompletas()) {
            System.out.println("\n##### MODULO DE CADASTRO DE ASSOCIADOS EM ATIVIDADE #####");
            System.out.println("Selecione a atividade onde deseja cadastrar o associado:");
            for (Atividade atividade : listaAtividades) {
                System.out.println(atividade.getIdatividade() + " - " + atividade.getNome());
            }
            System.out.print("Escolha o ID da atividade: ");
            int idAtividade = scanner.nextInt();
            scanner.nextLine();

            // Encontre a atividade pelo ID
            Atividade atividadeSelecionada = null;
            for (Atividade atividade : listaAtividades) {
                if (atividade.getIdatividade() == idAtividade) {
                    atividadeSelecionada = atividade;
                    break;
                }
            }

            if (atividadeSelecionada != null) {
                System.out.println("Selecione o associado que deseja cadastrar:");
                for (Associado associado : listaAssociados) {
                    System.out.println(associado.getIdassociado() + " - " + associado.getNome());
                }
                System.out.print("Escolha o ID do associado: ");
                int idAssociado = scanner.nextInt();
                scanner.nextLine();

                // Encontre o associado pelo ID
                Associado associadoSelecionado = null;
                for (Associado associado : listaAssociados) {
                    if (associado.getIdassociado() == idAssociado) {
                        associadoSelecionado = associado;
                        break;
                    }
                }

                if (associadoSelecionado != null) {
                    // Cadastre o associado na atividade
                    atividadeSelecionada.cadastrarAssociado(associadoSelecionado);

                    // Armazene o ID e nome do associado no vetor
                    String infoAssociado = idAssociado + " - " + associadoSelecionado.getNome();
                    associadosEmAtividades.add(infoAssociado);

                    System.out.println("Associado cadastrado na atividade com sucesso!");
                } else {
                    System.out.println("Associado não encontrado.");
                }
            } else {
                System.out.println("Atividade não encontrada.");
            }
        } else {
            System.out.println("Acesso não autorizado.");
        }
    }

    // Método para listar os associados em atividades
    public void listarAssociadosEmAtividades() {
        System.out.println("\n##### ASSOCIADOS EM ATIVIDADE #####");
        for (String infoAssociado : associadosEmAtividades) {
            System.out.println(infoAssociado);
        }
    }
    








































































































    public void menuFuncionario(List<Associado> listaAssociados, List<Atividade> listaAtividades, Scanner scanner) {
        boolean sair = false;
    
        while (!sair) {
            System.out.println("\n##### MENU INICIAL - FUNCIONARIO #####");
            System.out.println("1 - Cadastrar novo associado");
            System.out.println("2 - Visualizar listagem de associados");
            System.out.println("3 - Atualizar dados cadastrais de associados");
            System.out.println("4 - Criar resumo pessoal");
            System.out.println("5 - Cadastrar nova atividade");
            System.out.println("6 - Visualizar atividades cadastradas");
            System.out.println("7 - Cadastrar associado em atividade");
            System.out.println("8 - Voltar ao menu anterior");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    if (temPermissoesCompletas()) {
                        cadastrarAssociados(listaAssociados, scanner);
                    } else {
                        System.out.println("Acesso nao autorizado para cadastrar clientes.");
                    }
                    break;
                case 2:
                    visualizarAssociados(listaAssociados);
                    break;
                case 3:
                    if (temPermissoesCompletas()) {
                        atualizarDadosAssociados(listaAssociados, scanner);
                    } else {
                        System.out.println("Acesso nao autorizado para atualizar clientes.");
                    }
                    break;
                case 4:
                    criaResumoPessoal(scanner);
                    break;
                case 5:
                    if (temPermissoesCompletas()) {
                        cadastrarAtividade(listaAtividades, scanner);
                    } else {
                        System.out.println("Acesso nao autorizado para cadastrar atividades");
                    } 
                    break;
                case 6:
                    if (temPermissoesCompletas()) {
                        Atividade.visualizarAtividadesCadastradas(listaAtividades, true);
                    } else {
                        System.out.println("Acesso nao autorizado para visualizar atividades cadastradas");
                    }
                    break;
                case 7: 
                    if (temPermissoesCompletas()) {
                        cadastrarAssociadoEmAtividade(listaAssociados, listaAtividades, scanner);
                    } else {
                        System.out.println("Acesso nao autorizado para cadastrar associados em atividades");
                    }
                    break;
                case 8:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}