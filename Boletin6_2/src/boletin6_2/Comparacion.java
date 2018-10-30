package boletin6_2;

import javax.swing.JOptionPane;

public class Comparacion {

    public void maiorIgual() {
        Short num1 = Short.parseShort(JOptionPane.showInputDialog("teclea un numero : "));
        Short num2 = Short.parseShort(JOptionPane.showInputDialog("teclea un numero : "));

        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "resta: " + (num1 - num2));
        }
        JOptionPane.showMessageDialog(null, "suma: " + (num1 + num2));

    }
}
