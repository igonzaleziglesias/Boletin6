package boletin6_7;

import javax.swing.JOptionPane;

public class Areas {

    public void cadrado() {
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce o lado do cadrado"));
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + lado * lado);

    }

    public void triangulo() {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce a base do triangulo"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce a altura do triangulo"));
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base * altura)/2);

    }

    public void circulo() {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce o radio do circulo"));
        double area= radio * radio * Math.PI;
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + (float)area);
    }

}
