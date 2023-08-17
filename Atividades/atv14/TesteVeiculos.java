public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        Moto moto = new Moto("Honda", "CBR 1000RR", 2023, 1000);

        System.out.println();
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}