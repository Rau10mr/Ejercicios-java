/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.parte2;

import java.util.Scanner;

/**
 *
 * @author Raúl y Alejandro (Ejercicio realizado en equipo)
 */
public class EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int[][] array = new int [8][8];
        int x,y;
        char posx;
        String [] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduca la posicion de la figura: (Ej: d7) ");
        String posicion = s.nextLine();
        
        y = (posicion.charAt(1) - 48);
         
        x = (posicion.charAt(0) - 97);

        int xfija = x;
        int yfija = y;
        
        // Diagonal superior derecha //
       
        System.out.print("Posiciones en diagonal superior derecha: ");
        while (x < 8 && y < 8) {
            x = x + 1;
            y = y + 1;
            System.out.print(letras[x] + y + " ");
        }
        
        x = xfija;
        y = yfija;
            // Diagonal superior izquierda //
            System.out.println("");
            System.out.print("Posiciones en diagonal superior izquierda: ");
            while (x < 8 && y < 8) {
            
            x = x - 1;
            y = y + 1;
            System.out.print(letras[x] + y + " ");
                       
        }
        x = xfija;
        y = yfija;
            // Diagonal inferior derecha //
            System.out.println("");
            System.out.print("Posiciones en diagonal inferior derecha: ");
            while (x < 8 && y < 8) {
            
            x = x + 1;
            y = y - 1;
            System.out.print(letras[x] + y + " ");        
        }
            
        x = xfija;
        y = yfija;
        
            // Diagonal inferior izquierda //
            System.out.println("");
            System.out.print("Posiciones en diagonal inferior izquierda: ");
                                                        while (x < 8 && y < 8) {
            
            x = x - 1;
            y = y - 1;
            switch (x) {
                case 0:
                    System.out.print("a" + y + " ");
                    break;
                case 1:
                    System.out.print("b" + y + " ");
                    break;
                case 2:
                    System.out.print("c" + y + " ");
                    break;                
                case 3:
                    System.out.print("d" + y + " ");
                    break;                
                case 4:
                    System.out.print("e" + y + " ");
                    break;                
                case 5:
                    System.out.print("f" + y + " ");
                    break;                
                case 6:
                    System.out.print("g" + y + " ");
                    break;                
                case 7:
                    System.out.print("h" + y + " ");
                    break;
            }
                       
        }
    }
    
}
