

public class EJ5 {
  public static void main(String[] args) {
  
  double x;
  double a;
  double b;
  String L;
  
  
  System.out.println("Vamos a resolver una ecuación del tipo: ");
  System.out.println("ax+b=0");
  System.out.println("Para ello, tendras que introducir... ");
  System.out.println(" ");
  
  System.out.println("El valor de 'a'");
  L=System.console().readLine();
  a=Double.parseDouble(L);
  System.out.println(" ");
  
  System.out.println("El valor de 'b'");
  L=System.console().readLine();
  b=Double.parseDouble(L);
  System.out.println(" ");
  
  x=(-b)/a;
  
  System.out.println("x=" +x);

  }
}
