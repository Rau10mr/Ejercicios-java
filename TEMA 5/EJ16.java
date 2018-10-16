
public class EJ16 {
  public static void main(String[] args) {
  
    double n;
    double i;
    double r;
    String l;

    System.out.println("HOla, introduzca un numero para saber si es primo");
    l = System.console().readLine();
    n = Double.parseDouble(l);
    
    System.out.println(" ");
    
    for (i = 2; i <= n; i++){
      
      r = n % i;
      
      if (r == 0){
        System.out.println("Su numero no es primo");
        i = n;
      }
      else {
        System.out.println("Su numero es primo");
        i = n;
      }
      
    }
    if (n==1 || n==0){
      System.out.println("Su numero es primo");
    }
  }
}
