package boletin6_5;

import javax.swing.JOptionPane;

public class Numeros {

    private int num1, num2, num3 = 0;

    public Numeros() {
        num1 = 1;
        num2 = 2;
        num3 = 3;
    }

    public Numeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void pedirNumeros() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o primeiro numero a comprar: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o segundo numero a comprar: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o terceiro numero a comprar: "));
    }

    public void compararNumeros() {

        if ((num1 == num2) && (num2 == num3)) {
            JOptionPane.showMessageDialog(null, " Os numeros son iguais");
        } else if ((num1 > num2) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, num1 + " É o numero maior");

        } else if ((num2 > num1) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, num2 + " É o numero maior");

        } else if ((num3 > num1) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, num3 + " É o numero maior");
        } else if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "O primeiro e o segundo numero son iguais e son os maiores");

        } else if (num1 == num3) {
            JOptionPane.showMessageDialog(null, "O primeiro e o terceiro numero son iguais e son os maiores");

        } else if (num2 == num3) {
            JOptionPane.showMessageDialog(null, "O segundo e o terceiro numero son iguais e son os maiores");
        }

    }

}
