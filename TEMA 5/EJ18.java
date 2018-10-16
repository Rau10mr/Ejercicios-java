
public class EJ18 {
  public static void main(String[] args) {
  
    double n1;
    double n2;
    double i;
    String l;
    
    System.out.println("HOla, introduzca un numero positivo,");
    l = System.console().readLine();
    n1 = Double.parseDouble(l);
    System.out.println(" ");
    
    System.out.println("Introduzca otro numero distinto del anterior");
    l = System.console().readLine();
    n2 = Double.parseDouble(l);
    System.out.println(" ");
    
    while (n2==n1){
    System.out.println("Introduzca otro numero distinto del anterior");
    l = System.console().readLine();
    n2 = Double.parseDouble(l);
    System.out.println(" ");    
    }
    
    i=n1;
    
    while (i<n2){
      i = i + 7;
      System.out.println(+i);
    }
  }
}
