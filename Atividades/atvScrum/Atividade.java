import java.util.List;

public class Atividade {
    private static int countAtividade = 0;
    private int idatividade;
    private String nome;
    private String descricao;
    private String faixaEtaria;
    private String niveisHabilidade;
    private String turmas;
    private String horario;
    private String instrutores;
    private List<Atividade> listaAtividades;

    public Atividade(String nome, String descricao, String faixaEtaria, String niveisHabilidade, String turmas, String horario, String instrutores) {
        this.idatividade = ++countAtividade;
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtaria = faixaEtaria;
        this.niveisHabilidade = niveisHabilidade;
        this.turmas = turmas;
        this.horario = horario;
        this.instrutores = instrutores;
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

    public String getTurmas() {
        return turmas;
    }

    public void setTurmas(String turmas) {
        this.turmas = turmas;
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

    public static void visualizarAtividadesCadastradas(List<Atividade> listaAtividades) {
        System.out.println("\n##### MODULO DE LISTAGEM DE ATIVIDADES #####");
        for (Atividade atividade : listaAtividades) {
            System.out.println("ID da atividade: " + atividade.getIdatividade());
            System.out.println("Nome: " + atividade.getNome());
            System.out.println("Descricao: " + atividade.getDescricao());
            System.out.println("Faixa etaria indicada: " + atividade.getFaixaEtaria());
            System.out.println("Niveis de habilidade: " + atividade.getNiveisHabilidade());
            System.out.println("Turmas: " + atividade.getTurmas());
            System.out.println("Horarios: " + atividade.getHorario());
            System.out.println("--------------------------");
        }
    }
}   