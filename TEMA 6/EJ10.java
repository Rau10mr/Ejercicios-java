
package tema6;

/**
 *
 * @author rau10
 */
public class EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i;
        int car;
        String caracter;
        int ncar;
        int ncaresc;
        
        ncaresc=0;
        
        for (i=1; i<=10; i++){
            car = (int) Math.random()*6;
            switch (car){
                case 0:
                    caracter ="*";
                break;
                case 1:
                    caracter ="-";
                break;
                case 2:
                    caracter ="=";
                break;
                case 3:
                    caracter =".";
                break;
                case 4:
                    caracter ="|";
                break;
                case 5:
                    caracter ="@";
                break;
                default:
                    caracter ="null";
            }
            ncar =(int) (Math.random()*40) +1;
            
            while (ncaresc<ncar){
                System.out.print(caracter);
                ncaresc++;
            }
        }
    }
    
}
