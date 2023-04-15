# Arquivo README.md - Atv01

### Esse exercício apresenta a soma de todos os números informados, enquanto o usuário quiser informá-los, que podem ser dos tipos inteiro ou real.

## Código:

~~~
package atv01;

import java.util.*;

public class atv01 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double opcao = -1;
        double soma = 0;

        do {
            try {
                System.out.print("Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): ");
                opcao = in.nextDouble();
                soma = soma + opcao;
            } catch (Exception e) {
                in.nextLine();
            }
        } while (opcao != 0);
        System.out.println("O resultado da soma é: " + soma);
        in.close();
    }
}
~~~

## Saída:

~~~
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 5
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 1
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 1
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 1
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 2
Digite um número para incrementar a soma (para finalizar e visualizar o resultado digite 0): 0
O resultado da soma é: 35.0
~~~