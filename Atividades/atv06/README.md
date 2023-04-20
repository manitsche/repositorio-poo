# Arquivo README.md - Atv06

### Nesse exercício, basicamente deve ser criado um sistema que calcule por quantos meses deverá ser guardado um valor fixo mensal até que se atinja o moltante desejado. O valor que será depositado mensalmente, e o moltante são informados pelo usuário. 

## Código:
~~~
package atv06;

import java.util.*;

public class atv06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double deposito, montante, juros;
        double saldo = 0.0;
        int meses = 0;

        System.out.print("Digite o valor do depósito fixo mensal: ");
        deposito = in.nextDouble();
        System.out.print("Digite o valor do montante desejado: ");
        montante = in.nextDouble();

        while (saldo < montante) {
            saldo = saldo + deposito;
            juros = saldo * 0.005;
            saldo = saldo + juros;
            meses = meses + 1;
        }

        System.out.println("Serão necessários " + meses + " meses para acumular o montante desejado");
    }
}
~~~

### Saída:
~~~
Digite o valor do depósito fixo mensal: 200
Digite o valor do montante desejado: 2000 
Serão necessários 10 meses para acumular o montante desejado
~~~