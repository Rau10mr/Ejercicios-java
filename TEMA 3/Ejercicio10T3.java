

public class Ejercicio10T3 {
  public static void main(String[] args) {
  
  String L;
  int MB;
  int KB;
  
  System.out.println("Cantidad de MBs a convertir: ");
  L = System.console().readLine();
  MB = Integer.parseInt( L );
  
  KB = MB * 1024;
  
  System.out.println("Son " + KB + " KBs");
  
  }
}
