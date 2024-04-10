
package ExGetSet;

/**
 *
 * @author Natã
 */
public class EstudanteClass {
    private String nome; 
    private int matricula;
    
    public EstudanteClass(String n, int m){
        
        this.nome = n;
        this.matricula = m;
        
        
    }   
    public String getNome(){
    return this.nome;
    }
    public void setNome(String n){
    this.nome = n;  
    }
    public int getMatricula(){
    return this.matricula;
    }
    public void setMatricula(int m){    
    this.matricula = m;
    }
    
    public void status(){
        System.out.println("INFORMAÇÕES SOBRE O PRODUTO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.matricula);
        }
    }
    

