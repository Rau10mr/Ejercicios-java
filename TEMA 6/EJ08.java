
package tema6;

/**
 *
 * @author rau10
 */
public class EJ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numal;
        int numal2;
        int numal3;
        int i;
        
        for (i=1; i<=15; i++){
            numal =(int) (Math.random()*6);
            switch (numal){
                case 0:
                    System.out.print("1");
                break;
                case 1:
                    System.out.print("1");
                break;
                case 2:
                    System.out.print("1");
                break;
                case 3:
                    System.out.print("X");
                break;
                case 4:
                    System.out.print("X");
                break;
                case 5:
                    System.out.print("2");
                break;
            }
            System.out.print("   ");

            numal2 =(int) (Math.random()*6);
            switch (numal2){
                case 0:
                    System.out.print("1");
                break;
                case 1:
                    System.out.print("1");
                break;
                case 2:
                    System.out.print("1");
                break;
                case 3:
                    System.out.print("X");
                break;
                case 4:
                    System.out.print("X");
                break;
                case 5:
                    System.out.print("2");
                break;
            }
            System.out.print("   ");

            numal3 =(int) (Math.random()*6);
            switch (numal3){
                case 0:
                    System.out.print("1");
                break;
                case 1:
                    System.out.print("1");
                break;
                case 2:
                    System.out.print("1");
                break;
                case 3:
                    System.out.print("X");
                break;
                case 4:
                    System.out.print("X");
                break;
                case 5:
                    System.out.print("2");
                break;
            }
            System.out.println("   ");
        }
        
        numal =(int) (Math.random()*6);
        switch (numal){
            case 0:
                System.out.print("Bono: 1");
            break;
            case 1:
                System.out.print("Bono: 1");
            break;
            case 2:
                System.out.print("Bono: 1");
            break;
            case 3:
                System.out.print("Bono: X");
            break;
            case 4:
                System.out.print("Bono: X");
            break;
            case 5:
                System.out.print("Bono: 2");
            break;
        }
    }
}
