/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.parte2;

import java.util.Scanner;

/**
 *
 * @author rau10
 */
public class EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array;
        array = new int[4][5];
        Scanner s = new Scanner(System.in);
        int i;
        int it; //i especializada para contar en los bucles del array "total"
        int x;
        int y;
        
    //sumas:
        
//sumas de las filas:
        int[] sumax;
        sumax = new int[4];
        
        sumax[0]=0;
        sumax[1]=0;
        sumax[2]=0;
        sumax[3]=0;
        
//sumas de las columnas:
        int[] sumay;
        sumay = new int[5];
    
        sumay[0]=0;
        sumay[1]=0;
        sumay[2]=0;
        sumay[3]=0;
        sumay[4]=0;
        
//suma total
        int[] total;
        total = new int[10];
   
        System.out.println("Introduce 20 numeros");
        //lectura de numeros por teclado
        for (x=0; x<5; x++){
            for (y=0; y<4; y++){
                array[x][y] = Integer.parseInt(s.nextLine());
            }
        }
        
        //suma de las filas
        for (i=0; i<4; i++){
            for (y=0; y<4; y++){
                for (x=0; x<5; x++){
                    sumax[i] = sumax[i] + array[x][y];
                }
            }
        }
        
        //suma de las columnas
        for (i=0; i<5; i++){
            for (x=0; x<5; x++){
                for (y=0; y<4; y++){
                    sumay[i] = sumay[i] + array[x][y];
                }
            }
        }
        
        //suma total
        //leo las sumas de las filas en el array "total"
        for (it=0; it<4; it++){
            total[it] = sumax[it];
        }
        
        i=0;
        //leo las sumas de las columnas en el array "total"
        for (it=4; it<8; it++){                                 //it cuenta para el array "total", como al principio 'it' es equiparabla a i, puedo usarlo como tal con 'sumax[]'. Después 'it' sigue contando por su cuenta, por lo que lo tengo que diferenciar de i.
            total[it] = sumay[i];
            i++;
        }
        
        //sumo
        total[10]=0;
        for (i=0; i<9; i++){
            total[10]= total[10] + total[i];
        }
    }
}
    

