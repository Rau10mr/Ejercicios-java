/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.parte2;

/**
 *
 * @author rau10
 */
public class EJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] array;
        array = new int[3][6];
        
        //valores en la fila 0
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        //valores en la fila 1
        array[1][0] = 75;
        array[1][4] = 0;
        //valores en la fila 2;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;
        
        System.out.println("ARRAY NUM | COLUMNA 0 | COLUMNA 1 | COLUMNA 2 | COLUMNA 3 | COLUMNA 4 | COLUMNA 5 | COLUMNA 6 |");
        System.out.println("FILA 0    |    "+array[0][0]+"      |    "+array[0][1]+"     |    "+array[0][2]+"      |           |           |    "+array[0][5]+"      |          |");
        System.out.println("FILA 1    |    "+array[1][0]+"     |           |           |           |     "+array[1][4]+"    |           |           |");
        
    }
    
}
