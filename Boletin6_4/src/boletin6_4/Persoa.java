
package boletin6_4;


public class Persoa {
    private String nome = "VACIO";
    private Float peso = 0.0f;
    
    public Persoa(){
    }
    public Persoa (String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    public String getNome(){
        return this.nome;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
}
