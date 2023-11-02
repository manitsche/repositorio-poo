import java.util.ArrayList;
import java.util.List;

public class Atividade {
    private static int countAtividade = 0;
    private int idatividade;
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String niveisHabilidade;
    private List<String> turmas;
    private String horario;
    private String instrutores;
    private List<Associado> associados; 
    List<Associado> associadosNaAtividade = new ArrayList<>();
    private List<Associado> associadosInscritos = new ArrayList<>();

    public Atividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade, String turma, String horario, String instrutores) {
        this.idatividade = ++countAtividade;
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
        this.turmas = new ArrayList<>();
        this.turmas.add(turma);
        this.horario = horario;
        this.instrutores = instrutores;
        this.associados = new ArrayList<>();
    }

    public int getIdatividade() {
        return idatividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getNiveisHabilidade() {
        return niveisHabilidade;
    }

    public void setNiveisHabilidade(String niveisHabilidade) {
        this.niveisHabilidade = niveisHabilidade;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(String instrutores) {
        this.instrutores = instrutores;
    }

    public void cadastrarAssociado(Associado associado) {
        if (!associados.contains(associado)) {
            associados.add(associado);
        }
    }

    public void listarAssociados() {
        System.out.println("\nAssociados cadastrados nesta atividade");
        for (Associado associado : associados) {
            System.out.println("ID do associado: " + associado.getIdassociado());
            System.out.println("Nome: " + associado.getNome());
            System.out.println("-------------------------------"); 
        } 
    }

    public void cadastrarTurma(String novaTurma) {
        this.turmas.add(novaTurma);
        System.out.println("Turma cadastrada com sucesso!");
    }

    public static void visualizarAtividadesCadastradas(List<Atividade> listaAtividades, boolean chamadoPorFuncionario) {
        for (Atividade atividade : listaAtividades) {
            System.out.println("ID da atividade: " + atividade.getIdatividade());
            System.out.println("Nome: " + atividade.getNome());
            System.out.println("Descricao: " + atividade.getDescricao());
            System.out.println("Faixa etaria indicada: " + atividade.getFaixaEtaria());
            System.out.println("Niveis de habilidade: " + atividade.getNiveisHabilidade());
            System.out.println("Turmas: " + atividade.getTurmas());
            System.out.println("Horarios: " + atividade.getHorario());
            System.out.println("-------------------------------");

            if (chamadoPorFuncionario) {
                atividade.listarAssociados();
            }   
        }
    }

    public void inscreverAssociado(Associado associado) {
        associadosInscritos.add(associado);
    }

    public boolean associadoEstaInscrito(Associado associado) {
        return associadosInscritos.contains(associado);
    }

}