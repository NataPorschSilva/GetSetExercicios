
package ExGetSet;

/**
 *
 * @author Natã
 */
public class LivroClass {
    private String titulo; 
    private int capitulos;
    private String autor;
   
    
    public LivroClass(String t, int c, String a){
        
        this.titulo = t;
        this.capitulos = c;
        this.autor = a;
        
        
    }   
    public String getTitulo(){
    return this.titulo;
    }
    public void setTitulo(String t){
    this.titulo = t;  
    }
    public int getCapitulos(){
    return this.capitulos;
    }
    public void setCapitulos(int c){    
    this.capitulos = c;
    }
    public String getAutor(){
    return this.autor;
    }
    public void setAutor(String a){    
    this.autor = a;
    }
    
    public void status(){
        System.out.println("INFORMAÇÕES SOBRE O PRODUTO");
        System.out.println("Título: " + this.titulo);
        System.out.println("Capitulos: " + this.capitulos);
        System.out.println("Autor: " + this.autor);
    }
}
