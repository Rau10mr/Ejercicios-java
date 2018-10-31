
package tema6;

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
        int numal;
        
        
        numal=(int) ((Math.random()*101) *2);
        i=1;
        while (numal!=24){
            numal=(int)(Math.random()*101)*2;
            System.out.println(numal);
            i++;
        }
        System.out.print("Se han generado: "+i+" numeros hasta encontrar el 24.");
    }
    
}
