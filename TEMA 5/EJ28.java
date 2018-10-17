

public class EJ28 {
    public static void main(String[] args) {
        
        String l;
        int ni;
        int i;
        int f;
        
        i = 1;
        f = 1;
        
        System.out.println("Introduce un número.");
        System.out.println("Se calculará el factorial");
        l = System.console().readLine();
        ni = Integer.parseInt(l);
        System.out.println(" ");
        
        while (i <= ni){
          
          f = i * f;
          
          i++;
        }
        
        System.out.println(ni+"! = "+f);
    }
  }
