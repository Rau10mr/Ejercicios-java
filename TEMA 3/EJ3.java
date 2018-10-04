

public class EJ3 {
  public static void main(String[] args) {
  
  String L;
  int EU;
  int PES;
  
  System.out.println("Cantidad de pesetas a convertir: ");
  L = System.console().readLine();
  PES = Integer.parseInt( L );
  
  EU = PES / 166;
  
  System.out.println("Son " + EU + " euros");
  
  }
}
