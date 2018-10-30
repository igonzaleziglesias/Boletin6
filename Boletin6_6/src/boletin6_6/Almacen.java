package boletin6_6;

import javax.swing.JOptionPane;

public class Almacen {

    public void tipoConsumo(Productos producto1) {
        if (producto1.getVentas() > 1000) {
            JOptionPane.showMessageDialog(null, "Artigo de consumo de primeira necesidade");
        } else if ((producto1.getVentas() <= 1000) && (producto1.getVentas() > 500)) {
            JOptionPane.showMessageDialog(null, "Artigo de consumo de alta necesidade");

        } else if ((producto1.getVentas() <= 500) && (producto1.getVentas() > 100)) {
            JOptionPane.showMessageDialog(null, "Artigo de consumo de media necesidade");

        } else if (producto1.getVentas() < 100) {
            JOptionPane.showMessageDialog(null, "Artigo de consumo de baixa necesidade");

        }

    }

}
