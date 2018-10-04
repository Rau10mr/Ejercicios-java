

public class EJ2 
{
  public static void main(String[] args) 
  {
  
  String L;
  int HORA;
  
  System.out.println("Introduce la hora");
  L= System.console().readLine();
  HORA = Integer.parseInt(L);
  
  if ((HORA>=6) && (HORA<=12))
  {
      System.out.println("BUENOS DIAS");
  }
  
  if ((HORA>=13) && (HORA<=20))
  {
    System.out.println("BUENAS TARDES");
  }
    
  if ((HORA<=5) && (HORA>=21))
  {
    System.out.println("BUENAS NOCHES");
  }
  
  if ((HORA>=24)||(HORA<0))
  {
    System.out.println("HORA NO VALIDA");
  }
  
  }
}
