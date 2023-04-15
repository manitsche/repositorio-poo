# Arquivo README.md - Atv03

### Esse exercício trata de cálculo de média, onde devem ser solicitadas as notas de duas provas e um trabalho ao usuário, e o programa deve retornar a média, considerando essas ativides e os valores informados. Para a entrada de dados, a classe JOptionPane deve ser utilizada.

## Código:

~~~
package atv03;

import javax.swing.JOptionPane;

public class atv03 {

    public static void main(String[] args) {

        String strNotaProva1, strNotaProva2, strNotaTrabalho;
        double p1, p2, t1, media;
        
        strNotaProva1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        p1 = Double.parseDouble(strNotaProva1);
        strNotaProva2 = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        p2 = Double.parseDouble(strNotaProva2);
        strNotaTrabalho = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        t1 = Double.parseDouble(strNotaTrabalho);

        media = (p1 + p2 + t1) / 3;

        JOptionPane.showMessageDialog(null, "A média, considerando as três atividades é " + media);
   }
}
~~~