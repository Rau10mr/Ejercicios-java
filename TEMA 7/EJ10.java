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
public class EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int num;
        
        int numpar[]; //array de  numeros pares
        numpar = new int[20];
        int cpar; //contador de numeros pares
        
        int numimp[]; //array de numeros impares
        numimp = new int[20];
        int cimp; //contador numeros impares
        
        int array[]; //array total
        array = new int[20];
        
        Scanner s = new Scanner(System.in);
        int i;
        
        cpar = 0;
        cimp = 0;
        
        for (i=0; i<20; i++){
            num =(int)(Math.random()*101);
            System.out.println(num);
            
            if (num % 2 == 0){
                numpar[cpar] = num;
                cpar++;
            } else {
                numimp[cimp] = num;
                cimp++;
            } 
        }
        System.out.println("--------------------");
        System.out.println(" ");
        
        for (i=0; i<20; i++){
            System.out.print(numpar[i]+ " ");
            System.out.println(numimp[i]);
            if (numpar[i] == 0){
                i=20;
            }
        }
        i=0;
        
        for (cpar=cpar; cpar>0; cpar--){
            numpar[i] = array[i];
            i++;
        }
        for (cimp=cimp; cimp>0; cimp--){
            numimp[i] = array[i];
            i++;
        }
        
        System.out.println("Array creada: ");
        for (i=0; i<20; i++){
            System.out.println(array[i]);
        }
    }
    
}
