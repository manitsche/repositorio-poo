# Arquivo README.md - Atv05

### Esse exercício envolve o cálculo dos gastos de uma empresa em um trimestre, e também, um cálculo de média dos gastos mensais. Levendo em conta o enunciado, basta criar as variáveis e formatar os valores. Para isso, foram importadas duas bibliotecas específicas, a **Locale**, que é responsável por ajustar os valores numéricos das variáveis relacionadas para o real brasileiro, e a  **NumberFormat**, que é responsável por formatar os valores em sí.

## Código:
~~~
package atv05;

import java.text.NumberFormat;
import java.util.Locale;

public class BalancoTrimestral {

    public static void main(String[] args) {
        
        // Ajusta os valores numéricos para reais
        Locale ptBR = new Locale("pt", "BR");
        
        float gastosJaneiro = (float) 30000;
        float gastosFevereiro = (float) 33030.77;
        float gastosMarco = (float) 23899.01;

        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        float media = gastosTrimestre / 3;

        // Formata os valores, e mostra os valores formatados em reais na tela
        String valorFormatado = NumberFormat.getCurrencyInstance(ptBR).format(gastosTrimestre);
        System.out.println(valorFormatado);
        String mediaMensal = NumberFormat.getCurrencyInstance(ptBR).format(media);
        System.out.println("Valor da média mensal = " + mediaMensal);
   }
}
~~~

## Saída:
~~~
R$ 86.929,78
Valor da média mensal = R$ 28.976,59
~~~