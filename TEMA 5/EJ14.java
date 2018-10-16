
public class EJ14 {
  public static void main(String[] args) {
  
    int n;
    int ne;
    int i;
    int e;
    String l;
    
    ne = 1;
    
    System.out.println("HOla, introduzca un numero: ");
    l = System.console().readLine();
    n = Integer.parseInt(l);
    
    System.out.println(" ");
    
    System.out.println("Introduce ahora a qué exponente elevarlo");
    l = System.console().readLine();
    e = Integer.parseInt(l);
    
    
    for (i = 0; i < e ; i++) {
      ne = ne * n;
    }
    System.out.println(" ");
    System.out.println(n + "^" + e + "=" + ne);
    
  }
}
