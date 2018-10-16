
public class EJ17 {
  public static void main(String[] args) {
  
    double n;
    double i;
    double s;
    String l;
    
    System.out.println("HOla, introduzca un numero positivo,");
    System.out.println("se sumará con los 100 números siguientes.");
    l = System.console().readLine();
    n = Double.parseDouble(l);
    System.out.println(" ");
    
    s = n;
    
    while (n<0){
      System.out.println("Introduzca un número positivo.");
      l = System.console().readLine();
      n = Double.parseDouble(l);
      System.out.println(" ");
    }
    
    System.out.println(" ");
    
    for (i = 0; i < 100; i++){
      
      s = s + (n + i);
      
    }
      System.out.println("La suma es: "+s);
  }
}
