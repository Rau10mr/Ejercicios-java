

public class EJ1 
{
  public static void main(String[] args) 
  {
  
  String DIA;
  
  System.out.println("Introduce un dia de la semana");
  System.out.println("(entre lunes y viernes)");
  System.out.println("para saber que hay a primera hora");
  
  DIA = (System.console().readLine());
  DIA.toLowerCase();
  
  switch(DIA)
  {
    case "lunes":
      System.out.println("Toca EED");
      break;
    case "martes":
      System.out.println("Toca SINF");
      break;
    case "miercoles":
    case "miércoles":
    case "jueves":
      System.out.println("Toca PRO");
      break;
    case "viernes":
      System.out.println("Toca SINF");
      break;
      
    default:
      System.out.println("Dia no válido");
  }
  
  }
}
