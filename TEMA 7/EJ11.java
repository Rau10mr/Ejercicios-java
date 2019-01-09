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
public class EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] num;
        num = new int[10];
        int[] array;
        array = new int[10];
        
        int i;
        
        Scanner s = new Scanner(System.in);
        /*------------------------*/
        
        System.out.println("Introduce 10 números: ");
        
        for (i=0; i<10; i++){
        array[i] = Integer.parseInt(s.nextLine());
        }

    }
}