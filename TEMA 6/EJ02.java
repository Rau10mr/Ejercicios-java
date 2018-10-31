
package tema6;

/**
 *
 * @author rau10
 */
public class EJ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nupalo;
        int nucard;
        String nompalo;
        String nomcard;
        
        nupalo =(int)(Math.random()*4);
        nucard =(int)((Math.random()*13)+1);
        
        switch (nupalo) {
            case 0:
                nompalo ="picas";
            break;
            case 1:
                nompalo ="treboles";
            break;
            case 2:
                nompalo ="corazones";
            break;
            case 3:
                nompalo ="diamantes";
            break;
            default:
                nompalo ="null";
        }
        
        switch (nucard) {
            case 1:
                nomcard ="A";
            break;
            case 11:
                nomcard ="J";
            break;
            case 12:
                nomcard ="Q";
            break;
            case 13:
                nomcard ="K";
            break;
            default:
                nomcard = String.valueOf(nucard);
        }
        
        System.out.println("Te ha tocado: "+nomcard+" de "+nompalo);
    }
    
}
