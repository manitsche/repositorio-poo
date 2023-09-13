public class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligarMotor() {
        System.out.println("Moto ligou o motor");
    }
}