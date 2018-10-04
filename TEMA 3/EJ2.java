

public class EJ2 {
  public static void main(String[] args) {
  
  String L;
  int EU;
  int PES;
  
  System.out.println("Cantidad de euros a convertir: ");
  L = System.console().readLine();
  EU = Integer.parseInt( L );
  
  PES = EU * 166;
  
  System.out.println("Son " + PES + " pesetas");
  
  }
}
