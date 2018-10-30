package boletin6_4;

import javax.swing.JOptionPane;

public class Datos {

    private Persoa pers1 = new Persoa();
    private Persoa pers2 = new Persoa();

    public void Pesar() {
        pers1.setNome((JOptionPane.showInputDialog("Introduce o nome: ")));
        pers1.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Introduce o peso de: ")));

        pers2.setNome((JOptionPane.showInputDialog("Introduce o nome: ")));
        pers2.setPeso(Float.parseFloat((JOptionPane.showInputDialog("Introduce o peso de: "))));

    }

    public void pesaMais() {
        if (pers1.getPeso() > pers2.getPeso()) {

            JOptionPane.showMessageDialog(null, pers1.getNome() + " pesa " + (pers1.getPeso() - pers2.getPeso()) + " kg mais que " + pers2.getNome());
        } else if (pers1.getPeso() < pers2.getPeso()) {
            JOptionPane.showMessageDialog(null, pers2.getNome() + " pesa " + (pers2.getPeso() - pers1.getPeso()) + " kg mais que " + pers1.getNome());

        } else {
            JOptionPane.showMessageDialog(null, pers1.getNome()+" e "+pers2.getNome()+"Pesan o mesmo");
        }

    }
}
