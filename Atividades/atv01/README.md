# Arquivo README.md - Atv01

### Esse exercício apresenta a soma de todos os números informados, nesse caso, foram usados dois, que podem ser dos tipos inteiro ou real.

## Código:

~~~
import java.util.*;

public class atv01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float n1, n2, soma;

        try {
            System.out.println("Informe o primeiro número: ");
            n1 = in.nextFloat();
            System.out.println("Informe o segundo número: ");
            n2 = in.nextFloat();
            soma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + soma);
        } catch (java.util.InputMismatchException e) {
            System.out.print("");
        }
    }
}
~~~

## Saída:

~~~
Informe o primeiro número:
1
Informe o segundo número:
2
1.0 + 2.0 = 3.0
~~~