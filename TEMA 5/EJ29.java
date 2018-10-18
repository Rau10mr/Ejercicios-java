
public class EJ29 {
    public static void main(String[] args) {
        
        String l;
        int n;
        int d;
        int i;
        
        i = 1;
        
        System.out.println("Introduce un número:");
        l = System.console().readLine();
        n = Integer.parseInt(l);
        System.out.println(" ");
        
        System.out.println("Introduzca un divisor:");
        l = System.console().readLine();
        d = Integer.parseInt(l);
        System.out.println(" ");
        
        while (i <= n){
          
          if (i % d != 0){
            System.out.println(i);
          }
          
          i++;
        }
        
  }
}
