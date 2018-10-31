
package tema6;

/**
 *
 * @author rau10
 */
public class EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int i;
        
        for (i=1; i<=50; i++){
            num =(int)((Math.random()*100)+100);
            System.out.print(num);
            System.out.print(" ");
        }
    }
    
}
