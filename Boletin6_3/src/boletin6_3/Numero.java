
package boletin6_3;

import javax.swing.JOptionPane;


public class Numero {
    public void positivoNegativo(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero : "));
        
        if (num1>0){
            JOptionPane.showMessageDialog(null, "+");
        } else if (num1<0){
            JOptionPane.showMessageDialog(null, "-");
        } else {
            JOptionPane.showMessageDialog(null, "0");
        }  

    
    }
}
