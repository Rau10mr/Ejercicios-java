

public class EJ4 {
  public static void main(String[] args) {
  
  String L;
  double H;
  double HE;
  double SS;
  
  System.out.println("Introduce las horas trabajadas esta semana: " );
  L = System.console().readLine();
  H = Integer.parseInt( L );
  
  if (H>0)
  {
    if (H<=40)
    {
      SS = 12 * H;
      System.out.println("Salario semanal: " + SS);
    }
    if (H>40)
    {
      HE=H-40;
      H=40;
      SS=(H*12)+(HE*16);
      System.out.println("Salario semanal: " + SS);
    }
  }
  else
  {
    System.out.println("Debemos tener un minimo de horas");
  }
  
  }
}
