
public class EJ11 {
  public static void main(String[] args) {
  
    int n;
    int i;
    int n2;
    int n3;
    String l;
    
    i = 0;
    n = 0;
    
    System.out.println("HOla, se mostraran 5 numeros con sus cuadrados y cubos");
    System.out.println("a partir del que se introduzca");
    System.out.println(" ");
    l = System.console().readLine();
    n = Integer.parseInt(l);
    System.out.println(" ");
    
    for (i = 0; i < 5; i++) {
      n2 = n * n;
      n3 = n * n * n;
      System.out.println("numero: " + n + "  cuadrado: " + n2 + "  cubo: " + n3);
      n++;
    }
  }
}
