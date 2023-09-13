public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligarMotor() {
        System.out.println("Caminhao ligou o motor");
    }
}