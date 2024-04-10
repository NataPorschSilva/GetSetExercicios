
package ExGetSet;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class Livro {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        System.out.println("Digite o Título do livro: ");
        String titulo = teclado1.nextLine();
        
        System.out.println("Digite os capítulos: ");
        int capitulos = teclado2.nextInt();
        
        System.out.println("Digite o Autor: ");
        String autor = teclado1.nextLine();
        
        LivroClass Lc = new LivroClass(titulo, capitulos, autor);
      
        System.out.println("Título: " + Lc.getTitulo());
        System.out.println("Capítulos: " + Lc.getCapitulos());
        System.out.println("Autor: " + Lc.getAutor());
        
        System.out.println("\nDigite um novo títulos: ");
        titulo = teclado1.nextLine();
        Lc.setTitulo(titulo);
        
        System.out.println("Digite novos capítulos: ");
        capitulos = teclado2.nextInt();
        Lc.setCapitulos(capitulos);
        
        System.out.println("Digite um novo autor: ");
        autor = teclado1.nextLine();
        Lc.setAutor (autor);
        
        System.out.println("Novo apelido: " + Lc.getTitulo());
        System.out.println("Nova matrícula: " + Lc.getCapitulos());
        
      
        teclado1.close();
        teclado2.close();
    }          
}
   