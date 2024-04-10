
package ExGetSet;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class ProdutoClass {
    
    private String nome; 
    private int preço;
    
    public ProdutoClass(String n, int p){
        
        this.nome = n;
        this.preço = p;
        
        
    }   
    public String getNome(){
    return this.nome;
    }
    public void setNome(String n){
    this.nome = n;  
    }
    public int getPreço(){
    return this.preço;
    }
    public void setPreço(int p){    
    this.preço = p;
    }
    
    public void status(){
        System.out.println("INFORMAÇÕES SOBRE O PRODUTO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preço);
        }
    }

