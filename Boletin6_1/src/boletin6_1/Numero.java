package boletin6_1;

import javax.swing.JOptionPane;

public class Numero {
    public void positivo(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero : "));
        if (num>0) JOptionPane.showMessageDialog(null, "É positivo");
    }
}
