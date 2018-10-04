

public class EJ6 {
  public static void main(String[] args) {
  
  String L;
  int B;
  int H;
  int AT;
  
  System.out.println("Introduce la base del triangulo " );
  L = System.console().readLine();
  B = Integer.parseInt( L );
  
  System.out.println("Introduce la altura " );
  L = System.console().readLine();
  H = Integer.parseInt( L );
  
  AT = (B * H) / 2;
  
  System.out.println("Area del triangulo: " + AT);
  }
}
