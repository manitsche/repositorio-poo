public class ExercicioPolimorfismo {
    public static void main(String[] args) {
 
        Veiculo carro = new Carro("Toyota", "Corolla");
        Veiculo moto = new Moto("Honda", "CBR");
        Veiculo caminhao = new Caminhao("Scania", "R124");

        carro.ligarMotor();
        moto.ligarMotor();
        caminhao.ligarMotor();
    }
}