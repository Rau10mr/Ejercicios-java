
public class EJ12 {
  public static void main(String[] args) {
  
    int n;
    int i;
    String l;
    int n1;
    int n2;
    int n3;
    
    n1 = 0;
    n2 = 1;
    n3 = 0;
    i = 0;
    n = 0;
    
    System.out.println("HOla, se mostraran tantos numeros de la serie de Fibonacci");
    System.out.println("como se indiquen:");
    System.out.println(" ");
    l = System.console().readLine();
    n = Integer.parseInt(l);
    System.out.println(" ");
    System.out.println(n1);
    System.out.println(n2);
    
    n = n - 2;
    
    for (i = 0; i < n ; i++) {
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
