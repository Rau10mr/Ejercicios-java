

public class EJ5 {
  public static void main(String[] args) {
  
  String L;
  int B;
  int H;
  int AR;
  
  System.out.println("Introduce la base del rectangulo " );
  L = System.console().readLine();
  B = Integer.parseInt( L );
  
  System.out.println("Introduce la altura " );
  L = System.console().readLine();
  H = Integer.parseInt( L );
  
  AR = B * H;
  
  System.out.println("Area del rectangulo: " + AR);
  }
}
