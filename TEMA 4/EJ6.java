

public class EJ6 {
  public static void main(String[] args) {
  
  double h;
  double t;
  String L;
  
  System.out.println("Vamos a calcular lo que tarda"); 
  System.out.println("un objeto en caer");
  System.out.println(" ");
  
  System.out.println("Ingresa el valor de la altura (en metros): ");
  L=System.console().readLine();
  h=Double.parseDouble(L);
  System.out.println(" ");
  
  t=Math.sqrt((2*h)/9.81);
  
  System.out.println("Tarda " +t+ "s en caer");

  }
}
