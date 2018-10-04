

public class EJ3 
{
  public static void main(String[] args) 
  {
  
  String L;
  int n;
  
  System.out.println("Introduce un numero del 1 al 7");

  L=(System.console().readLine());
  n= Integer.parseInt(L);
  
  switch(n)
  {
    case n=1:
      System.out.println("LUNES");
      break;
    case n=2:
      System.out.println("MARTES");
      break;
    case n=3:
      System.out.println("MIÉRCOLES");
      break;
    case n=4:
      System.out.println("JUEVES");
      break;
    case n=5:
      System.out.println("VIERNES");
      break;
    case n=6:
      System.out.println("SÁBADO");
      break;
    case n=7:
      System.out.println("DOMINGO");
      break;
      
    default:
      if (n<=0)
      {
        System.out.println("Domingo de la semana anterior,");
        System.out.println("Tienes que superarlo, te haces mayor.");
      }
      System.out.println("Numero no válido");
      
  }
  
  }
}
