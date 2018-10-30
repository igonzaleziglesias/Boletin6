package boletin6_7;

import javax.swing.JOptionPane;

public class Boletin6_7 {

    public static void main(String[] args) {
        String[] opciones = {"0", "1", "2"};

        int opcion = JOptionPane.showOptionDialog(
                null,
                "Calcular a superficie de: Cadrado(0), Triangulo(1) o Circulo(2)",
                "Elige una opcion?",
                JOptionPane.DEFAULT_OPTION // Tipo de opciones
                ,
                 JOptionPane.INFORMATION_MESSAGE // Tipo de mensaje (icono)
                ,
                 null // Icono (ninguno)
                ,
                 opciones,
                null
        );
        
        
       /* if (opcion > 2) {
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
        } else if (opcion <= 0) {
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");

        }*/
       
        Areas area=new Areas();
        switch (opcion){
            case 0: area.cadrado();break;
            case 1: area.triangulo();break;
            case 2: area.circulo();break;
                
        }
    
    }

}
