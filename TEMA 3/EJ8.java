

public class EJ8 {
  public static void main(String[] args) {
  
  String L;
  double H;
  double SS;
  
  System.out.println("Introduce las horas trabajadas esta semana: " );
  L = System.console().readLine();
  H = Integer.parseInt( L );
  
  SS = 12 * H;

  System.out.println("Salario semanal: " + SS);
  }
}
