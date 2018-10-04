

public class EJ1 {
  public static void main(String[] args) {
  
  String L;
  int n1;
  int n2;
  int mult;
  
  System.out.println("Introduzca un numero");
  L = System.console().readLine();
  n1 = Integer.parseInt( L );

  System.out.println("Introduce otro numero");
  L = System.console().readLine();
  n2 = Integer.parseInt( L );
  
  mult = n1 * n2;
  
  System.out.println("El producto de ambos números es: " + mult);
  
  }
}
