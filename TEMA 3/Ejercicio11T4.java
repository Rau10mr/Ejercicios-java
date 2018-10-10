

public class Ejercicio11T4 {
  public static void main(String[] args) {
  
  String L;
  int MB;
  int KB;
  
  System.out.println("Cantidad de KBs a convertir: ");
  L = System.console().readLine();
  KB = Integer.parseInt( L );
  
  MB = KB / 1024;
  
  System.out.println("Son " + MB + " MBs");
  
  }
}
