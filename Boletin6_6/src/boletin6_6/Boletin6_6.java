
package boletin6_6;

public class Boletin6_6 {

    
    public static void main(String[] args) {
        Productos producto1 = new Productos();
        Productos producto2 = new Productos();
        Productos producto3 = new Productos();
        
        producto1.setVentas(399);
        producto2.setVentas(700);
        producto3.setVentas(1230);
        
        Almacen almacen1 = new Almacen();
        almacen1.tipoConsumo(producto1);
        almacen1.tipoConsumo(producto2);
        almacen1.tipoConsumo(producto3);

    }
    
}
