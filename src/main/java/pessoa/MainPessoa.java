
package pessoa;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class MainPessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);

        
        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        
        Pessoa p = new Pessoa(nome, idade);
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
            
        ///////////////
        
        System.out.println("\nDigite um novo nome: ");
        nome = teclado2.nextLine();
        p.setNome(nome);
        
        System.out.println("Digite uma nova idade: ");
        idade = teclado2.nextInt();
        p.setIdade(idade);
        
        System.out.println("Novo nome: " + p.getNome());
        
        System.out.println("Nova idade: " + p.getIdade());
        
        teclado.close();
        teclado2.close();
        
    }
}
