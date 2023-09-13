public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligarMotor() {
        System.out.println("Carro ligou o motor");
    }
}