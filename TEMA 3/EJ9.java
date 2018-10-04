

public class EJ9 {
  public static void main(String[] args) {
  
  String L;
  double H;
  double R;
  double V;
  double R2;
  
  System.out.println("Introduce la altura del cono: " );
  L = System.console().readLine();
  H = Integer.parseInt( L );
    
  System.out.println("Introduce el radio: " );
  L = System.console().readLine();
  R = Integer.parseInt( L );

  R2 = R * R;
  V = Math.PI * R2 * H /3;

  System.out.println("Volumen del cono: " + V);
  }
}
