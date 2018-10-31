
package tema6;

/**
 *
 * @author rau10
 */
public class EJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int i;
        
        num = (int)(Math.random()*11);
        
        for (i = 1; i <= 20; i++) {
            num = (int)(Math.random()*11);
            System.out.print(num);
            System.out.print(" ");
        }
    }
    
}
