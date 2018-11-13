/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author rau10
 */
public class EJ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i;
        int[] num;
        num = new int[8];
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce 8 numeros enteros:");
        
        for (i=0; i<8; i++){
            num[i] = Integer.parseInt(s.nextLine());    
        }
        
        System.out.println(" ");
        
        for (i=0; i<8; i++){
            
            if (num[i] % 2 == 0){
                System.out.println(num[i]+ " par");
            } else {
                System.out.println(num[i]+ " impar");
            }    
        }
        
    }
    
}
