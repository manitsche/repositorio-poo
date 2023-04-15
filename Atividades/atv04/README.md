# Arquivo README.md - Atv04

### Esse exercício envolve o cálculo dos gastos de uma empresa em um trimestre. Levendo em conta o enunciado, basta criar as variáveis e formatar os valores. Para isso, foram importadas duas bibliotecas específicas, a **Locale**, que é responsável por ajustar os valores numéricos das variáveis relacionadas para o real brasileiro, e a  **NumberFormat**, que é responsável por formatar os valores em sí.

## Código:
~~~
package atv04;

import java.text.NumberFormat;
import java.util.Locale;

public class BalancoTrimestral {

    public static void main(String[] args) {
        
        // Ajusta o valor numérico para reais
        Locale ptBR = new Locale("pt", "BR");
        
        float gastosJaneiro = (float) 30000;
        float gastosFevereiro = (float) 33030.77;
        float gastosMarco = (float) 23899.01;

        float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        // Formata o valor, e mostra os valor formatado em real na tela
        String valorFormatado = NumberFormat.getCurrencyInstance(ptBR).format(gastosTrimestre);
        System.out.println(valorFormatado);
    }
}
~~~

## Saída:
~~~
R$ 86.929,78
~~~