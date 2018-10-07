

public class EJ8 {
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
  
  if (MED<5)
  {
    System.out.println("INSUFICIENTE");
  }
  
  if (MED>=5)&&(MED<=6)
  {
    System.out.println("BIEN");
  }
  
  if (MED>=7)&&(MED<=8)
  {
    System.out.println("NOTABLE");
  }
  
  if (MED>=9)&&(MED<10)
  {
    System.out.println("SOBRESALIENTE");
  }
  
  if (MED=10)
  {
    System.out.println("MATRICULA DE HONOR");
  }
  
  System.out.println("Media: " +MED);

  }
}
