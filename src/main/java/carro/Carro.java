
package carro;

/**
 *
 * @author Natã
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    
    //Construtor
    public Carro (String m, String mod, int a){
        this.marca = m;
        this.modelo = mod;
        this.ano = a;
    }
    
    //metodos get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    
    //metodos set
    public void setMarca(String m){
        this.marca = m;
    }
    public void setModelo(String mod){
        this.modelo = mod;
    }
    public void setAno(int a){
        this.ano = a;
    }
    
}
