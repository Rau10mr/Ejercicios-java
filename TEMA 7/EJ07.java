package tema7;

import java.util.Scanner;

/**
 *
 * @author rau10
 */
public class EJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        int[] array;
        array = new int[100];
        int i;
        int pos1;
        int pos2;
        int var; //variable para la rotacion de los datos
        
        for (i=0; i<100; i++){
            n = (int)(Math.random()*21);
            array[i] = n;
            System.out.print(array[i]+" ");
        }
        
        System.out.println(" ");
        System.out.println("Introduce dos posiciones del array");
        pos1 = Integer.parseInt(s.nextLine());
        pos2 = Integer.parseInt(s.nextLine());
        
        while (pos1>100 || pos1<0 || pos2>100 || pos2<0){
            System.out.println("Introduce dos posiciones del array VALIDAS");
            pos1 = Integer.parseInt(s.nextLine());
            pos2 = Integer.parseInt(s.nextLine());
        }
        pos1 = pos1 - 1;
        pos2 = pos2 - 1;
        
        var = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = var;
        
        for (i=0; i<100; i++){
            if (i == pos1 || i == pos2){
                System.out.print("'");
            }
            
            System.out.print(array[i]+" ");
            
            if (i == pos1 || i == pos2){
                System.out.print("'");
            }
        }
    }
    
}
