import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        List<Associado> listaAssociados = new ArrayList<>();
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        List<Gerente> listaGerentes = new ArrayList<>();
        List<Atividade> listaAtividades = new ArrayList<>();
        Funcionario funcionarioAtual = null;

        Associado associado1 = new Associado("Associado 1",  "Rua A, 1", "(45) 99999-1111", "associado1@clube.com", "a1", "a1", 1, "a" );
        listaAssociados.add(associado1);

        Funcionario funcionario1 = new Funcionario("Funcionario 1", "Rua B, 2", "(45) 99999-2222", "funcionario1@clube.com", "f1", "f1", "Cadastro", " R$ 1.200,00");
        funcionario1.setPermissoesCompletas(true);
        listaFuncionarios.add(funcionario1);

        Gerente gerente1 = new Gerente("Gerente 1", "Rua C, 3", "(45) 99999-3333", "gerente1@clube.com", "g1", "g1", "R$ 2.400,00");
        listaGerentes.add(gerente1);

        Atividade atividade1 = new Atividade("Natacao", "Natacao para todos", "3 a 65 anos", "Todos", "Turma 1", "07 as 08, | 14 as 15 | 18 as 19", "Professora Flavia");
        listaAtividades.add(0, atividade1);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n##### MENU INICIAL #####");
            System.out.println("1 - Login como Associado");
            System.out.println("2 - Login como Funcionario");
            System.out.println("3 - Login como Gerente");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu login como Associado: ");
                    String loginAssociado = scanner.next();
                    System.out.print("Digite sua senha como Associado: ");
                    String senhaAssociado = scanner.next();
                    Associado associadoAutenticado = null;

                    for (Associado associado : listaAssociados) {
                        if (associado.getLogin().equals(loginAssociado)&& associado.getSenha().equals(senhaAssociado)) {
                            associadoAutenticado = associado;
                            break;
                        }
                    }

                    if (associadoAutenticado != null) {
                        associadoAutenticado.menuAssociado(listaAtividades, scanner);
                    } else {
                        System.out.println("Login ou senha de Associado incorretos. Acesso negado.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o login do funcionario: ");
                    String loginFuncionario = scanner.next();
                    System.out.print("Digite sua senha do funcionario: ");
                    String senhaFuncionario = scanner.next();
                    scanner.nextLine();
                    Funcionario funcionarioAutenticado = null;

                    for (Funcionario funcionario : listaFuncionarios) {
                        if (funcionario.getLogin().equals(loginFuncionario) && funcionario.getSenha().equals(senhaFuncionario)) {
                            funcionarioAutenticado = funcionario;
                            break;
                        }
                    }

                    if (funcionarioAutenticado != null) {
                        funcionarioAutenticado.menuFuncionario(listaAssociados, listaAtividades, scanner);
                    } else {
                        System.out.println("Login ou senha do funcionario incorretos. Acesso negado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o login do gerente: ");
                    String loginGerente = scanner.next();
                    System.out.print("Digite sua senha do gerente: ");
                    String senhaGerente = scanner.next();
                    scanner.nextLine();
                    Gerente gerenteAutenticado = null;

                    for (Gerente gerente : listaGerentes) {
                        if (gerente.getLogin().equals(loginGerente) && gerente.getSenha().equals(senhaGerente)) {
                            gerenteAutenticado = gerente;
                            break;
                        }
                    }

                    if (gerenteAutenticado != null) {
                        gerenteAutenticado.menuGerente(listaAssociados, listaFuncionarios, listaAtividades, scanner);
                    } else {
                        System.out.println("Login ou senha do gerente incorretos. Acesso negado.");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcao invalida. Escolha novamente.");
            }
        }
    }
}