
public class EJ10 {
  public static void main(String[] args) {
  
    int n;
    int s;
    int i;
    double med;
    String l;
    
    i = 0;
    s = 0;
    n = 0;
    
    System.out.println("HOla, vamos a calcular la media de los números");
    System.out.println("POSITIVOS que deseas.");
    System.out.println(" ");
    System.out.println("Para terminar, introduce un número negativo");
    l = System.console().readLine();
    n = Integer.parseInt(l);
    System.out.println(" ");
    
    while (n >= 0) {
      s = s + n;
      i++;
      System.out.println("Introduce otro numero, para terminar introduce uno negativo");
      l = System.console().readLine();
      n = Integer.parseInt(l);
      System.out.println(" ");
    
    }
    
    med = s / i;
    
    System.out.println("La media de los numero introducidos es: "+med);
    
  }
}
