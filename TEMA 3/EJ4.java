

public class EJ4 {
  public static void main(String[] args) {
  
  String L;
  int n1;
  int n2;
  int suma;
  int resta;
  int mult;
  double div;
  
  System.out.println("Introduce un numero " );
  L = System.console().readLine();
  n1 = Integer.parseInt( L );
  
  System.out.println("Introduce otro numero " );
  L = System.console().readLine();
  n2 = Integer.parseInt( L );
  
  suma = n1 + n2;
  resta = n1 - n2;
  mult = n1 * n2;
  div = n1 / n2;
  
  System.out.println("Suma: " + suma);
  System.out.println("Diferencia: " + resta);
  System.out.println("Producto: " + mult);
  System.out.println("Cociente: " + div);
  }
}
