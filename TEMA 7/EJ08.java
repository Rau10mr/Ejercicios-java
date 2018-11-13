package tema7;

import java.util.Scanner;

/**
 *
 * @author rau10
 */
public class EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] temp;
        temp = new int[12];
        Scanner s = new Scanner(System.in);
        int i;
        int cont = 0;
        
        System.out.println("Introduce la temperatura media de cada mes de un año a elegir");
        
        for (i=0; i<12; i++){
        temp[i] = Integer.parseInt(s.nextLine());    
        }
        
        while (cont<12){
        
            switch (cont){
                case 0:
                    System.out.print("Enero");
                break;
                case 1:
                    System.out.print("Febrero");
                break;
                case 2:
                    System.out.print("Marzo");
                break;
                case 3:
                    System.out.print("Abril");
                break;
                case 4:
                    System.out.print("Mayo");
                break;
                case 5:
                    System.out.print("Junio");
                break;
                case 6:
                    System.out.print("Julio");
                break;
                case 7:
                    System.out.print("Agosto");
                break;
                case 8:
                    System.out.print("Septiembre");
                break;
                case 9:
                    System.out.print("Octubre");
                break;
                case 10:
                    System.out.print("Noviembre");
                break;
                case 11:
                    System.out.print("Diciembre");
                break;
            }
            
            System.out.print(": ");
            
            for (i=0; i<=temp[cont-1]; i++){
                System.out.print("=");    
            }
            
        cont++;
        }
    }
}
