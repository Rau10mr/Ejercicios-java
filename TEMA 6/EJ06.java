
package tema6;

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
        
        int num;
        int numusu;
        int i;
        
        i = 0; 
        
        Scanner s = new Scanner(System.in); 
        System.out.print("Introduce un numero del 1 al 100: ");
        numusu = Integer.parseInt(s.nextLine());
        
        num = (int) Math.random()*101;
        
        while (i<5 && numusu!=num){
        System.out.println("Nope");
        System.out.println(" ");
        Scanner t = new Scanner(System.in); 
        System.out.print("Introduce otro: ");
        numusu = Integer.parseInt(s.nextLine());
        System.out.print(num);
        i++;
        }
        
        if (numusu==num){
            System.out.print("Enhorabuena¡ has acertado.");
        }
        else {
            System.out.print("Has perdido...");
        }
    
    }
    
}
