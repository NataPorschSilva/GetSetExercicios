
package carro;

/**
 *
 * @author Natã
 */
public class MainCarro {
    public static void main(String[] args) {
        
        Carro c = new Carro("Toyota ", "Corolla ",2024);
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
        
        System.out.println("\n");
        
        c.setMarca("Toyota");
        c.setModelo("Corolla");
        c.setAno(2024);
        System.out.println(c.getMarca());
        System.out.println(c.getModelo());
        System.out.println(c.getAno());
        
    }      
}
