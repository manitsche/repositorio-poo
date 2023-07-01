public class Emprestimo {
    private double valorTotal;
    private double taxaJuros;
    private int numeroParcelas;
    private int parcelaAtual;

    public Emprestimo(double valorTotal, double taxaJuros, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
        this.parcelaAtual = 1;
    }

    public double proximaParcela() {
        if (parcelaAtual <= numeroParcelas) {
            double valorParcela = valorTotal / numeroParcelas;
            double jurosParcela = valorParcela * taxaJuros / 100.0;
            parcelaAtual++;
            return valorParcela + jurosParcela;
        }
        return -1;
    }

    public static void main(String[] args) {
       
        Emprestimo E1 = new Emprestimo(1000.0, 1.5, 5);
        Emprestimo E2 = new Emprestimo(2000.0, 2.0, 3);
        double parcelaE1, parcelaE2;
        
        do {
            parcelaE1 = E1.proximaParcela();
            parcelaE2 = E2.proximaParcela();

            if (parcelaE1 != -1 && parcelaE2 != -1) {
                System.out.println("Parcela E1: " + parcelaE1);
                System.out.println("Parcela E2: " + parcelaE2);
                System.out.println();
            } else if (parcelaE1 != -1) {
                System.out.println("Parcela E1: " + parcelaE1);
            } else if (parcelaE2 != -1) {
                System.out.println("Parcela E2: " + parcelaE2);
            }

        } while (parcelaE1 != -1 || parcelaE2 != -1);
    }
}
