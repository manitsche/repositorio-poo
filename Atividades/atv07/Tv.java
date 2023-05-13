// Aluno: Marco Antonio Nitsche - Turma: 2° TADS

public class Tv {

    public int volume;
    public int canal;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int c) {
        canal = c;
    }

    public void mostrar() {
        System.out.println("Volume: " + volume + "\nCanal: " + canal);
    }
}