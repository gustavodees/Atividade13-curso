package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double total = 0;


        int a = Integer.parseInt(JOptionPane.showInputDialog("""
                1| Cachorro Quente | R$ 4.00\s
                2| X-Salada      | R$ 4.50\s
                3| X-Bacon      | R$ 5.00\s
                4| Torrada Simples| R$2.00
                5| Refrigerante     | R$ 1.50\s"""));


        if(a==1){
            int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade deste item: "));
            total = quantidade1 * 4.0;

        }
        else if (a == 2) {
            int quantidade2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade deste item: "));
            total = quantidade2 * 4.5;
        }
        else if (a == 3) {
            int quantidade3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade deste item: "));
            total = quantidade3 * 5.0;
        }
        else if (a == 4) {
            int quantidade4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade deste item: "));
            total = quantidade4 * 2.0;
        }
        else if (a == 5) {
            int quantidade5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade deste item: "));
            total = quantidade5 * 1.5;
            }

            JOptionPane.showMessageDialog(null,"Você deve pagar: " + "R$ " + total);




    }
}