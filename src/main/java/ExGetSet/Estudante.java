
package ExGetSet;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class Estudante {
    public static void main(String[] args) {
        
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        System.out.println("Digite seu nome completo: ");
        String nome = teclado1.nextLine();
        
        System.out.println("Digite sua matrícula: ");
        int matricula = teclado2.nextInt();
        
        EstudanteClass p1 = new EstudanteClass(nome, matricula);
      
        System.out.println("Seu nome: " + p1.getNome());
        System.out.println("Sua matrícula: " + p1.getMatricula());
        
        
        System.out.println("\nDigite um novo Apelido: ");
        nome = teclado1.nextLine();
        p1.setNome(nome);
        
        System.out.println("Digite uma nova Matrícula: ");
        matricula = teclado2.nextInt();
        p1.setMatricula(matricula);
        
        System.out.println("Novo apelido: " + p1.getNome());
        System.out.println("Nova matrícula: " + p1.getMatricula());
        
      
        teclado1.close();
        teclado2.close();
    }          
}
    

