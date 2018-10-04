

public class EJ7 {
  public static void main(String[] args) {
  
  String L;
  double BI;
  double PT;
  double SUB;
  
  System.out.println("Introduce la base imponible" );
  L = System.console().readLine();
  BI = Integer.parseInt( L );
  
  PT = BI * 1.21;
  SUB = BI * 0.21;

  System.out.println("Subida de Iva: " + SUB);
  System.out.println("Precio Total: " + PT);
  
  }
}
