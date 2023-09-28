import java.util.List;
import java.util.Scanner;

public class Gerente extends Pessoa {
    private static int countGerente = 0;
    private int idGerente;
    private String salario;
    private boolean permissoesCompletas;

    public Gerente(String nome, String endereco, String telefone, String email, String login, String senha, String salario) {
        super(nome, endereco, telefone, email, login, senha);
        this.idGerente = ++countGerente;
        this.salario = salario;
        this.permissoesCompletas = true;
    }

    public int getIdGerente() {
        return idGerente;
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

    public void cadastrarFuncionario(List<Funcionario> listaFuncionarios, Scanner scanner) {
        if (temPermissoesCompletas()) {
            System.out.println("\n##### MODULO DE CADASTRO DE FUNCIONARIO #####");
            int nextId = 1;
            if (!listaFuncionarios.isEmpty()) {
                nextId = listaFuncionarios.get(listaFuncionarios.size() - 1).getIdfuncionario() + 1;
            }
    
            System.out.print("Nome do funcionario: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Endereco do funcionario: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone do funcionario: ");
            String telefone = scanner.nextLine();
            System.out.print("E-mail do funcionario: ");
            String email = scanner.nextLine();
            System.out.print("Cargo do funcionario: ");
            String cargo = scanner.nextLine();
            System.out.print("Salario do funcionario: ");
            String salario = scanner.nextLine();
            System.out.print("Login do funcionario: ");
            String login = scanner.nextLine();
            System.out.print("Senha do funcionario: ");
            String senha = scanner.nextLine();
    
            Funcionario novoFuncionario = new Funcionario(nome, telefone, endereco, email, login, senha, cargo, salario);
            novoFuncionario.setPermissoesCompletas(true);
            listaFuncionarios.add(novoFuncionario);
    
            this.definirPermissoesDeAcesso(novoFuncionario, cargo);
    
            System.out.println("Funcionario cadastrado com sucesso!");
        } else {
            System.out.println("Acesso não autorizado para cadastrar funcionarios.");
        }
    }
    

    public void listarFuncionarios(List<Funcionario> listaFuncionarios) {
        System.out.println("##### MODULO DE LISTAGEM DE FUNCIONARIOS #####");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("ID do funcionário: " + funcionario.getIdfuncionario());
            System.out.println("Nome: " + funcionario.getNome());

            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("--------------------------");
        }
    }

    public void definirPermissoesDeAcesso(Funcionario funcionario, String nivelAcesso) {
        if (funcionario.getCargo().equals("Cadastro")) {
            funcionario.setPermissoesCompletas(true);
        } else if (funcionario.getCargo().equals("Atendente")) {
            funcionario.setPermissoesCompletas(false);
        } else if (funcionario.getCargo().equals("Lanchonete")) {
            funcionario.setPermissoesCompletas(false);
        } else {
            funcionario.setPermissoesCompletas(false);
        }
    }
    
    public void visualizarResumosFuncionarios(List<Funcionario> listaFuncionarios) {
        System.out.println("\n##### MODULO DE LISTAGEM DE RESUMOS DE FUNCIONARIOS #####");
        
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("ID do funcionario: " + funcionario.getIdfuncionario());
            System.out.println("Nome do funcionario: " + funcionario.getNome());
            
            if (funcionario.temResumo()) {
                System.out.println("Historico de empregos: " + funcionario.getHistoricoEmpregos());
                System.out.println("Treinamentos concluidos: " + funcionario.getTreinamentosConcluidos());
                System.out.println("Feedbacks recebidos: " + funcionario.getFeedbacksRecebidos());
            } else {
                System.out.println("Este funcionario ainda não possui um resumo.");
            }
    
            System.out.println("--------------------------");
        }
    }

    public void menuGerente(List<Associado> listaAssociados, List<Funcionario> listaFuncionarios, Scanner scanner) {
        while (true) {
            System.out.println("\n##### MENU INICIAL - GERENTE #####");
            System.out.println("1 - Cadastrar novo funcionario");
            System.out.println("2 - Definir permissoes de acesso a um funcionario");
            System.out.println("3 - Visualizar resumos de funcionarios");
            System.out.println("4 - Voltar ao menu anterior");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:
                    if (temPermissoesCompletas()) {
                        cadastrarFuncionario(listaFuncionarios, scanner);
                    } else {
                        System.out.println("Acesso não autorizado para cadastrar funcionarios.");
                    }
                    break;
                case 2:
                    if (temPermissoesCompletas()) {
                        for (Funcionario funcionario : listaFuncionarios) {
                            System.out.println("ID do funcionario: " + funcionario.getIdfuncionario());
                            System.out.println("Nome: " + funcionario.getNome());
                            System.out.println("Cargo: " + funcionario.getCargo());
                            System.out.println("--------------------------");
                        }

                        System.out.print("Informe o ID do funcionario para definir permissoes: ");
                        int idFuncionario = scanner.nextInt();
                        Funcionario funcionarioParaDefinirPermissoes = null;

                        for (Funcionario funcionario : listaFuncionarios) {
                            if (funcionario.getIdfuncionario() == idFuncionario) {
                                funcionarioParaDefinirPermissoes = funcionario;
                                break;
                            }
                        }

                        if (funcionarioParaDefinirPermissoes != null) {
                            System.out.print("Escolha o nivel de acesso (Cadastro / Atendente / Lanchonete): ");
                            String nivelAcesso = scanner.next();
                            this.definirPermissoesDeAcesso(funcionarioParaDefinirPermissoes, nivelAcesso);
                            System.out.println("Permissões de acesso definidas com sucesso!");
                        } else {
                            System.out.println("Funcionario não encontrado.");
                        }
                    } else {
                        System.out.println("Acesso não autorizado para definir permissões de acesso.");
                    }
                    break;
                case 3:
                    visualizarResumosFuncionarios(listaFuncionarios);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}