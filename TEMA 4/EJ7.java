

public class EJ7 {
  public static void main(String[] args) {
  
  double n1;
  double n2;
  double n3;
  double S;
  double MED;
  String L;
  
  System.out.println("Vamos a calcular la media de 3 notas"); 
  System.out.println(" ");
  
  System.out.println("Primera nota: ");
  L=System.console().readLine();
  n1=Double.parseDouble(L);
  System.out.println(" ");
  
  System.out.println("Segunda nota: ");
  L=System.console().readLine();
  n2=Double.parseDouble(L);
  System.out.println(" ");
  
  System.out.println("Tercera nota: ");
  L=System.console().readLine();
  n3=Double.parseDouble(L);
  System.out.println(" ");
  
  S=n1+n2+n3;
  MED=S/3;
  
  System.out.println("Media: " +MED);

  }
}
