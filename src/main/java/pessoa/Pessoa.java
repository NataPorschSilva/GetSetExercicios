
package pessoa;

/**
 *
 * @author Natã
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    //contrutor
    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }
    
    //metodo get
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    
    //metodo set
    void setNome(String n){
        this.nome = n;
    }
    void setIdade(int i){
        this.idade = i;
    }
}
