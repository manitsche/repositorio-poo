# Arquivo README.md - Atv02

### Esse exercício solicita dois números inteiros ao usuário, de forma que o cursor do mouse fica na mesma linha dos textos durante a digitação. A seguir, o programa mostra o resultado do produto entre esses dois números. Por fim, conforme solicitado, existe um comentário no código, afirmando que que esse programa serve de exemplo quanto a programas de cálculo para folhas de pagamento.

## Código:

~~~
import java.util.*;

public class atv02 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a, b, c;
        
        System.out.print("Informe um inteiro: ");
        b = in.nextInt();
        System.out.print("Informe um inteiro: ");
        c = in.nextInt();

        a = b * c;

        System.out.print("O produto de " + b + " e " + c + " é: " + a);

        // Este programa serve de exemplo quanto a programas de cálculo para folhas de pagamento
    }
}
~~~

## Saida:

~~~
Informe um inteiro: 2
Informe um inteiro: 3

O produto de 2 e 3 é 6
~~~