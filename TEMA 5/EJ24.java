
public class EJ24 {
    public static void main(String[] args) {
        
        String l;
        int i;
        int n;
        int h;
        int esp;
        
        h = 1;
        
        System.out.println("Introduzca un número.");
        System.out.println("Se creará una pirámidde en función de ese número.");
        l = System.console().readLine();
        n = Integer.parseInt(l);
        System.out.println(" ");
        
        esp = n - 1;
        
        while (h <= n){
          
        for (i = 1; i <= esp; i++){
          System.out.print(" ");
        }
        
        for (i = 1; i < h; i++){
          System.out.print(i);
        }
        
        for (i = h; i > 0; i--){
          System.out.print(i);
        }
        
        System.out.println(" ");
        
        h++;
        esp--;
      }
    }
    
}
