// Aluno: Marco Antonio Nitsche - Turma: 2° TADS

public class UsaTv {
    public static void main(String[] args) {
        
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        System.out.println("===== Objeto tv1 =====");
        tv1.canal = 51;
        tv1.volume = 18;
        
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        
        tv1.trocarCanal(10);
        
        tv1.mostrar();

        System.out.println("===== Objeto tv2 =====");
        tv2.canal = 48;
        tv2.volume = 15;

        tv2.aumentarVolume();
        tv2.aumentarVolume();
        tv2.aumentarVolume();
        tv2.aumentarVolume();
        tv2.aumentarVolume();
        
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();
        tv2.diminuirVolume();

        tv2.trocarCanal(6);

        tv2.mostrar();
    }  
}