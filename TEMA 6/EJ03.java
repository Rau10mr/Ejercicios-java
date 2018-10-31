
package tema6;

/**
 *
 * @author rau10
 */
public class EJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nupalo;
        int nucard;
        String nompalo;
        String nomcard;
        
        nupalo =(int)(Math.random()*4);
        nucard =(int)((Math.random()*10)+1);
        
        switch (nupalo) {
            case 0:
                nompalo ="espadas";
            break;
            case 1:
                nompalo ="oros";
            break;
            case 2:
                nompalo ="copas";
            break;
            case 3:
                nompalo ="bastos";
            break;
            default:
                nompalo ="null";
        }
        
        switch (nucard) {
            case 1:
                nomcard ="As";
            break;
            case 8:
                nomcard ="Sota";
            break;
            case 9:
                nomcard ="Caballo";
            break;
            case 10:
                nomcard ="Rey";
            break;
            default:
                nomcard = String.valueOf(nucard);
        }
        
        System.out.println("Te ha tocado: "+nomcard+" de "+nompalo);
    }
    
}
