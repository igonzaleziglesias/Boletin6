
package boletin6_6;


public class Productos {
    private String nomeProducto;
    private int numeroVentas;
    
    public Productos(){
        nomeProducto="Vacio";
        numeroVentas=0;
    }
    
    public Productos(String nomeProducto, int numeroVentas){
        this.nomeProducto=nomeProducto;
        this.numeroVentas=numeroVentas;
    }
    
    public void setNome(String nomeProducto){
        this.nomeProducto=nomeProducto;
    }
    public void setVentas(int numeroVentas){
        this.numeroVentas=numeroVentas;
    }
    public String gettNome(){
        return nomeProducto;
    }
    public int getVentas(){
        return numeroVentas;
    }
    
    
    
}




