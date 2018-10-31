
package tema6;
/**
 * @author rau10
 */
public class EJ01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int dado1;
        int dado2;
        int dado3;
        
        dado1 = (int)(Math.random()*6) +1;
        dado2 = (int)(Math.random()*6) +1;
        dado3 = (int)(Math.random()*6) +1;
        
        System.out.println("Se tiran tres dados, resultados:");
        System.out.println(" ");
        System.out.println(+dado1);
        System.out.println(+dado2);
        System.out.println(+dado3);
    }
    
}
