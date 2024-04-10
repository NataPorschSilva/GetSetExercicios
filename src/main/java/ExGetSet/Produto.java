
package ExGetSet;

import java.util.Scanner;
import pessoa.Pessoa;

/**
 *
 * @author Natã
 */
public class Produto {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        System.out.println("Digite o produto: ");
        String nome = teclado1.nextLine();
        
        System.out.println("Digite o preço: ");
        int preço = teclado2.nextInt();
        
        ProdutoClass p1 = new ProdutoClass(nome, preço);
      
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreço());
        
        
        System.out.println("\nDigite um novo Produto: ");
        nome = teclado1.nextLine();
        p1.setNome(nome);
        
        System.out.println("Digite um novo preço: ");
        preço = teclado2.nextInt();
        p1.setPreço(preço);
        
        System.out.println("Novo produto: " + p1.getNome());
        System.out.println("Novo preço: " + p1.getPreço());
        
      
        teclado1.close();
        teclado2.close();
    }          
}
