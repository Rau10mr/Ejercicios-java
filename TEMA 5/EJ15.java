
public class EJ15 {
  public static void main(String[] args) {
  
    double n;
    int i;
    int e;
    String l;

    System.out.println("HOla, introduzca una base: ");
    l = System.console().readLine();
    n = Double.parseDouble(l);
    
    System.out.println(" ");
    
    System.out.println("Introduce ahora a qué exponente elevarlo");
    l = System.console().readLine();
    e = Integer.parseInt(l);
    
    
    for (i = 1; i <= e ; i++) {
    System.out.println(" ");
    System.out.println(n + "^" + i);
    
    }
    
  }
}
