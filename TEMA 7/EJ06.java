
package tema7;

import java.util.Scanner;

/**
 *
 * @author rau10
 */
public class EJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] n;
        n = new int[15];
        int i;
        
        System.out.println("Introduzca 15 numeros.");
        System.out.println("Rotarán la posición con el siguiente");
        
        for (i=0; i<=14; i++){
            
            if (i<14){
                n[i+1] = Integer.parseInt(s.nextLine());    
            }
            if (i==14){
                n[0] = Integer.parseInt(s.nextLine());
            }
        }
            
        
        for (i=0; i<=14; i++){
            System.out.println("Pos: "+i+"  num: "+n[i]);
        }
    }
}
